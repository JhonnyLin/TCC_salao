package Telas;

import ClasseBD.ConexaoBD;
import classe.genericas.Tabela;
import classe.genericas.Imagens;
import classe.objetos.ItemOrcamento;
import javax.swing.JButton;

public class BuscaSP extends javax.swing.JDialog {
        
    public BuscaSP(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        inserirImg();
        conec.connect();
    }
    
    ConexaoBD conec = new ConexaoBD();
    private Imagens imge = new Imagens();    
    private Tabela tabela = new Tabela();
    private String camposServBD = "cd_ServProd, nm_ServProd, ds_ServProd, vl_ServProd";
    private String camposProdBD = "cd_ServProd, qt_Prod,nm_ServProd, ds_ServProd, vl_ServProd";
    private String tabelaBD = "servprod";
    private String [] nomesS = {"Cód", "Nome", "Descrição", "Valor"};
    private String [] nomesP = {"Cód","Qntd", "Nome", "Descrição", "Valor"}; 
    public String codSP;
    public boolean x;
    public ItemOrcamento item;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        btnPesqNome = new javax.swing.JButton();
        txtNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnPesqCod = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblServProd = new javax.swing.JTable();
        btnEnviar = new javax.swing.JButton();
        rbnServ = new javax.swing.JRadioButton();
        btnCancelar = new javax.swing.JButton();
        rbnProd = new javax.swing.JRadioButton();
        txtCod = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnPesqNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesqNomeActionPerformed(evt);
            }
        });

        jLabel2.setText("Nome:");

        btnPesqCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesqCodActionPerformed(evt);
            }
        });

        tblServProd.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblServProd.setToolTipText("");
        tblServProd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblServProdMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblServProd);

        btnEnviar.setText("Enviar");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbnServ);
        rbnServ.setText("Serviços");
        rbnServ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnServActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbnProd);
        rbnProd.setText("Produtos");
        rbnProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnProdActionPerformed(evt);
            }
        });

        jLabel1.setText("Cód:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(rbnProd, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbnServ, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(423, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 45, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(70, 70, 70)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(btnPesqCod, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(34, 34, 34)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(btnPesqNome, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(140, 140, 140)
                            .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(120, 120, 120)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 45, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbnServ)
                    .addComponent(rbnProd))
                .addContainerGap(429, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 55, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2))
                    .addGap(6, 6, 6)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnPesqCod, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnPesqNome, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(32, 32, 32)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(28, 28, 28)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 15, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPesqNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesqNomeActionPerformed
        String texto = txtNome.getText();
    }//GEN-LAST:event_btnPesqNomeActionPerformed

    private void btnPesqCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesqCodActionPerformed
        String texto = txtCod.getText();
    }//GEN-LAST:event_btnPesqCodActionPerformed

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        if(this.getTitle().equals("Produtos Orçamento")){
            criandoItemOrcamento();
            x = false;
        }else if(this.getTitle().equals("Bucar Serviço ou Produto")){
            codSP = tabela.getCod(tblServProd.getSelectedRow());
             x = true;
        }
        dispose();        
    }//GEN-LAST:event_btnEnviarActionPerformed

    private void rbnServActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnServActionPerformed
        //tabela.criarTabelas(tblServProd, camposServBD, tabelaBD, 1, nomesS);
        configServico();
    }//GEN-LAST:event_rbnServActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        x = false;
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void rbnProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnProdActionPerformed
       // tabela.criarTabelas(tblServProd, camposProdBD, tabelaBD, 0, nomesP);
        configPruduto();
    }//GEN-LAST:event_rbnProdActionPerformed

    private void tblServProdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblServProdMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblServProdMouseClicked

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
            java.util.logging.Logger.getLogger(BuscaSP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscaSP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscaSP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscaSP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                BuscaSP dialog = new BuscaSP(new javax.swing.JFrame(), true);
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
    //minhas classes
    public void criandoItemOrcamento(){
        int x = tblServProd.getSelectedRow();
        item = new ItemOrcamento(""+tblServProd.getValueAt(x, 0), ""+tblServProd.getValueAt(x, 2));
    }
    public void confgOrcamento(){
        rbnProd.setSelected(true);
        tabela.criarTabelas(tblServProd, camposProdBD, tabelaBD, 0, nomesP);
        rbnServ.setVisible(false);
    }
    
    public void configPruduto(){
        rbnProd.setSelected(true);
        tabela.criarTabelas(tblServProd, camposProdBD, tabelaBD, 0, nomesP);
    }
    
    public void configServico(){
        rbnServ.setSelected(true);
        tabela.criarTabelas(tblServProd, camposServBD, tabelaBD, 1, nomesS);
    }
    
    public void inserirImg(){
        JButton [] bntImg = {btnPesqCod, btnPesqNome, btnEnviar, btnCancelar};
        String [] img = {"buscar16.png", "buscar16.png","verifica.png", "remover.png"};
        imge.multiplasImagens(img, bntImg);
    }
     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEnviar;
    private javax.swing.JButton btnPesqCod;
    private javax.swing.JButton btnPesqNome;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JRadioButton rbnProd;
    public javax.swing.JRadioButton rbnServ;
    private javax.swing.JTable tblServProd;
    private javax.swing.JTextField txtCod;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
