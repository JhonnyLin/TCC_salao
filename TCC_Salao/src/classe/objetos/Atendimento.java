package classe.objetos;

import classe.genericas.Tabela;
import classe.objetos.Item;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class Atendimento {
    private ArrayList<Item> item;
    private ArrayList<Integer> qntd;
    private String id_Cliente;
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
    
    public String getIdCliente(){
        return this.id_Cliente;
    }
    
    ///////////////////////////////SET///////////////////////////////
    public boolean setCliente(String id){
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
    //inserir item nos list e gera totais
    public void inserir(Item servProd, Tabela tbl){
        
        int x = contains(this.item, servProd);
        if(x == -1){
            if(servProd.getServico().equals("0") && 1 > servProd.getQuantidade()){
                JOptionPane.showMessageDialog(null,"Não há estoque");
                return;
            }
            tbl.inserirItem(servProd);
            this.item.add(servProd);
            this.qntd.add(1);
        }else{
            int anterior = this.qntd.get(x);
            if(servProd.getServico().equals("0") && anterior >= servProd.getQuantidade()){
                JOptionPane.showMessageDialog(null,"Não há estoque");
                return;
            }
            tbl.atualizarItem(x);
            this.qntd.set(x, ++anterior);
        }
        System.out.println(somaTotal(servProd.getValor()));
    }
      
    //Excluir item e sub(V2)
    public void exclui(Item servProd){
        this.item.remove(servProd);
        //subTotal(servProd.getValor());
    }
    
    //contem item na lista?
    public int contains(ArrayList<Item> list, Item cod){
        for(int x =0; x < list.size();x++){
                Item item  = list.get(x);
                if(item.getCodigo().equals(cod.getCodigo())){
                    return x;
                }
        }
        return -1;
    }
    
    ///////////////////////////////C\BD//////////////////////////////
    //Inserir
    //Excluir
    
    
}
