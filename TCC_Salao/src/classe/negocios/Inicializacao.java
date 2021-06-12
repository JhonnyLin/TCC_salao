package classe.negocios;

import javax.swing.JOptionPane;

public class Inicializacao {
    private Double valorInicio;
    private Double valorTotal;
    private Double valorRetirada;
    private String atendente;
    private boolean aberto;
    //criar lista com atendente e valor
    
    //construtor abertura de caixa
    public Inicializacao(){
        this.aberto = false;
        this.valorTotal = 0.0;
        this.valorInicio = 0.0;
        this.valorRetirada = 0.0;
    }
    
    //Metodos
    public boolean fechar(String valor){
        double x = Double.parseDouble(valor);
        if(this.valorTotal == x){
            this.valorInicio = 0.0;
            this.valorTotal = 0.0;
            return this.aberto = false; 
        }else if(JOptionPane.showConfirmDialog(null,"Caixa não bate, aceita a diferença? \n "+ (x-valorTotal)+ "",
                            "Confirmação", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE)==0){
            this.valorInicio = 0.0;
            this.valorTotal = 0.0;
            return this.aberto = false; 
        }  
        return true;
    }
            
    public boolean Inicializar(String valor){
        setTroco(valor);
        return this.aberto = true;
    }
    
    public void setTroco(String valor){
        this.valorInicio = this.valorInicio + Double.parseDouble(valor);
        addValor(valor);
    }
    //pagamento total
    public void addValor(String valor){
        this.valorTotal = this.valorTotal + Double.parseDouble(valor);
    }
    //saque 
    public boolean delValor(String valor){
        double x = Double.parseDouble(valor);
        if(this.valorTotal >= x){
            this.valorTotal = this.valorTotal - x; 
            this.valorRetirada = this.valorRetirada + x;
            return true;
        }  
        return false;
    }
    
/////////////////////////////////////GET////////////////////////////
    public boolean getAberto(){
        return this.aberto;
    }
    public Double getVlTotal(){
        return this.valorTotal;
    }    
    public Double getVlInicial(){
        return this.valorInicio;
    }    
    public Double getVlRetirada(){
        return this.valorRetirada;
    }
    public String getAtendente(){
        return this.atendente;
    }

    
}
