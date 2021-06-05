package classe.objetos;

import Enum.TiposMovimento;
import Telas.FrenteCaixa;
import classe.genericas.Configuracao;
import classe.negocios.Inicializacao;
import javax.swing.JOptionPane;

public class Movimento {
    private TiposMovimento id_Tipo_movimento;
    private String valor;
    private String atendente;
    private Configuracao config = new Configuracao();
    private FrenteCaixa frm = new FrenteCaixa();
   
    
    public Movimento(TiposMovimento id_Tipo_movimento){
        this.id_Tipo_movimento = id_Tipo_movimento;
    }
    Inicializacao inicia;
    ///////////////////////////////SET///////////////////////////////
    public boolean setTipo(TiposMovimento indice){
        this.id_Tipo_movimento = indice;
        return true;
    }
    public boolean setValor(String valor){
        this.valor = valor;
        return true;
    }
    public boolean setAtendente(String atendente){
        this.atendente= atendente;
        return true;
    }
    ///////////////////////////////GET///////////////////////////////
    public TiposMovimento getTipo(){
         return this.id_Tipo_movimento;
    }
    public String getValor(){
         return this.valor;
    }
    public String getAtendente(){
         return this.atendente;
     }
    ///////////////////////////////EXP///////////////////////////////
    public void operacao(String valor, String atendente){
        switch(this.id_Tipo_movimento){
            case ABERTURA:
                this.atendente = atendente;
                this.valor = valor;
                inicia = new Inicializacao(atendente, valor);
                JOptionPane.showMessageDialog(null, "Caixa aberto");
                //interface
                config.tela("Frente de Caixa", frm);
                break;
            case SAQUE:
                this.atendente = atendente;
                this.valor = valor;
                if(JOptionPane.showConfirmDialog(null,"Atendente: "+getAtendente()+". \n Valor: "+getValor(), "Confirmação", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE)==0){
                    JOptionPane.showMessageDialog(null, "retirada ok"); 
                } 
                break;
            case FECHAMENTO:
                this.atendente = atendente;
                this.valor = valor;
                System.out.println("fechou"); 
                break;
            default: System.out.println("Default");    
        }
    }
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
