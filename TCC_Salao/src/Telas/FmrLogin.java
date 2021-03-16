package Telas;


import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class FmrLogin extends javax.swing.JFrame {

    public FmrLogin() {
        initComponents();
        String fund = "/img/logo.png";
        img(fund);
        
    }

   public void img(String a){
   ImageIcon imagem = new ImageIcon(getClass().getResource(a));
   lblFundos.setIcon(new ImageIcon(imagem.getImage().getScaledInstance(lblFundos.getWidth(),lblFundos.getHeight(), Image.SCALE_SMOOTH)));
   
   }
   public void fechar(){
   int a = JOptionPane.showConfirmDialog(null,"Deseja sair","Saida",JOptionPane.YES_NO_OPTION);
   if(a== JOptionPane.YES_OPTION){
        System.exit(0);
        }else{
       repaint();
   }
   }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtLogin = new javax.swing.JTextField();
        pwrSenha = new javax.swing.JPasswordField();
        btnConect = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        lblFundos = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Login");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel1.setText("Login:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(50, 80, 60, 30);

        jLabel2.setText("Senha:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 130, 60, 30);
        getContentPane().add(txtLogin);
        txtLogin.setBounds(130, 80, 150, 30);

        pwrSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwrSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(pwrSenha);
        pwrSenha.setBounds(130, 130, 150, 30);

        btnConect.setText("Entra");
        btnConect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConectActionPerformed(evt);
            }
        });
        getContentPane().add(btnConect);
        btnConect.setBounds(90, 180, 90, 23);

        btnExit.setText("Cancelar");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit);
        btnExit.setBounds(210, 180, 90, 23);
        getContentPane().add(lblFundos);
        lblFundos.setBounds(50, 10, 280, 240);

        setSize(new java.awt.Dimension(397, 303));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void pwrSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwrSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pwrSenhaActionPerformed

    private void btnConectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConectActionPerformed
       String login[][] = {{"admin","jhonny"},{"1234","4321"}};
       String a,b;
       boolean c = false;
       
       a = txtLogin.getText();
       b = pwrSenha.getText();
       
       if(a.equals("") || b.equals("")){
            JOptionPane.showMessageDialog(null, "é obrigatorio o preenchimento dos dois campos");
        }else{
           for( int cont =0; cont <login.length;cont++ ){
            if(a.equalsIgnoreCase(login[0][cont])&& b.equalsIgnoreCase(login[1][cont])){
                c = true;
                break;
            }
            
          } 
           if(c){
               Inicio fmr = new Inicio();
               JOptionPane.showMessageDialog(null, "Bem vindo");
               fmr.setVisible(true);
               setResizable(false);
               setLocationRelativeTo(this);
               dispose();
               
           }else{
               JOptionPane.showMessageDialog(null, "senha ou usuarios incorretos");
           }
        }
    }//GEN-LAST:event_btnConectActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
       fechar();
       
    }//GEN-LAST:event_btnExitActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        fechar();
    }//GEN-LAST:event_formWindowClosing

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FmrLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FmrLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FmrLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FmrLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FmrLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConect;
    private javax.swing.JButton btnExit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblFundos;
    private javax.swing.JPasswordField pwrSenha;
    private javax.swing.JTextField txtLogin;
    // End of variables declaration//GEN-END:variables
}
