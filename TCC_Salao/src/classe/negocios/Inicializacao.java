package classe.negocios;

public class Inicializacao {
    private String atendente;
    private String valorInicio;
    //criar lista com atendente e valor
    
    //construtor abertura de caixa
    public Inicializacao(String atendente, String valor){
        this.atendente = atendente;
        this.valorInicio = valor;
        System.out.println(atendente);
        System.out.println(valor);
    }
    
    //Metodos
//    public double fechamento(String atendente, String valor){
//        return this.valorInicio - valor;
//    }
    
//    public Boolean sangria(String atendente, String valor){
//        if(this.valorInicio >= valor){
//            this.valorInicio = this.valorInicio - valor;
//            //passar atendente pra lista
//            return true;
//        }        
//        return false;
//    }
    //metodo get
//    public Double getValorInicio(){
//        return this.valorInicio;
//    }
    //metodo set
    public Boolean setSoma(Double valor){
        this.valorInicio = this.valorInicio + valor;
        return true;
    }
    
}
