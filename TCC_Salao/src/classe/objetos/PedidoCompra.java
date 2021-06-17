package classe.objetos;

import ClasseBD.ConexaoBD;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class PedidoCompra {
    private String id_Pedido_Compra;
    private String id_Fornecedor;
    private String data;
    private ArrayList<ItemOrcamento> item;
    
    public PedidoCompra(){
        this.id_Pedido_Compra =""; 
        this.id_Fornecedor ="";
        this.data = "";
        this.item = new ArrayList<ItemOrcamento>();
    }
    ///////////////////////////////SET///////////////////////////////
    public void setIDFornecedor(String idFornecedor){
        this.id_Fornecedor = idFornecedor;
        System.out.println(idFornecedor);
    }
    public void setData(String data){
        this.data = data;
    }
    ///////////////////////////////GET///////////////////////////////
    public String getIdForncedor(){
        return this.id_Fornecedor;
    }
    public String getData(){
        return this.data;
    }
    ///////////////////////////////EXP///////////////////////////////
     //inserir item 
    public void inserir(ItemOrcamento servProd){
        this.item.add(servProd);
    }
    
    //Excluir 
    public void exclui(ItemOrcamento servProd){
        this.item.remove(servProd);
    }
    
    ///////////////////////////////C\BD//////////////////////////////
    public void inserirPedidoCompraBD() throws SQLException{
        //definindo a tabela e os campos para inserir
        String q = "INSERT INTO pedido_compra (id_fornecedor, ds_data)";
        //colocando as variaveis na quary
        String a = "VALUES('"+ getIdForncedor() +"','"+ getData() +"')";
//        System.out.println(q+a);
        ConexaoBD.executar(q+a);
        //Devolver a ultima operação no banco
        ResultSet rs = ConexaoBD.rsexecutar( "SELECT last_insert_id()");
        rs.next();
        id_Pedido_Compra = rs.getString(1);
    }
    
    public void inserirItemOrcamento() throws SQLException{
        for(ItemOrcamento item : this.item){
            item.inserirPedidoCompraBD(this.id_Pedido_Compra);
        }
    }
}
