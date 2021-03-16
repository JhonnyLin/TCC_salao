package classe;

import javax.swing.JDialog;
import javax.swing.JFrame;
public class Configuracao {
    //da pra fazer um polimorfismo
    public void telaDialog(String titulo, JDialog dialog){
        dialog.setTitle(titulo);
        dialog.setVisible(true);
    }
    
    public void telaDialog(String titulo, JFrame frame){
        frame.setTitle(titulo);
        frame.setVisible(true);
    }
    //VEr questão da interface
//    public void telaDialog(String titulo, JInternalFrame internal) {
//        Inicio ini = new Inicio();
//        ini.add(internal);
//        internal.setTitle(titulo);
//        internal.setVisible(true);        
//    }
    
    
    
}
