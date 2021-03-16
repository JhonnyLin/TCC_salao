package classe;

public class Inicializacao {
    private String atendente = "";
    private Double valorInicio = 0.00;
    //criar lista com atendente e valor
    
    //construtor abertura de caixa
    public Inicializacao(String atendente, Double valor){
        this.atendente = atendente;
        this.valorInicio = valor;
    }
    
    //Metodos
    public double fechamento(String atendente, Double valor){
        return this.valorInicio - valor;
    }
    
    public Boolean sangria(String atendente, Double valor){
        if(this.valorInicio >= valor){
            this.valorInicio = this.valorInicio - valor;
            //passar atendente pra lista
            return true;
        }        
        return false;
    }
    //metodo get
    public Double getValorInicio(){
        return this.valorInicio;
    }
    //metodo set
    public Boolean setSoma(Double valor){
        this.valorInicio = this.valorInicio + valor;
        return true;
    }
    
}
