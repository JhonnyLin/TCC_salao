package Telas;

import lixo.EstadoCivil;
import javax.swing.DefaultComboBoxModel;

public class Usuario extends javax.swing.JInternalFrame {

    public Usuario() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        rbtFeminino = new javax.swing.JRadioButton();
        rbtMasculino = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel2 = new javax.swing.JPanel();
        rbtFeminino1 = new javax.swing.JRadioButton();
        rbtMasculino1 = new javax.swing.JRadioButton();
        lblIcon1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jTextField18 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        setClosable(true);
        setMaximumSize(new java.awt.Dimension(723, 426));
        setMinimumSize(new java.awt.Dimension(723, 426));
        setPreferredSize(new java.awt.Dimension(723, 426));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 121, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 20, 121, 160);

        buttonGroup1.add(rbtFeminino);
        rbtFeminino.setText("Feminino");
        rbtFeminino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtFemininoActionPerformed(evt);
            }
        });
        getContentPane().add(rbtFeminino);
        rbtFeminino.setBounds(20, 260, 120, 23);

        buttonGroup1.add(rbtMasculino);
        rbtMasculino.setText("Masculino");
        rbtMasculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtMasculinoActionPerformed(evt);
            }
        });
        getContentPane().add(rbtMasculino);
        rbtMasculino.setBounds(20, 290, 130, 23);

        jLabel1.setText("RG:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(440, 120, 80, 20);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(160, 90, 340, 30);

        jLabel2.setText("Data Nascimento:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(520, 70, 130, 20);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(160, 190, 340, 30);

        jLabel3.setText("Nome completo:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(160, 70, 200, 20);

        jLabel4.setText("CPF:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(160, 120, 80, 20);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(520, 90, 170, 30);
        getContentPane().add(jTextField4);
        jTextField4.setBounds(160, 140, 260, 30);

        jLabel5.setText("Email:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(160, 170, 80, 20);
        getContentPane().add(jTextField5);
        jTextField5.setBounds(440, 140, 250, 30);

        jInternalFrame1.setMinimumSize(new java.awt.Dimension(723, 500));
        jInternalFrame1.setPreferredSize(new java.awt.Dimension(723, 500));
        jInternalFrame1.getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 121, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 148, Short.MAX_VALUE)
        );

        jInternalFrame1.getContentPane().add(jPanel2);
        jPanel2.setBounds(20, 20, 121, 148);

        buttonGroup1.add(rbtFeminino1);
        rbtFeminino1.setSelected(true);
        rbtFeminino1.setText("Feminino");
        rbtFeminino1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtFeminino1ActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(rbtFeminino1);
        rbtFeminino1.setBounds(20, 180, 67, 23);

        buttonGroup1.add(rbtMasculino1);
        rbtMasculino1.setText("Masculino");
        rbtMasculino1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtMasculino1ActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(rbtMasculino1);
        rbtMasculino1.setBounds(20, 210, 71, 23);
        jInternalFrame1.getContentPane().add(lblIcon1);
        lblIcon1.setBounds(30, 20, 121, 148);

        jLabel6.setText("RG:");
        jInternalFrame1.getContentPane().add(jLabel6);
        jLabel6.setBounds(440, 70, 80, 20);

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(jTextField6);
        jTextField6.setBounds(160, 40, 340, 20);

        jLabel7.setText("Data Nascimento:");
        jInternalFrame1.getContentPane().add(jLabel7);
        jLabel7.setBounds(520, 20, 110, 20);
        jInternalFrame1.getContentPane().add(jTextField7);
        jTextField7.setBounds(160, 140, 340, 20);

        jLabel8.setText("Nome completo:");
        jInternalFrame1.getContentPane().add(jLabel8);
        jLabel8.setBounds(160, 20, 80, 20);

        jLabel9.setText("CPF:");
        jInternalFrame1.getContentPane().add(jLabel9);
        jLabel9.setBounds(160, 70, 80, 20);
        jInternalFrame1.getContentPane().add(jTextField8);
        jTextField8.setBounds(520, 40, 170, 20);
        jInternalFrame1.getContentPane().add(jTextField9);
        jTextField9.setBounds(160, 90, 260, 20);

        jLabel10.setText("Email:");
        jInternalFrame1.getContentPane().add(jLabel10);
        jLabel10.setBounds(160, 120, 80, 20);
        jInternalFrame1.getContentPane().add(jTextField10);
        jTextField10.setBounds(440, 90, 250, 20);

        getContentPane().add(jInternalFrame1);
        jInternalFrame1.setBounds(0, 0, 723, 500);
        getContentPane().add(jTextField11);
        jTextField11.setBounds(520, 190, 170, 30);

        jLabel11.setText("Telefone:");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(520, 170, 110, 20);

        jLabel12.setText("Numero:");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(500, 270, 70, 20);

        jTextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField12ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField12);
        jTextField12.setBounds(160, 290, 320, 30);
        getContentPane().add(jTextField13);
        jTextField13.setBounds(160, 240, 120, 30);

        jLabel13.setText("Bairro:");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(300, 220, 70, 20);

        jLabel14.setText("Estado Civil:");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(20, 190, 90, 20);
        getContentPane().add(jTextField14);
        jTextField14.setBounds(300, 240, 180, 30);

        jLabel15.setText("Cidade:");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(500, 220, 50, 20);
        getContentPane().add(jTextField15);
        jTextField15.setBounds(500, 290, 80, 30);
        getContentPane().add(jTextField16);
        jTextField16.setBounds(500, 240, 190, 30);
        getContentPane().add(jTextField17);
        jTextField17.setBounds(600, 290, 90, 30);

        jLabel17.setText("Complemento:");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(600, 270, 90, 20);

        jLabel18.setText("Cod:");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(160, 20, 50, 20);
        getContentPane().add(jTextField18);
        jTextField18.setBounds(160, 40, 100, 30);

        jButton1.setText("Salvar");
        getContentPane().add(jButton1);
        jButton1.setBounds(490, 350, 90, 30);

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar);
        btnCancelar.setBounds(600, 350, 90, 30);

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nenhum(evt);
            }
        });
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(20, 210, 110, 30);

        jLabel20.setText("CEP:");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(160, 220, 50, 20);

        jLabel21.setText("Rua:");
        getContentPane().add(jLabel21);
        jLabel21.setBounds(160, 270, 50, 20);

        jLabel16.setText("Sexo:");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(20, 240, 50, 14);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbtFemininoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtFemininoActionPerformed
//        lblIcon.setIcon(imge.img("woman.png"));
    }//GEN-LAST:event_rbtFemininoActionPerformed

    private void rbtMasculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtMasculinoActionPerformed
//        lblIcon.setIcon(imge.img("person.png"));
    }//GEN-LAST:event_rbtMasculinoActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void rbtFeminino1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtFeminino1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtFeminino1ActionPerformed

    private void rbtMasculino1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtMasculino1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtMasculino1ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField12ActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void nenhum(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nenhum
        // TODO add your handling code here:
    }//GEN-LAST:event_nenhum
    public void combo1(){
        jComboBox1.setModel(new DefaultComboBoxModel<>(EstadoCivil.values()));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<Enum> jComboBox1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JLabel lblIcon1;
    private javax.swing.JRadioButton rbtFeminino;
    private javax.swing.JRadioButton rbtFeminino1;
    private javax.swing.JRadioButton rbtMasculino;
    private javax.swing.JRadioButton rbtMasculino1;
    // End of variables declaration//GEN-END:variables
}
