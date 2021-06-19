package classe.objetos;

import ClasseBD.ConexaoBD;
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
    public String inserirPagamentoBD(String id_atendimento){
         //definindo a tabela e os campos para inserir
        String q = "INSERT INTO pagamentos (id_atendimento, id_tipo_pagamento, vl_pagamento) ";
        //colocando as variaveis na quary
        String a = "VALUES('"+ id_atendimento +"','"+ getPagamento() +"','"+ getValor() +"')";
        //teste
//        System.out.println(q+a);+

        ConexaoBD.connect();
        ConexaoBD.executar(q+a);
        ConexaoBD.desconnect();
        return q+a;
    }
    //excluir
    public boolean buscarBD(){
        return false;
    }
}
