package Telas;

import ClasseBD.ConexaoBD;
import classe.Configuracao;
import classe.Imagens;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class Fornecedor extends javax.swing.JDialog {

    public Fornecedor(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        inserirImg();
    }

    String a;
    Configuracao config = new Configuracao();
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        txtNmFornecedor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtCodFornecedor = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtEmaiFornecedor = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        atxEndFornecedor = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        mcrTelFornecedor = new javax.swing.JFormattedTextField();
        btnAdd = new javax.swing.JButton();
        btnPesqCod = new javax.swing.JButton();
        btnPesqCNPJ = new javax.swing.JButton();
        btnPesqTel = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnEnviar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnPesqNome = new javax.swing.JButton();
        mcrCNPJ = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel2.setText("Nome");

        txtNmFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNmFornecedorActionPerformed(evt);
            }
        });

        jLabel3.setText("Codigo");

        jLabel4.setText("Telefone");

        jLabel5.setText("Email");

        atxEndFornecedor.setColumns(20);
        atxEndFornecedor.setRows(5);
        jScrollPane1.setViewportView(atxEndFornecedor);

        jLabel6.setText("Endereço");

        try {
            mcrTelFornecedor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)###-###-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnPesqCod.setMaximumSize(new java.awt.Dimension(26, 26));
        btnPesqCod.setMinimumSize(new java.awt.Dimension(26, 26));
        btnPesqCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesqCodActionPerformed(evt);
            }
        });

        btnPesqCNPJ.setMaximumSize(new java.awt.Dimension(26, 26));
        btnPesqCNPJ.setMinimumSize(new java.awt.Dimension(26, 26));
        btnPesqCNPJ.setPreferredSize(new java.awt.Dimension(26, 26));
        btnPesqCNPJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesqCNPJActionPerformed(evt);
            }
        });

        btnPesqTel.setMaximumSize(new java.awt.Dimension(26, 26));
        btnPesqTel.setMinimumSize(new java.awt.Dimension(26, 26));
        btnPesqTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesqTelActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnEnviar.setText("Enviar");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });

        jLabel1.setText("CNPJ");

        btnPesqNome.setMaximumSize(new java.awt.Dimension(26, 26));
        btnPesqNome.setMinimumSize(new java.awt.Dimension(26, 26));
        btnPesqNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesqNomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtCodFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(btnPesqCod, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(214, 214, 214)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(txtNmFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(btnPesqNome, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(mcrCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnPesqCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(mcrTelFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnPesqTel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(txtEmaiFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCodFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPesqCod, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNmFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesqNome, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mcrCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesqCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mcrTelFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesqTel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txtEmaiFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        inicializar(false);
        limparCampos();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnPesqCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesqCodActionPerformed
        a = txtCodFornecedor.getText();
        String query = pesquisaForn(a,"idfornecedor");
        try {
            RetornarFornecedor(ConexaoBD.rsexecutar(query));
        } catch (SQLException ex) {
            Logger.getLogger(Fornecedor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnPesqCodActionPerformed

    private void btnPesqCNPJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesqCNPJActionPerformed
        a = mcrCNPJ.getText();
        String query = pesquisaForn(a,"cd_CNPJ");
        try {
            RetornarFornecedor(ConexaoBD.rsexecutar(query));
        } catch (SQLException ex) {
            Logger.getLogger(Fornecedor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnPesqCNPJActionPerformed

    private void btnPesqTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesqTelActionPerformed
        a = mcrTelFornecedor.getText();
        String query = pesquisaForn(a,"cd_Telefone");
        try {
            RetornarFornecedor(ConexaoBD.rsexecutar(query));
        } catch (SQLException ex) {
            Logger.getLogger(Fornecedor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnPesqTelActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
        limparCampos();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        String query = inserirForn();
        ConexaoBD.executar(query);
        JOptionPane.showMessageDialog(null, "Fornecedor Cadastrado!");
        limparCampos();
    }//GEN-LAST:event_btnEnviarActionPerformed

    private void btnPesqNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesqNomeActionPerformed
        a = txtNmFornecedor.getText();
        String query = pesquisaForn(a,"nm_Fornecedor");
        try {
            RetornarFornecedor(ConexaoBD.rsexecutar(query));
        } catch (SQLException ex) {
            Logger.getLogger(Fornecedor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnPesqNomeActionPerformed

    private void txtNmFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNmFornecedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNmFornecedorActionPerformed

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
            java.util.logging.Logger.getLogger(Fornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Fornecedor dialog = new Fornecedor(new javax.swing.JFrame(), true);
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

 
    public String pesquisaForn(String texto, String campo){
        String q = "SELECT * FROM fornecedor WHERE  ";
        String query = q+campo+"= '"+texto+"'";
        return query;
    }
        public void RetornarFornecedor(ResultSet rs ) throws SQLException{
        while(rs.next()){
            txtCodFornecedor.setText(rs.getString(1));
            txtNmFornecedor.setText(rs.getString(2));
            mcrCNPJ.setText(rs.getString(3));
            mcrTelFornecedor.setText(rs.getString(4));
            txtEmaiFornecedor.setText(rs.getString(5));
            atxEndFornecedor.setText(rs.getString(6));
        }
    }
    public String inserirForn(){
        //definindo a tabela e os campos para inserir
        String q = "INSERT INTO fornecedor (nm_Fornecedor, cd_CNPJ, cd_Telefone, ds_Email,ds_Endereco) ";
        //declaração dos campos
        String nm_Fornecedor, cd_CNPJ, cd_Telefone, ds_Email, ds_Endereco;
        //pegando o valor das caixas de texto
        nm_Fornecedor = txtNmFornecedor.getText();
        cd_CNPJ = mcrCNPJ.getText();
        cd_Telefone = mcrTelFornecedor.getText();
        ds_Email= txtEmaiFornecedor.getText();
        ds_Endereco = atxEndFornecedor.getText();
        //colocando as variaveis na quary
        String a = "VALUES('"+ nm_Fornecedor +"', '"+cd_CNPJ +"' ,'"+ cd_Telefone +"','"+ ds_Email +"','"+ ds_Endereco +"')";
        //teste
        System.out.println(q+a);
        return q+a;
    }
    
    public void inicializar(boolean psq){
        txtCodFornecedor.setEnabled(psq);
        btnAdd.setVisible(psq);
        btnPesqCod.setVisible(psq);
        btnPesqTel.setVisible(psq); 
        if(psq){
            txtEmaiFornecedor.setEnabled(false);
            atxEndFornecedor.setEnabled(false);
            this.setTitle("Buscar Fornecedor");
        }else{
            txtEmaiFornecedor.setEnabled(true);
            atxEndFornecedor.setEnabled(true);
            this.setTitle("Cadastrar Fornecedor");
        }        
    }
    
    public void inserirImg(){
        Imagens imge = new Imagens();
        JButton [] bntImg = {btnPesqCNPJ, btnPesqCod, btnPesqNome, btnPesqTel, btnAdd, btnEnviar, btnCancelar};
        String [] img = {"buscar16.png", "buscar16.png","buscar16.png", "buscar16.png", "adicionar.png", "verifica.png", "remover.png"};
        imge.multiplasImagens(img, bntImg);
    }
        
    public void limparCampos(){
        txtCodFornecedor.setText("");
        txtNmFornecedor.setText("");
        mcrCNPJ.setText("");
        mcrTelFornecedor.setText("");        
        txtEmaiFornecedor.setText("");
        atxEndFornecedor.setText("");
   }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea atxEndFornecedor;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEnviar;
    private javax.swing.JButton btnPesqCNPJ;
    private javax.swing.JButton btnPesqCod;
    private javax.swing.JButton btnPesqNome;
    private javax.swing.JButton btnPesqTel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JFormattedTextField mcrCNPJ;
    private javax.swing.JFormattedTextField mcrTelFornecedor;
    private javax.swing.JTextField txtCodFornecedor;
    private javax.swing.JTextField txtEmaiFornecedor;
    private javax.swing.JTextField txtNmFornecedor;
    // End of variables declaration//GEN-END:variables
}
