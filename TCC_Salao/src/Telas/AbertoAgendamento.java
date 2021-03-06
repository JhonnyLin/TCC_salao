package Telas;

import ClasseBD.ConexaoBD;
import classe.genericas.Configuracao;
import classe.genericas.Tabela;
import javax.swing.JOptionPane;

public class AbertoAgendamento extends javax.swing.JInternalFrame {

    public AbertoAgendamento(){
        initComponents();
        tb.criarTabelas(tblAgenda, nomes);
        agenda.agendamento();
        inicio();
    }
    String [] nomes = {"Data","Hora","Atendente","Cliente", "Descrição" };
    Configuracao config = new Configuracao();
    Tabela tb = new Tabela();
    classe.negocios.Agenda agenda = new classe.negocios.Agenda();
    Agendamento agendamento = new Agendamento(null, true);
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAgenda = new javax.swing.JTable();
        btnAgendar = new javax.swing.JButton();
        lblSubTitulo = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        btnCancelar1 = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();

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
        setTitle("Agendamento");
        setMaximumSize(new java.awt.Dimension(675, 479));
        setMinimumSize(new java.awt.Dimension(675, 479));
        setPreferredSize(new java.awt.Dimension(675, 479));
        getContentPane().setLayout(null);

        tblAgenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblAgenda);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 39, 490, 390);

        btnAgendar.setText("Novo");
        btnAgendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgendarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgendar);
        btnAgendar.setBounds(530, 320, 110, 31);

        lblSubTitulo.setText("7 dias");
        getContentPane().add(lblSubTitulo);
        lblSubTitulo.setBounds(90, 10, 250, 20);

        lblTitulo.setText("Informações:");
        getContentPane().add(lblTitulo);
        lblTitulo.setBounds(20, 10, 90, 20);

        btnCancelar1.setText("Cancelar");
        btnCancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelar1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar1);
        btnCancelar1.setBounds(530, 400, 110, 31);

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btnExcluir);
        btnExcluir.setBounds(530, 360, 110, 31);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgendarActionPerformed
        config.tela("Agendamento", agendamento);
        ConexaoBD.connect();
        agenda.limpar();
        agenda.agendamento();
        tb.limparTabela(tblAgenda, nomes);
        agenda.insTb(tb);
        ConexaoBD.desconnect();
        
    }//GEN-LAST:event_btnAgendarActionPerformed

    private void btnCancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelar1ActionPerformed
        dispose();// TODO add your handling code here:
    }//GEN-LAST:event_btnCancelar1ActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if(tblAgenda.getSelectedRow()==-1){
            JOptionPane.showMessageDialog(null, "Selecione o Agendamento");
        }else{
            if(JOptionPane.showConfirmDialog(null,"Excluir Agendamento?","Confirmação", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE)==0){
                 agenda.exluirBD(tblAgenda.getSelectedRow());
                 tb.limparTabela(tblAgenda, nomes);
                 agenda.insTb(tb);
            }
        } 
    }//GEN-LAST:event_btnExcluirActionPerformed

    public void inicio(){
        agenda.insTb(tb);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgendar;
    private javax.swing.JButton btnCancelar1;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblSubTitulo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tblAgenda;
    // End of variables declaration//GEN-END:variables
}
