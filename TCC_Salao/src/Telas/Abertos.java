package Telas;

import classe.genericas.Tabela;

public class Abertos extends javax.swing.JInternalFrame {

    public Abertos() {
        initComponents();
        tb.criarTabelas(jTable1, nomes);
    }
    private String [] nomes = {"Data","N° Atendimento", "Cliente", "Valor" };
    Tabela tb = new Tabela();
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnNovo = new javax.swing.JButton();
        btnExcel = new javax.swing.JButton();
        btnPagar = new javax.swing.JButton();
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
        setTitle("Recebimento Futuro");
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

        btnNovo.setText("Novo");
        getContentPane().add(btnNovo);
        btnNovo.setBounds(530, 360, 110, 31);

        btnExcel.setText("Excel");
        getContentPane().add(btnExcel);
        btnExcel.setBounds(530, 280, 110, 31);

        btnPagar.setText("Pagar");
        btnPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagarActionPerformed(evt);
            }
        });
        getContentPane().add(btnPagar);
        btnPagar.setBounds(530, 320, 110, 31);

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

        lblTitulo.setText("Receber:");
        getContentPane().add(lblTitulo);
        lblTitulo.setBounds(20, 10, 90, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPagarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnExcel;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPagar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblSubTitulo;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
