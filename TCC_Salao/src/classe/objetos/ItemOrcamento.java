package classe.objetos;

import ClasseBD.ConexaoBD;
import java.sql.SQLException;

public class ItemOrcamento {
    private String codItem;
    private String nomeItem;// não vai pro banco só pra lista
    private String qntdItem;
    private String vlUnitario;
    
    public ItemOrcamento(String codItem, String nomeItem){
        this.codItem = codItem;
        this.nomeItem = nomeItem;
    }
    ///////////////////////////SET/////////////////////////////
    public void setCodItem(String codItem){
        this.codItem = codItem;
    }
    public void setNomeItem(String nomeItem){
        this.nomeItem = nomeItem;
    }
    public void setVlUnitario(String vlUnitario){
        this.vlUnitario = vlUnitario;
    }
    public void setQntdItem(String qntd){
        this.qntdItem = qntd;
    }
    ///////////////////////////GET/////////////////////////////
    public String getCodItem(){
        return this.codItem;
    }
    public String getNomeItem(){
        return this.nomeItem;
    }
    public String getVlUnitario(){
        return this.vlUnitario;
    }
    public String getQntdItem(){
        return  this.qntdItem;
    }
    //////////////////////////BD///////////////////////////////
    //inserir
    public String inserirPedidoCompraBD(String id_Pedido_Compra) throws SQLException{
        //definindo a tabela e os campos para inserir
        String q = "INSERT INTO item_orcamento (id_pedido_compra, id_prod, qt_orcada, vl_compra)";
        //colocando as variaveis na quary
        String a = "VALUES('"+ id_Pedido_Compra +"','"+ getCodItem() +"','"+ getQntdItem() +"','"+ getVlUnitario() +"')";
//        System.out.println(q+a);
        ConexaoBD.executar(q+a);
        return q+a;
    }
}
