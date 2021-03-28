package Telas;

import ClasseBD.ConexaoBD;
import classe.Imagens;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class ServProd extends javax.swing.JDialog {

    public ServProd(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        inserirImg();
        txtCod.setEnabled(false);
        txtPercent.setEnabled(false);
        mscVlrComp.setEnabled(false);
        limpeza();
    }
    Imagens imge = new Imagens();
    String [] dados = new String[3];
    boolean serv = true;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        txtCod = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        atxDescricao = new javax.swing.JTextArea();
        mscVlrComp = new javax.swing.JFormattedTextField();
        txtPercent = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnEnviar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        rbnServ = new javax.swing.JRadioButton();
        rbnProd = new javax.swing.JRadioButton();
        btnAddProdAserv = new javax.swing.JButton();
        txtVlVenda = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(544, 390));
        setMinimumSize(new java.awt.Dimension(544, 390));
        setPreferredSize(new java.awt.Dimension(544, 390));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setText("Cód:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 70, 70, 14);
        getContentPane().add(txtCod);
        txtCod.setBounds(40, 90, 76, 28);

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        getContentPane().add(txtNome);
        txtNome.setBounds(160, 90, 340, 28);

        jLabel2.setText("Nome:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(160, 70, 110, 14);

        atxDescricao.setColumns(20);
        atxDescricao.setRows(5);
        jScrollPane1.setViewportView(atxDescricao);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(40, 210, 460, 96);

        mscVlrComp.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        getContentPane().add(mscVlrComp);
        mscVlrComp.setBounds(60, 150, 100, 29);
        getContentPane().add(txtPercent);
        txtPercent.setBounds(400, 150, 61, 29);

        jLabel3.setText("Valor de custo:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 120, 140, 26);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("%");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(470, 150, 18, 22);

        jLabel5.setText("Valor de Venda:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(220, 120, 130, 20);

        jLabel6.setText("Percentual");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(400, 120, 100, 20);

        jLabel7.setText("Descrição:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(40, 190, 80, 14);

        btnEnviar.setText("Enviar");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEnviar);
        btnEnviar.setBounds(120, 320, 110, 30);

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar);
        btnCancelar.setBounds(310, 320, 110, 30);

        buttonGroup1.add(rbnServ);
        rbnServ.setSelected(true);
        rbnServ.setText("Serviço");
        rbnServ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnServActionPerformed(evt);
            }
        });
        getContentPane().add(rbnServ);
        rbnServ.setBounds(130, 20, 120, 23);

        buttonGroup1.add(rbnProd);
        rbnProd.setText("Produto");
        rbnProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnProdActionPerformed(evt);
            }
        });
        getContentPane().add(rbnProd);
        rbnProd.setBounds(40, 20, 93, 23);

        btnAddProdAserv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddProdAservActionPerformed(evt);
            }
        });
        getContentPane().add(btnAddProdAserv);
        btnAddProdAserv.setBounds(430, 10, 60, 50);

        txtVlVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVlVendaActionPerformed(evt);
            }
        });
        getContentPane().add(txtVlVenda);
        txtVlVenda.setBounds(240, 150, 100, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("R$");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(40, 150, 34, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("R$");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(220, 140, 40, 50);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        //pega os dados da caixa de texto
        dados[0] = txtNome.getText();
        dados[1] = txtVlVenda.getText();
        dados[2] = atxDescricao.getText();
        String a,f;
        //verifica se é um serviço ou produto
        if(serv){
            a = "INSERT INTO servprod (bl_Serv, nm_ServProd, ds_ServProd, vl_ServProd)";
            f = "VALUES("+ serv +",'"+dados[0]+"','"+dados[2]+"','"+dados[1]+"')";
        }else{
            a = "INSERT INTO servprod (bl_Serv, nm_ServProd, ds_ServProd, vl_ServProd, qt_Prod)";
            String b = JOptionPane.showInputDialog("Quantidade em estoque", 0);
            f = "VALUES("+ serv +",'"+dados[0]+"','"+dados[2]+"','"+dados[1]+"','"+b+"')";
        }
        ConexaoBD.executar(a+f);
        //System.out.println(a+f);
        limpeza();

    }//GEN-LAST:event_btnEnviarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void rbnServActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnServActionPerformed
        inicializa(true);
    }//GEN-LAST:event_rbnServActionPerformed

    private void rbnProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnProdActionPerformed
        inicializa(false);
    }//GEN-LAST:event_rbnProdActionPerformed

    private void btnAddProdAservActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddProdAservActionPerformed
        BuscaSP bSP = new BuscaSP(null, true);
        bSP.setVisible(true);
    }//GEN-LAST:event_btnAddProdAservActionPerformed

    private void txtVlVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVlVendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVlVendaActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(ServProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ServProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ServProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ServProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ServProd dialog = new ServProd(new javax.swing.JFrame(), true);
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
    public void inserirImg(){
        JButton [] btnImg = {btnAddProdAserv, btnEnviar, btnCancelar};
        String [] urlImg = {"cesta1.png", "verifica.png","remover.png" };
        imge.multiplasImagens(urlImg, btnImg);
    }
    
    public void inicializa(boolean serv){
        txtPercent.setEnabled(serv);
        mscVlrComp.setEnabled(serv);
        if(serv){
            rbnServ.setSelected(serv);
        }else{
            rbnProd.setSelected(true);
        }
    }
    
    
    public void limpeza(){
        
        txtNome.setText("");
        txtCod.setText("");
        txtPercent.setText("");
        txtVlVenda.setText("");
        mscVlrComp.setText("");
        atxDescricao.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea atxDescricao;
    private javax.swing.JButton btnAddProdAserv;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEnviar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JFormattedTextField mscVlrComp;
    private javax.swing.JRadioButton rbnProd;
    private javax.swing.JRadioButton rbnServ;
    private javax.swing.JTextField txtCod;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPercent;
    private javax.swing.JTextField txtVlVenda;
    // End of variables declaration//GEN-END:variables
}
