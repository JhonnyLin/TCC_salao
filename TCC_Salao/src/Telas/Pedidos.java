package Telas;

import ClasseBD.ConexaoBD;
import classe.genericas.Configuracao;
import classe.genericas.Tabela;
import classe.objetos.PedidoCompra;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Pedidos extends javax.swing.JInternalFrame {

    public Pedidos() {
        initComponents();
        tabela.criarTabelas(jTable1, nomesS);
    }
    
    Fornecedor fornecedor =  new Fornecedor(null, true);
    Configuracao config  = new Configuracao();
    BuscaSP buscasp = new BuscaSP(null, true);
    PedidoCompra pedidoC = new PedidoCompra();
    Tabela tabela = new Tabela();
    private String [] nomesS = {"Cód", "Nome", "quantidade", "Valor Un.", "Total"};
    classe.objetos.Fornecedor fornec;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        btnComprar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        lblSetNome = new javax.swing.JLabel();
        lblSetEmail = new javax.swing.JLabel();
        lblSetCNPJ = new javax.swing.JLabel();
        lblSetTel = new javax.swing.JLabel();

        setClosable(true);
        setMinimumSize(new java.awt.Dimension(723, 500));
        setPreferredSize(new java.awt.Dimension(723, 500));
        getContentPane().setLayout(null);

        jButton1.setText("Cod");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(30, 10, 101, 100);

        jLabel1.setText("Nome:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(140, 10, 60, 20);

        jLabel2.setText("CNPJ:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(460, 10, 70, 20);

        jLabel3.setText("Telefone:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(460, 60, 70, 20);

        jLabel4.setText("Email:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(140, 60, 70, 20);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 150, 550, 290);

        jButton2.setText("Inserir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(600, 330, 90, 23);

        jButton3.setText("Remover");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(600, 360, 90, 23);

        jButton4.setText("Enviar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(600, 390, 90, 23);

        btnComprar.setText("Comprar");
        getContentPane().add(btnComprar);
        btnComprar.setBounds(600, 150, 90, 23);

        jLabel5.setText("Produtos:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 124, 60, 20);

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar);
        btnCancelar.setBounds(600, 420, 90, 23);

        lblSetNome.setText("XXXXXXXXXXXXXXXXX XXXXXXXXXXXXX LTDA");
        getContentPane().add(lblSetNome);
        lblSetNome.setBounds(140, 30, 290, 30);

        lblSetEmail.setText("XXXXXXXXXXXXXX@XXXXXXXXXXX.com");
        getContentPane().add(lblSetEmail);
        lblSetEmail.setBounds(140, 80, 290, 30);

        lblSetCNPJ.setText("XX. XXX. XXX/0001-XX");
        getContentPane().add(lblSetCNPJ);
        lblSetCNPJ.setBounds(460, 34, 220, 30);

        lblSetTel.setText("(XX) XXX-XXX-XXX");
        getContentPane().add(lblSetTel);
        lblSetTel.setBounds(460, 80, 220, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        System.out.println(""+jTable1.getSelectedRow());
        int x = jTable1.getSelectedRow();
        if(x > 0){
            tabela.excluir(x);
        }else{
            JOptionPane.showMessageDialog(null, "Selecione algum produto");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        Limpar();
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        fornecedor.orcamento();        
        config.tela("Orçamento Fornecedor", fornecedor);
        if(fornecedor.x){
            fornec = fornecedor.fornec;
            lblSetNome.setText(fornec.nome());
            lblSetEmail.setText(fornec.getEmail());
            lblSetCNPJ.setText(fornec.getCNPJ());
            lblSetTel.setText(fornec.getTelefone());
            pedidoC.setIDFornecedor(fornec.getCod());
        }else{
            Limpar();
            JOptionPane.showMessageDialog(null, "Sem Fornecedor");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ConexaoBD.connect();
        buscasp.confgOrcamento();
        config.tela("Produtos Orçamento", buscasp);
        ConexaoBD.desconnect();
        if(!buscasp.x){
            String qntd = JOptionPane.showInputDialog("Quantidade?");
            String valor = JOptionPane.showInputDialog("Valor Unitario: (EX. 9.99)");
            buscasp.item.setQntdItem(qntd);
            buscasp.item.setVlUnitario(valor);
            pedidoC.inserir(buscasp.item);
            tabela.inserirItem(buscasp.item);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if(pedidoC.getIdForncedor().equals("")){
            JOptionPane.showMessageDialog(null, "Favor colocar um fornecedor!");
        }else{
            if(jTable1.getRowCount()== 0){
                JOptionPane.showMessageDialog(null, "Favor Adicionar Produto!");
            }else{
//                try {
//                    ConexaoBD.connect();
//                    pedidoC.inserirPedidoCompraBD();
//                    pedidoC.inserirItemOrcamento();
//                    ConexaoBD.desconnect();
                    Limpar();
                    tabela.limparTabela(jTable1, nomesS);
//                } catch (SQLException ex) {
//                    Logger.getLogger(Pedidos.class.getName()).log(Level.SEVERE, null, ex);
//                }
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    public void Limpar(){
        lblSetCNPJ.setText("XX. XXX. XXX/0001-XX");
        lblSetEmail.setText("XXXXXXXXXXXXXX@XXXXXXXXXXX.com");
        lblSetNome.setText("XXXXXXXXXXXXXXXXX XXXXXXXXXXXXX LTDA");
        lblSetTel.setText("(XX) XXX-XXX-XXX");
        fornec = null;
    }
    
    public void opCompra(boolean on){
        btnComprar.setVisible(on);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnComprar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblSetCNPJ;
    private javax.swing.JLabel lblSetEmail;
    private javax.swing.JLabel lblSetNome;
    private javax.swing.JLabel lblSetTel;
    // End of variables declaration//GEN-END:variables
}
