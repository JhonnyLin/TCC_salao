package classe.objetos;

import ClasseBD.ConexaoBD;
import Enum.TiposOperacoes;

public class Operacao {
    private TiposOperacoes tOp;
    private String codOperacao;
    //tentar passar uma unica string
    private String data;
    
    public Operacao(TiposOperacoes tOp, String codOperacao, String data ){
        this.tOp = tOp;
        this.codOperacao = codOperacao;
        this.data = data;
    }
    
    ///////////////////////////////SET///////////////////////////////
    public boolean setTipOperacoes(TiposOperacoes indice){
        this.tOp = indice;
        return false;
    }
    public boolean setCodOperacao(String indice){
        this.codOperacao = indice;
        return false;
    }
    public boolean setData(String data){
        this.data = data;
        return false;
    }
    
    ///////////////////////////////GET///////////////////////////////
    public TiposOperacoes getTipOperacoes(){
        return this.tOp;
    }
    public String getCodOperacao(){
        return this.codOperacao;
    }
    public String getData(){
        return this.data;
    }
    ///////////////////////////////EXP///////////////////////////////
    
    ///////////////////////////////C\BD//////////////////////////////
    //inserir
    public String inserir(){
        //definindo a tabela e os campos para inserir
        String q = "INSERT INTO operacoes (id_tipo_operacao, id_vinculado, dt_operacao) ";
        //colocando as variaveis na quary
        String a = "VALUES('"+ getTipOperacoes()+"','"+getCodOperacao()+"','18/06/2021')";
        System.out.println(q+a);
        ConexaoBD.connect();
        ConexaoBD.executar(q+a);
        ConexaoBD.desconnect();
        return q+a;
    }
    
    //alterar
    public boolean alterar(){
        return false;
    }
}
