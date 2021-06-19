package Telas;

import ClasseBD.ConexaoBD;
import classe.genericas.Tabela;

public class Estoque extends javax.swing.JInternalFrame {

    public Estoque() {
        initComponents();       
        tb.criarTabelas(jTable1, nomes);
    }
    String [] nomes = {"cod","Nome", "Qntd", "Vl.Compra", "Vl.Venda", "Vl.Estoque" };
    Tabela tb = new Tabela();
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnCancelar = new javax.swing.JButton();
        lblSubTitulo = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setClosable(true);
        setTitle("Estoque");
        setMaximumSize(new java.awt.Dimension(675, 479));
        setMinimumSize(new java.awt.Dimension(675, 479));
        setPreferredSize(new java.awt.Dimension(675, 479));
        getContentPane().setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 39, 490, 390);

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar);
        btnCancelar.setBounds(530, 400, 110, 31);
        getContentPane().add(lblSubTitulo);
        lblSubTitulo.setBounds(90, 10, 250, 20);

        lblTitulo.setText("Estoque:");
        getContentPane().add(lblTitulo);
        lblTitulo.setBounds(20, 10, 90, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    public void buscarProdutos(){ 
        ConexaoBD.connect();
        String query = "SELECT cd_ServProd, nm_ServProd, qt_Prod, vl_compra, vl_ServProd  FROM servprod WHERE bl_Serv= '0'";
        tb.insEstoque(query, nomes.length);
        ConexaoBD.desconnect();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblSubTitulo;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
