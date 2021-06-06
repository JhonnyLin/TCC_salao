package classe.negocios;

import javax.swing.JOptionPane;

public class Inicializacao {
    private Double valorInicio;
    private Double valorTotal;
    private String atendente;
    private boolean aberto;
    //criar lista com atendente e valor
    
    //construtor abertura de caixa
    public Inicializacao(){
        this.aberto = false;
        this.valorTotal = 0.0;
        this.valorInicio = 0.0;
    }
    
    //Metodos
    public boolean fechar(String valor){
        double x = Double.parseDouble(valor);
        if(this.valorTotal == x){
            this.valorInicio = 0.0;
            this.valorTotal = 0.0;
            return this.aberto = false; 
        }else if(JOptionPane.showConfirmDialog(null,"Caixa não bate, aceita a diferença? \n "+ (valorTotal-x)+ "",
                            "Confirmação", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE)==0){
            this.valorInicio = 0.0;
            this.valorTotal = 0.0;
            return this.aberto = false; 
        }  
        return true;
    }
            
    public boolean Inicializar(String atendente, String valor){
        this.atendente = atendente;
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
    //saque falta logica
    public boolean delValor(String valor){
        double x = Double.parseDouble(valor);
        if(this.valorTotal >= x){
            this.valorTotal = this.valorTotal - x; 
            return true;
        }  
        return false;
    }
    
/////////////////////////////////////GET////////////////////////////
    public boolean getAberto(){
        return this.aberto;
    }
    

    
}
