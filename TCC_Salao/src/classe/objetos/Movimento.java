package classe.objetos;

import Enum.TiposMovimento;
import Telas.FrenteCaixa;
import classe.genericas.Configuracao;
import classe.negocios.Inicializacao;
import javax.swing.JOptionPane;

public class Movimento {
    private TiposMovimento id_Tipo_movimento;
    private Inicializacao inicializacao;
    private String valor;
    private String atendente;
    private Configuracao config = new Configuracao();
    private FrenteCaixa frm = new FrenteCaixa();
    
    public Movimento(TiposMovimento id_Tipo_movimento, Inicializacao inicializacao){
        this.id_Tipo_movimento = id_Tipo_movimento;
        this.inicializacao = inicializacao;
   }
    ///////////////////////////////SET///////////////////////////////
    public boolean setTipo(TiposMovimento indice){
        this.id_Tipo_movimento = indice;
        return true;
    }
    public void addVA(String valor, String atendente){
        this.atendente = atendente;
        this.valor = valor;
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
                addVA(valor, atendente);
                if(inicializacao.getAberto()){//troco
                    inicializacao.setTroco(valor);
                    JOptionPane.showMessageDialog(null, "Troco adicionado ao caixa");
                }else{ //inicializa
                    if(inicializacao.Inicializar(atendente, valor)){
                        JOptionPane.showMessageDialog(null, "Caixa aberto");
                        config.tela("Frente de Caixa", frm);  
                    }else{
                        JOptionPane.showMessageDialog(null, "Erro ao abrir caixa");
                    }
                }
                break;
            case SAQUE:
                if(inicializacao.getAberto()){//cx aberto
                    if(JOptionPane.showConfirmDialog(null,"Atendente: "+ atendente+". \n Valor: "+valor,
                            "Confirmação", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE)==0){
                        if(inicializacao.delValor(valor)){
                            JOptionPane.showMessageDialog(null, "retirada ok"); 
                            addVA(valor, atendente);
                        }else{
                            JOptionPane.showMessageDialog(null, "Valor maior que o saldo em caixa");
                        }
                    }else{
                        JOptionPane.showMessageDialog(null, "Operação Cancelada"); 
                    } 
                }else{// cx fechado
                    JOptionPane.showMessageDialog(null, "Por favor, Abrir o caixa antes da operação");
                }
                break;
            case FECHAMENTO:
                if(inicializacao.getAberto()){ //cx aberto
                    if(JOptionPane.showConfirmDialog(null,"Atendente: "+ atendente+". \n Valor: "+valor,
                            "Confirmação", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE)==0){
                        if(!inicializacao.fechar(valor)){
                            addVA(valor, atendente); 
                        }else{
                            JOptionPane.showMessageDialog(null, "Operação Cancelada");
                        }
                    }else{
                        JOptionPane.showMessageDialog(null, "Operação Cancelada"); 
                    }
                }else{//cx fechado
                    JOptionPane.showMessageDialog(null, "Por favor, Abrir o caixa antes da operação");
                }
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
