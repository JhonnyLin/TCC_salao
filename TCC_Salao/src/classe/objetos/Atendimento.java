package classe.objetos;

import classe.objetos.Item;
import java.util.ArrayList;

public class Atendimento {
    private ArrayList<Item> item;
    private ArrayList<Integer> qntd;
    private int id_Cliente;
    private double total;
    
    public Atendimento(){
        this.item = new ArrayList<Item>();
        this.qntd = new ArrayList<Integer>();
        this.total = 0.0;
    }
    ///////////////////////////////GET///////////////////////////////
    //Get Totais
    public Double getTotal(){
        return this.total;
    }
    public int id_Cliente(){
        return this.id_Cliente;
    }
    
    ///////////////////////////////SET///////////////////////////////
    public boolean Cliente(int id){
        this.id_Cliente = id;
        return true;
    }
    //Soma
    public Double somaTotal(double valor){
        return this.total = this.total + valor;
    }
    //Subitração
    public Double subTotal(double valor){
        return this.total = this.total - valor;
    }
    
   ///////////////////////////////EXP///////////////////////////////
    //inserir item e soma
    public void inserir(Item servProd){
        this.item.add(servProd);
        somaTotal(servProd.valor());
    }
    
    //Excluir item e sub
    public void exclui(Item servProd){
        this.item.remove(servProd);
        subTotal(servProd.valor());
    }
    
    ///////////////////////////////C\BD//////////////////////////////
    //Atulizar banco
    public boolean atulizarBD(int Cod, int qntd){
        for(Item item : this.item) {
           if(item.atualizarBD()){
               System.out.println("Atualizado");
           }else{
               System.out.println("Erro no banco");
           }
        }
        return false;
    }
    
    
}
