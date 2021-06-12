package classe.objetos;

import ClasseBD.ConexaoBD;
import Enum.TiposMovimento;
import Telas.FrenteCaixa;
import Telas.Resultado;
import classe.genericas.Configuracao;
import classe.negocios.Inicializacao;
import javax.swing.JOptionPane;

public class Movimento {
    private TiposMovimento id_Tipo_movimento;
    private Inicializacao inicializacao;
    private String valor;
    private int atendente;
    private Configuracao config;
    private FrenteCaixa frm;
    
    public Movimento(TiposMovimento id_Tipo_movimento, Inicializacao inicializacao, int atendente, String valor){
        this.id_Tipo_movimento = id_Tipo_movimento;
        this.inicializacao = inicializacao;
        this.atendente = atendente;
        this.valor = valor;
        this.config = new Configuracao();
        this.frm =  new FrenteCaixa();
   }
    ///////////////////////////////SET///////////////////////////////
    public boolean setTipo(TiposMovimento indice){
        this.id_Tipo_movimento = indice;
        return true;
    }
    public void addVA(String valor, int atendente){
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
    public int getAtendente(){
         return this.atendente;
     }
    ///////////////////////////////EXP///////////////////////////////
    public void operacao(){
        switch(this.id_Tipo_movimento){
            case ABERTURA:
                if(inicializacao.getAberto()){//troco
                    inserirMov();
                    inicializacao.setTroco(this.valor);
                    JOptionPane.showMessageDialog(null, "Troco adicionado ao caixa");
                }else{ //inicializa
                    if(inicializacao.Inicializar(this.valor)){
                        inserirMov();
                        JOptionPane.showMessageDialog(null, "Caixa aberto");
                        config.tela("Frente de Caixa", frm);  
                    }else{
                        JOptionPane.showMessageDialog(null, "Erro ao abrir caixa");
                    }
                }
                break;
            case SAQUE:
                if(inicializacao.getAberto()){//cx aberto
                    if(JOptionPane.showConfirmDialog(null,"Atendente: "+ atendente+". \n Valor: "+this.valor,
                            "Confirmação", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE)==0){
                        if(inicializacao.delValor(this.valor)){
                            JOptionPane.showMessageDialog(null, "retirada ok"); 
                            inserirMov();
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
                    Resultado resultado = new Resultado(null, true);
                    resultado.config(inicializacao, this.valor);
                    config.tela("Resultado", resultado);
                    if(resultado.confirmar){
                        if(!inicializacao.fechar(this.valor)){
                                inserirMov();
                            frm.dispose();//fechar a pg
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
    
//    ///////////////////////////////C\BD//////////////////////////////
//    //inserir
    public String inserirMov(){
        //definindo a tabela e os campos para inserir
        String q = "INSERT INTO movimento (id_User,ds_Tipo_movimento,vl_Movimento) ";
        //colocando as variaveis na quary
        String a = "VALUES('"+ this.atendente +"','"+ this.id_Tipo_movimento +"','"+ this.valor+"')";
        //teste
        System.out.println(q+a);
        ConexaoBD.executar(q+a);
        return q+a;
    }

}
