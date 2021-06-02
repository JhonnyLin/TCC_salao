package classe.objetos;

public class Pagamento {
    private int id_TipoPagamento;
    private double vl_Pagamento;
    
    public Pagamento(int id_TipoPagamento,double vl_Pagamento){
        this.id_TipoPagamento = id_TipoPagamento;
        this.vl_Pagamento = vl_Pagamento;
    }
    ///////////////////////////////SET///////////////////////////////
    public boolean setPagamento(int indice){
        this.id_TipoPagamento = indice;
        return true;
    }
    public boolean setAtendimento(int indice){
        this.vl_Pagamento = indice;
        return true;
    }
    ///////////////////////////////GET///////////////////////////////
    public int getPagamento(){
        return this.id_TipoPagamento;
    }
    public double getValor(){
        return this.vl_Pagamento;
    }
    ///////////////////////////////EXP///////////////////////////////
    
    ///////////////////////////////C\BD//////////////////////////////
    //inserir
    public boolean inserir(){
        return false;
    }
    //alterar
    public boolean alterar(){
        return false;
    }
    //excluir
    public boolean excluir(){
        return false;
    }
}
