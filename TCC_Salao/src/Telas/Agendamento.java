package Telas;

import classe.calendar;
import classe.genericas.Configuracao;
import java.util.Calendar;

public class Agendamento extends javax.swing.JInternalFrame {

    public Agendamento() {
        initComponents();
        combo(hora);
        
    }
    String [] hora = {"8:00", "8:30", "9:00", "9:30","10:00", "10:30",
                      "11:00", "11:30", "12:00", "12:30","13:00", "13:30",
                      "14:00", "14:30", "15:00", "15:30","16:00", "16:30",
                      "17:00", "17:30", "18:00","18:30", "19:00", "19:30",};
    
    Configuracao config = new Configuracao();
    Cliente cliente = new Cliente(null, true);
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCalendar1 = new com.toedter.calendar.JCalendar();
        jDayChooser1 = new com.toedter.calendar.JDayChooser();
        jCalendar2 = new com.toedter.calendar.JCalendar();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblTel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cbxHora = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cbxAtendente = new javax.swing.JComboBox<>();
        lblValorCodigo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        atxDescricao = new javax.swing.JTextArea();
        jSeparator1 = new javax.swing.JSeparator();
        btnCancelar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        data = new com.toedter.calendar.JDateChooser();

        setClosable(true);
        setMaximumSize(new java.awt.Dimension(565, 420));
        setMinimumSize(new java.awt.Dimension(565, 420));
        setPreferredSize(new java.awt.Dimension(565, 420));
        setRequestFocusEnabled(false);
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        getContentPane().setLayout(null);

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
        jLabel4.setBounds(320, 20, 110, 20);

        lblTel.setText("(xx) x xxxx - xxxx ");
        getContentPane().add(lblTel);
        lblTel.setBounds(170, 80, 300, 20);

        jLabel6.setText("Telefone:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(110, 80, 60, 20);

        getContentPane().add(cbxHora);
        cbxHora.setBounds(390, 120, 130, 30);

        jLabel7.setText("Data:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(20, 120, 60, 20);

        jLabel8.setText("Horario:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(330, 120, 70, 20);

        jLabel9.setText("Descrição:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(20, 170, 90, 20);

        getContentPane().add(cbxAtendente);
        cbxAtendente.setBounds(390, 20, 130, 30);

        lblValorCodigo.setText("00000000");
        getContentPane().add(lblValorCodigo);
        lblValorCodigo.setBounds(170, 20, 100, 20);

        atxDescricao.setColumns(20);
        atxDescricao.setRows(5);
        jScrollPane1.setViewportView(atxDescricao);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 190, 500, 120);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(20, 160, 500, 10);

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar);
        btnCancelar.setBounds(320, 330, 110, 30);

        jButton3.setText("Agendar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(110, 330, 110, 30);

        data.setMinSelectableDate(new java.util.Date(-62135755084000L));
        getContentPane().add(data);
        data.setBounds(70, 120, 200, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        cliente.inicializar(true);
        config.tela("Buscar Cliente", cliente);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //banco de dados
        getValores();
    }//GEN-LAST:event_jButton3ActionPerformed

    public void combo(String [] vetor){
        for(int i =0; i<vetor.length;i++){
            cbxHora.addItem(vetor[i]);
        }
    }
    
    
    public void getValores(){
//        lblValorCodigo.getText();
//        System.out.println(lblValorCodigo.getText());
//          Calendar a = data.getCalendar();
          calendar cld = new calendar();
          cld.dataValida(data.getCalendar());
          //System.out.println(cld.formatData(data.getCalendar()));
//          int ano = a.get(Calendar.YEAR); 
//          int mes = a.get(Calendar.MONDAY);
//          int dia = a.get(Calendar.DAY_OF_MONTH);
//          System.out.println(dia+"/"+mes+1+"/"+ano);
//        System.out.println();
//        System.out.println();
//        System.out.println(cbxAtendente.getItemCount());
//        System.out.println(cbxHora.getItemCount());
//        System.out.println(atxDescricao.getText());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea atxDescricao;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JComboBox<String> cbxAtendente;
    private javax.swing.JComboBox<String> cbxHora;
    private com.toedter.calendar.JDateChooser data;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private com.toedter.calendar.JCalendar jCalendar1;
    private com.toedter.calendar.JCalendar jCalendar2;
    private com.toedter.calendar.JDayChooser jDayChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblTel;
    private javax.swing.JLabel lblValorCodigo;
    // End of variables declaration//GEN-END:variables
}
