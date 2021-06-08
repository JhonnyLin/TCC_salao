package classe.objetos;

import Enum.TiposPagamento;

public class Pagamento {
    private TiposPagamento id_TipoPagamento;
    private double vl_Pagamento;
    //private Atendimento atendimento;
    
    public Pagamento(TiposPagamento id_TipoPagamento, double vl_Pagamento ){
        this.id_TipoPagamento = id_TipoPagamento;
        this.vl_Pagamento = vl_Pagamento;
    }

    ////////////////////////////SET///////////////////////////////
    public boolean setPagamento(TiposPagamento tiposMovimentos){
        this.id_TipoPagamento = tiposMovimentos;
        return true;
    }
    public boolean setAtendimento(int indice){
        this.vl_Pagamento = indice;
        return true;
    }
    
    ///////////////////////////////GET///////////////////////////////
    public TiposPagamento getPagamento(){
        return this.id_TipoPagamento;
    }
    
    public double getValor(){
        return this.vl_Pagamento;
    }    
    ///////////////////////////////C\BD//////////////////////////////
    //inserir
    public boolean inserirBD(String id_atendimento){
        System.out.println(this.id_TipoPagamento);
        System.out.println(this.vl_Pagamento);
        System.out.println(id_atendimento);
        return false;
    }
    //excluir
    public boolean buscarBD(){
        return false;
    }
}
