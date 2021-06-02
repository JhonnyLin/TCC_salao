package classe.genericas;

import javax.swing.JFormattedTextField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Limpeza {
      //Limpar 1 campo por tipo
    public void limpezaCampo(JTextField txt){
        txt.setText("");
    }
    public void limpezaCampo(JFormattedTextField msc){
        msc.setText("");
    }
    public void limpezaCampos(JTextArea atx){
        atx.setText("");
    }
    
    //Limpar n Campos por tipo
    public void limparCampos(JTextField txt []){
        for(int i=0; i<txt.length; i++){
            limpezaCampo(txt[i]);
        }
    }
    public void limparCampos(JFormattedTextField msc []){
        for(int i=0; i<msc.length; i++){
            limpezaCampo(msc[i]);
        }
    }
    
    
    //Limpar idependente do tipo (criar classe generica Campos)    
    public void preencherCampos(JTextField txt [], String texto[]){
        for(int i=0; i<txt.length; i++){
            txt[i].setText(texto[i]);
        }
    }
}
