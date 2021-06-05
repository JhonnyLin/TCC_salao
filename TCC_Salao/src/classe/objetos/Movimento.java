package classe.objetos;

public class Movimento {
    private String id_Tipo_movimento;
    private double valor;
    
    public Movimento(String id_Tipo_movimento, double valor ){
        this.id_Tipo_movimento = id_Tipo_movimento;
        this.valor = valor;
    }
    ///////////////////////////////SET///////////////////////////////
    public boolean tipo(String indice){
        this.id_Tipo_movimento = indice;
        return true;
    }
     public boolean valor(double valor){
        this.valor = valor;
        return true;
    }
    ///////////////////////////////GET///////////////////////////////
     public String tipo(){
         return id_Tipo_movimento;
     }
     public double valor(){
         return valor;
     }
    ///////////////////////////////EXP///////////////////////////////
    ///////////////////////////////C\BD//////////////////////////////
    //inserir
    public boolean inserir(){
        return false;
    }
    //consultar
    public boolean consultar(){
        return false;
    }
    //excluir
    public boolean excluir(){
        return false;
    }
}
