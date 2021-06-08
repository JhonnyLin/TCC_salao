package classe.objetos;

import Enum.TiposPagamento;
import classe.genericas.Tabela;
import classe.objetos.Item;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Atendimento {
    private ArrayList<Item> item;
    private ArrayList<Integer> qntd;
    private ArrayList<Pagamento> pagamento;
    private String id_Cliente;
    private double total;
    
    public Atendimento(){
        construtor();
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
    public void construtor(){
        this.item = new ArrayList<Item>();
        this.qntd = new ArrayList<Integer>();
        this.pagamento = new ArrayList<Pagamento>();
        this.id_Cliente = ""; 
        this.total = 0.0;
    }
   ///////////////////////////////EXP///////////////////////////////
    public String pagamento(TiposPagamento pagamento, double valor){
        double x = valor + pago();
        double y = x - total;
        Pagamento pg;
        if(x == total){//sem troco
            pg = new Pagamento(pagamento, valor);
            this.pagamento.add(pg);
            JOptionPane.showMessageDialog(null, "Pagamento ok");
            return "0.0";
        }else if(x > total){//com troco
            pg = new Pagamento(pagamento, valor - y );
            this.pagamento.add(pg);
            JOptionPane.showMessageDialog(null, "Troco: "+ y);
            return "0.0";
        }else{//falta pagar
            pg = new Pagamento(pagamento, valor);
            this.pagamento.add(pg);
            return ""+(y*-1);
        }
    }
    
    public double pago(){
        double soma = 0;
        if(pagamento.size()== 0){
            return 0;
        }else{
            for(Pagamento p : pagamento){
                soma = soma + p.getValor();
            }
            return soma;
        }
    }

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
        somaTotal(servProd.getValor());
    }
      
    //Excluir item e sub(V2)
//    public void exclui(Item servProd){
//        this.item.remove(servProd);
//    }
    
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
    public String id_atendimentoBD(){
        return "";
    }
    public void inserirBD(){
        //falta inserir atendimento
        for(Pagamento p : pagamento){
                p.inserirBD("teste");
        }
    }
    
    //Excluir
    
    
}
