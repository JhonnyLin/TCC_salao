package Telas;

import classe.Imagens;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Pagamento extends javax.swing.JDialog {

    public Pagamento(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        inserirImg();
        configinicializacao();
    }
    
    boolean x =  true;
    String valor;
    Imagens imge = new Imagens();
    double acomulado = 0;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblValor = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        cbxTotal = new javax.swing.JCheckBox();
        btnFiado = new javax.swing.JButton();
        btnDinheiro = new javax.swing.JButton();
        btnCartao = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblValor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblValor.setText("VALOR");

        cbxTotal.setSelected(true);
        cbxTotal.setText("TOTAL");
        cbxTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTotalActionPerformed(evt);
            }
        });

        btnFiado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiadoActionPerformed(evt);
            }
        });

        btnDinheiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDinheiroActionPerformed(evt);
            }
        });

        btnCartao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCartaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 421, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblValor, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(cbxTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnDinheiro, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(30, 30, 30)
                            .addComponent(btnCartao, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(27, 27, 27)
                            .addComponent(btnFiado, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 266, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblValor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(cbxTotal)))
                    .addGap(40, 40, 40)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnDinheiro, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCartao, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnFiado, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cbxTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTotalActionPerformed
        estado();
    }//GEN-LAST:event_cbxTotalActionPerformed

    private void btnFiadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiadoActionPerformed
        JOptionPane.showMessageDialog(null, "modulo ainda n disponivel");
    }//GEN-LAST:event_btnFiadoActionPerformed

    private void btnDinheiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDinheiroActionPerformed
        pag();
    }//GEN-LAST:event_btnDinheiroActionPerformed

    private void btnCartaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCartaoActionPerformed
        pag();
    }//GEN-LAST:event_btnCartaoActionPerformed

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
            java.util.logging.Logger.getLogger(Pagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Pagamento dialog = new Pagamento(new javax.swing.JFrame(), true);
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
   //faz a subitração do valor
    public void pag(){
        //pega o valor que veio do frentecx e transforma em double(vem texto)
        double x = Double.parseDouble(valor);
        //pega um a variavel e soma o valor acomulado mais oq tem no txt pra saber o valor total pago
        double y = acomulado+= Double.parseDouble(txtValor.getText());
        //se o valor total - valor for maior que zero quer dizer que ainda falta uma quantia
        if(x-y > 0){
            //devolve o valor da operação "0.00"
            txtValor.setText(x-y+"");
        }else{
            //printa o valor do troco
            JOptionPane.showMessageDialog(null, "Troco: R$ "+ ((x-y)*-1));
            //zera o acomulado
            acomulado = 0.00;
            txtValor.setText(acomulado+"");
        }
        configinicializacao();
        ativo();
    }
    
    //insere o valor no campo
    public void setValor(String valor){
        txtValor.setText(valor);
        this.valor = valor;
    }
    
    //config do fram
    public void configinicializacao(){
        x =  true;
        cbxTotal.setSelected(x);
        estado();
        
    }
    
    //alterna o valor de x que determina se o txt fica ativo ou não
    public void estado(){
        //se for vdd troca pra false e bloquei
        if(x){
            x = false;
            txtValor.setEnabled(x);
        //se for falsso troca pra true e libera
        }else{
            x = true;
            txtValor.setEnabled(x);
        }
    }
    
    //se o valor é igual a zero ele fecha o pagamentos
    public void ativo(){
        if(txtValor.getText().equals("0.0")){
            dispose();
        }
    }
    
    //insere imagens do frame
    public void inserirImg(){
        JButton [] bntImg = {btnDinheiro, btnCartao, btnFiado};
        String [] img = {"money.png", "pay.png","bill.png"};
        imge.multiplasImagens(img, bntImg);        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCartao;
    private javax.swing.JButton btnDinheiro;
    private javax.swing.JButton btnFiado;
    private javax.swing.JCheckBox cbxTotal;
    private javax.swing.JLabel lblValor;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
