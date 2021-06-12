package Telas;

import classe.negocios.Inicializacao;

public class Resultado extends javax.swing.JDialog {
    
    public boolean confirmar;
    private Inicializacao ini;
    public Resultado(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        this.confirmar = false;
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblSetData = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblSetNome = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        atxInformacoes = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        jLabel5.setText("jLabel5");

        jLabel7.setText("jLabel7");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Resultado");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(337, 360));
        setMinimumSize(new java.awt.Dimension(337, 360));
        setPreferredSize(new java.awt.Dimension(360, 400));
        setSize(new java.awt.Dimension(360, 400));
        getContentPane().setLayout(null);

        jLabel1.setText("Data:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(230, 10, 50, 20);

        lblSetData.setText("00/00/0000");
        getContentPane().add(lblSetData);
        lblSetData.setBounds(260, 10, 80, 20);

        jLabel3.setText("Atendente:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 10, 70, 20);

        lblSetNome.setText("XXXXXX XXXXXX XXX");
        getContentPane().add(lblSetNome);
        lblSetNome.setBounds(90, 10, 140, 20);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(10, 30, 320, 10);

        jLabel6.setText("Informações:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 40, 90, 14);

        atxInformacoes.setColumns(20);
        atxInformacoes.setRows(5);
        atxInformacoes.setEnabled(false);
        jScrollPane1.setViewportView(atxInformacoes);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 60, 300, 240);

        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(210, 320, 90, 30);

        jButton3.setText("Confirmar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(40, 320, 90, 30);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.confirmar = true;
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Resultado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Resultado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Resultado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Resultado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Resultado dialog = new Resultado(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
        
        
    }
    public void config(Inicializacao ini, String valor){
        lblSetNome.setText(ini.getAtendente());
        lblSetData.setText("01/01/0000");
        atxInformacoes.setText("Valor Inicial....: "+ini.getVlInicial()+
                             "\nValor de Retirada: "+ini.getVlRetirada()+
                             "\nValor em Caixa...: "+ini.getVlTotal()+
                             "\nValor Reportado..: "+valor+
                             "\nVAlor Faturamento: ");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea atxInformacoes;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblSetData;
    private javax.swing.JLabel lblSetNome;
    // End of variables declaration//GEN-END:variables
}
