package Telas;

import ClasseBD.ConexaoBD;
import classe.genericas.Configuracao;
import classe.genericas.Imagens;
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
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1000, 525));
        setMinimumSize(new java.awt.Dimension(1000, 525));
        setPreferredSize(new java.awt.Dimension(1000, 525));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel2.setText("Nome");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(35, 80, 90, 20);

        txtNmFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNmFornecedorActionPerformed(evt);
            }
        });
        getContentPane().add(txtNmFornecedor);
        txtNmFornecedor.setBounds(36, 100, 320, 30);

        jLabel3.setText("Codigo");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(35, 30, 110, 20);
        getContentPane().add(txtCodFornecedor);
        txtCodFornecedor.setBounds(35, 50, 60, 30);

        jLabel4.setText("Telefone");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(35, 180, 110, 20);

        jLabel5.setText("Email");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(35, 230, 100, 20);
        getContentPane().add(txtEmaiFornecedor);
        txtEmaiFornecedor.setBounds(35, 250, 380, 30);

        atxEndFornecedor.setColumns(20);
        atxEndFornecedor.setRows(5);
        jScrollPane1.setViewportView(atxEndFornecedor);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(35, 300, 380, 96);

        jLabel6.setText("Endereço");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(35, 280, 80, 20);

        try {
            mcrTelFornecedor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)###-###-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(mcrTelFornecedor);
        mcrTelFornecedor.setBounds(35, 200, 320, 30);

        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd);
        btnAdd.setBounds(365, 30, 50, 50);

        btnPesqCod.setMaximumSize(new java.awt.Dimension(26, 26));
        btnPesqCod.setMinimumSize(new java.awt.Dimension(26, 26));
        btnPesqCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesqCodActionPerformed(evt);
            }
        });
        getContentPane().add(btnPesqCod);
        btnPesqCod.setBounds(125, 50, 26, 26);

        btnPesqCNPJ.setMaximumSize(new java.awt.Dimension(26, 26));
        btnPesqCNPJ.setMinimumSize(new java.awt.Dimension(26, 26));
        btnPesqCNPJ.setPreferredSize(new java.awt.Dimension(26, 26));
        btnPesqCNPJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesqCNPJActionPerformed(evt);
            }
        });
        getContentPane().add(btnPesqCNPJ);
        btnPesqCNPJ.setBounds(385, 150, 26, 26);

        btnPesqTel.setMaximumSize(new java.awt.Dimension(26, 26));
        btnPesqTel.setMinimumSize(new java.awt.Dimension(26, 26));
        btnPesqTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesqTelActionPerformed(evt);
            }
        });
        getContentPane().add(btnPesqTel);
        btnPesqTel.setBounds(385, 200, 26, 26);

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar);
        btnCancelar.setBounds(260, 440, 120, 30);

        btnEnviar.setText("Novo Orçamento");
        btnEnviar.setMaximumSize(new java.awt.Dimension(75, 23));
        btnEnviar.setMinimumSize(new java.awt.Dimension(75, 23));
        btnEnviar.setPreferredSize(new java.awt.Dimension(75, 23));
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEnviar);
        btnEnviar.setBounds(40, 440, 120, 30);

        jLabel1.setText("CNPJ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(35, 130, 40, 20);

        btnPesqNome.setMaximumSize(new java.awt.Dimension(26, 26));
        btnPesqNome.setMinimumSize(new java.awt.Dimension(26, 26));
        btnPesqNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesqNomeActionPerformed(evt);
            }
        });
        getContentPane().add(btnPesqNome);
        btnPesqNome.setBounds(385, 100, 26, 26);
        getContentPane().add(mcrCNPJ);
        mcrCNPJ.setBounds(35, 150, 320, 30);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTable1);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(450, 30, 520, 440);

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
            btnEnviar.setText("Novo orçamento");
            btnEnviar.setEnabled(false);
            this.setTitle("Buscar Fornecedor");
        }else{
            txtEmaiFornecedor.setEnabled(true);
            atxEndFornecedor.setEnabled(true);
            btnEnviar.setText("Confirmar");
            btnEnviar.setEnabled(true);
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JFormattedTextField mcrCNPJ;
    private javax.swing.JFormattedTextField mcrTelFornecedor;
    private javax.swing.JTextField txtCodFornecedor;
    private javax.swing.JTextField txtEmaiFornecedor;
    private javax.swing.JTextField txtNmFornecedor;
    // End of variables declaration//GEN-END:variables
}
