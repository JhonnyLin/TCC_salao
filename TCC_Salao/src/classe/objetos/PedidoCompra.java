package classe.objetos;

import java.util.ArrayList;

public class PedidoCompra {
    private int id_Fornecedor;
    private ArrayList<Item> item;
    
    public PedidoCompra(int id_Fornecedor){
        this.id_Fornecedor = id_Fornecedor;
        this.item = new ArrayList<Item>();
    }
    ///////////////////////////////SET///////////////////////////////
    
    ///////////////////////////////GET///////////////////////////////
    
    ///////////////////////////////EXP///////////////////////////////
     //inserir item 
    public void inserir(Item servProd){
        this.item.add(servProd);
    }
    
    //Excluir 
    public void exclui(Item servProd){
        this.item.remove(servProd);
    }
    ///////////////////////////////C\BD//////////////////////////////
    //inserir
    public boolean inserir() {
        return false;
    }

    //alterar
    public boolean alterar() {
        return false;
    }

    //excluir
    public boolean excluir() {
        return false;
    }
}
