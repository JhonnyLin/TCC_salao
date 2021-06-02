package classe.objetos;

public class Movimento {
    private int id_Tipo_movimento;
    private double valor;
    
    public Movimento(int id_Tipo_movimento, double valor ){
        this.id_Tipo_movimento = id_Tipo_movimento;
        this.valor = valor;
    }
    ///////////////////////////////SET///////////////////////////////
    public boolean tipo(int indice){
        this.id_Tipo_movimento = indice;
        return true;
    }
     public boolean valor(double valor){
        this.valor = valor;
        return true;
    }
    ///////////////////////////////GET///////////////////////////////
     public int tipo(){
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
    //alterar
    public boolean alterar(){
        return false;
    }
    //excluir
    public boolean excluir(){
        return false;
    }
}
