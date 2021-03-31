package Telas;

import classe.Configuracao;

public class Agendamento extends javax.swing.JInternalFrame {

    public Agendamento() {
        initComponents();
    }
    Configuracao config = new Configuracao();
    Cliente cliente = new Cliente(null, true);
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jSeparator1 = new javax.swing.JSeparator();
        btnCancelar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setClosable(true);
        setMaximumSize(new java.awt.Dimension(509, 420));
        setMinimumSize(new java.awt.Dimension(509, 420));
        setPreferredSize(new java.awt.Dimension(509, 420));
        setRequestFocusEnabled(false);
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        getContentPane().setLayout(null);
        getContentPane().add(jDateChooser1);
        jDateChooser1.setBounds(60, 120, 180, 30);

        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(20, 20, 80, 80);

        jLabel1.setText("Codigo:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(110, 20, 50, 20);

        jLabel2.setText("Xxxxxxx Xxxxxxx Xxxxxx");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(170, 50, 280, 20);

        jLabel3.setText("Nome:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(110, 50, 50, 20);

        jLabel4.setText("Atendente:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(280, 20, 110, 20);

        jLabel5.setText("(xx) x xxxx - xxxx ");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(170, 80, 300, 20);

        jLabel6.setText("Telefone:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(110, 80, 60, 20);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(340, 120, 130, 30);

        jLabel7.setText("Data:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(20, 120, 60, 20);

        jLabel8.setText("Horario:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(280, 120, 70, 20);

        jLabel9.setText("Descrição:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(20, 170, 90, 20);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox2);
        jComboBox2.setBounds(340, 20, 130, 30);

        jLabel10.setText("00000000");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(170, 20, 100, 20);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 190, 450, 120);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(20, 160, 450, 10);

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar);
        btnCancelar.setBounds(280, 330, 110, 30);

        jButton3.setText("Agendar");
        getContentPane().add(jButton3);
        jButton3.setBounds(90, 330, 110, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        cliente.inicializar(true);
        config.tela("Buscar Cliente", cliente);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
