package classe.objetos;

public class Operacao {
    private int tipoOperacoes;
    private int codOperacao;
    private int usuario;
    //tentar passar uma unica string
    private String data;
    private String hora;
    
    public Operacao(int tipoOperacoes, int codOperacao,int usuario, String data ,String hora){
        this.tipoOperacoes = tipoOperacoes;
        this.codOperacao = codOperacao;
        this.usuario = usuario;
        this.data = data;
        this.hora = hora;
    }
    
    ///////////////////////////////SET///////////////////////////////
    public boolean tipOperacoes(int indice){
        this.tipoOperacoes = indice;
        return false;
    }
    public boolean codOperacao(int indice){
        this.codOperacao = indice;
        return false;
    }
    public boolean usuario(int indice){
        this.usuario = indice;
        return false;
    }
    public boolean data(String data){
        this.data = data;
        return false;
    }
    public boolean hora(String hora){
        this.hora = hora;
        return false;
    }
    
    ///////////////////////////////GET///////////////////////////////
    public int tipOperacoes(){
        return this.tipoOperacoes;
    }
    public int codOperacao(){
        return this.codOperacao;
    }
    public int usuario(){
        return this.usuario;
    }
    public String data(){
        return this.data;
    }
    public String hora(){
       return this.hora;
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
