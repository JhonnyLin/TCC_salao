package classe;

import javax.swing.JDesktopPane;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
public class Configuracao {
    //da pra fazer um polimorfismo
    public void tela(String titulo, JDialog dialog){
        dialog.setTitle(titulo);
        dialog.setVisible(true);
    }
    
    public void tela(String titulo, JFrame frame){
        frame.setTitle(titulo);
        frame.setVisible(true);
    }
    
    public void tela(String titulo,JInternalFrame internal, JDesktopPane desk){
        internal.setTitle(titulo);
        internal.setVisible(true);
        desk.add(internal);
    }
      //VEr questão da interface
//    public void telaDialog(String titulo, JInternalFrame internal) {
//        Inicio ini = new Inicio();
//        ini.add(internal);
//        internal.setTitle(titulo);
//        internal.setVisible(true);        
//    }
    
    
    
}
