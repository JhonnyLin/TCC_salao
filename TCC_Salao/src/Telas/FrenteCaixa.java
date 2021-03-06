package Telas;

import javax.swing.JButton;
import classe.genericas.Imagens;
import ClasseBD.ConexaoBD;
import classe.genericas.Configuracao;
import classe.genericas.Tabela;
import classe.objetos.Atendimento;
import classe.objetos.Item;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

//fazer uma classe só pra chamadas
public class FrenteCaixa extends javax.swing.JFrame {
    
    public FrenteCaixa() {
        initComponents();
        //setExtendedState(MAXIMIZED_BOTH);
        inserirImg();
        txtTotais.setEnabled(false);
        rbtServicoActionPerformed(null);
        ConexaoBD.connect();
        criarTabela.criarTabelas(tblCarrinho, nomes);
        tblCarrinho.setEnabled(false);
    }
    String [] nomes = {"Cód","Descrição", "Qtde", "Vl Un.", "Vl Total"};
    Tabela criarTabela = new Tabela();
    Configuracao config = new Configuracao();
    Imagens imge =  new Imagens();
    Cliente c = new Cliente(null, true);
    BuscaSP bsp = new BuscaSP(null, true);
    ServProd s = new ServProd(null, true);
    ConexaoBD cxbd = new ConexaoBD();
    Atendimento atd = new Atendimento();
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        gbnSP = new javax.swing.ButtonGroup();
        btnPerfil = new javax.swing.JButton();
        lblSetNome = new javax.swing.JLabel();
        lblCod = new javax.swing.JLabel();
        pnlMenuSP = new javax.swing.JPanel();
        btnRapido7 = new javax.swing.JButton();
        btnRapido2 = new javax.swing.JButton();
        btnRapido3 = new javax.swing.JButton();
        btnRapido4 = new javax.swing.JButton();
        btnRapido5 = new javax.swing.JButton();
        btnRapido6 = new javax.swing.JButton();
        btnRapido13 = new javax.swing.JButton();
        btnRapido9 = new javax.swing.JButton();
        btnRapido10 = new javax.swing.JButton();
        btnRapido1 = new javax.swing.JButton();
        btnRapido8 = new javax.swing.JButton();
        btnRapido12 = new javax.swing.JButton();
        btnRapido14 = new javax.swing.JButton();
        btnRapido15 = new javax.swing.JButton();
        btnRapido16 = new javax.swing.JButton();
        btnRapido11 = new javax.swing.JButton();
        btnRapido17 = new javax.swing.JButton();
        btnRapido18 = new javax.swing.JButton();
        btnRapido19 = new javax.swing.JButton();
        btnRapido20 = new javax.swing.JButton();
        PnlTabela = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCarrinho = new javax.swing.JTable();
        rbtServico = new javax.swing.JRadioButton();
        rbtProdutos = new javax.swing.JRadioButton();
        btnPesquisaSP = new javax.swing.JButton();
        lblTotal = new javax.swing.JLabel();
        txtTotais = new javax.swing.JTextField();
        btnPagar = new javax.swing.JButton();
        lblInfSistema = new javax.swing.JLabel();
        lblNome1 = new javax.swing.JLabel();
        lblSetCodigo = new javax.swing.JLabel();
        bmnFrente = new javax.swing.JMenuBar();

        jMenu4.setText("File");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("Edit");
        jMenuBar2.add(jMenu5);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setMinimumSize(new java.awt.Dimension(984, 680));
        setResizable(false);
        setSize(new java.awt.Dimension(1500, 700));
        getContentPane().setLayout(null);

        btnPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPerfilActionPerformed(evt);
            }
        });
        getContentPane().add(btnPerfil);
        btnPerfil.setBounds(23, 29, 95, 101);

        lblSetNome.setText("xxxxxxx xxxxxxx xxxxxx");
        getContentPane().add(lblSetNome);
        lblSetNome.setBounds(130, 100, 240, 20);

        lblCod.setText("Nome:");
        getContentPane().add(lblCod);
        lblCod.setBounds(124, 77, 80, 20);

        pnlMenuSP.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnRapido7.setText("jButton2");
        btnRapido7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRapido7ActionPerformed(evt);
            }
        });

        btnRapido2.setText("jButton3");
        btnRapido2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRapido2ActionPerformed(evt);
            }
        });

        btnRapido3.setText("jButton4");
        btnRapido3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRapido3ActionPerformed(evt);
            }
        });

        btnRapido4.setText("jButton5");
        btnRapido4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRapido4ActionPerformed(evt);
            }
        });

        btnRapido5.setText("jButton5");
        btnRapido5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRapido5ActionPerformed(evt);
            }
        });

        btnRapido6.setText("jButton7");
        btnRapido6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRapido6ActionPerformed(evt);
            }
        });

        btnRapido13.setText("jButton8");
        btnRapido13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRapido13ActionPerformed(evt);
            }
        });

        btnRapido9.setText("jButton9");
        btnRapido9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRapido9ActionPerformed(evt);
            }
        });

        btnRapido10.setText("jButton2");
        btnRapido10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRapido10ActionPerformed(evt);
            }
        });

        btnRapido1.setText("jButton1");
        btnRapido1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRapido1ActionPerformed(evt);
            }
        });

        btnRapido8.setText("jButton2");
        btnRapido8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRapido8ActionPerformed(evt);
            }
        });

        btnRapido12.setText("jButton2");
        btnRapido12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRapido12ActionPerformed(evt);
            }
        });

        btnRapido14.setText("jButton2");
        btnRapido14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRapido14ActionPerformed(evt);
            }
        });

        btnRapido15.setText("jButton2");
        btnRapido15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRapido15ActionPerformed(evt);
            }
        });

        btnRapido16.setText("jButton2");
        btnRapido16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRapido16ActionPerformed(evt);
            }
        });

        btnRapido11.setText("jButton2");
        btnRapido11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRapido11ActionPerformed(evt);
            }
        });

        btnRapido17.setText("jButton2");
        btnRapido17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRapido17ActionPerformed(evt);
            }
        });

        btnRapido18.setText("jButton2");
        btnRapido18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRapido18ActionPerformed(evt);
            }
        });

        btnRapido19.setText("jButton2");
        btnRapido19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRapido19ActionPerformed(evt);
            }
        });

        btnRapido20.setText("jButton2");
        btnRapido20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRapido20ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlMenuSPLayout = new javax.swing.GroupLayout(pnlMenuSP);
        pnlMenuSP.setLayout(pnlMenuSPLayout);
        pnlMenuSPLayout.setHorizontalGroup(
            pnlMenuSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuSPLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pnlMenuSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMenuSPLayout.createSequentialGroup()
                        .addGroup(pnlMenuSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRapido5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRapido1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(pnlMenuSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnlMenuSPLayout.createSequentialGroup()
                                .addComponent(btnRapido2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(btnRapido3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlMenuSPLayout.createSequentialGroup()
                                .addComponent(btnRapido6, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnRapido7, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pnlMenuSPLayout.createSequentialGroup()
                        .addComponent(btnRapido9, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRapido10, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(btnRapido11, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMenuSPLayout.createSequentialGroup()
                        .addGroup(pnlMenuSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlMenuSPLayout.createSequentialGroup()
                                .addComponent(btnRapido17, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnRapido18, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlMenuSPLayout.createSequentialGroup()
                                .addComponent(btnRapido13, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnRapido14, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(31, 31, 31)
                        .addGroup(pnlMenuSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnRapido15, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRapido19, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(31, 31, 31)
                .addGroup(pnlMenuSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRapido12, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRapido4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRapido8, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRapido16, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRapido20, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );
        pnlMenuSPLayout.setVerticalGroup(
            pnlMenuSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuSPLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(pnlMenuSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRapido2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRapido3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRapido4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRapido1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(pnlMenuSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRapido5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMenuSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnRapido6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnRapido7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnRapido8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(pnlMenuSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRapido9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRapido10, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRapido12, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRapido11, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlMenuSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRapido13, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRapido14, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRapido15, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRapido16, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlMenuSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRapido17, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRapido18, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRapido19, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRapido20, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(pnlMenuSP);
        pnlMenuSP.setBounds(10, 170, 438, 457);

        PnlTabela.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tblCarrinho.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblCarrinho);

        javax.swing.GroupLayout PnlTabelaLayout = new javax.swing.GroupLayout(PnlTabela);
        PnlTabela.setLayout(PnlTabelaLayout);
        PnlTabelaLayout.setHorizontalGroup(
            PnlTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
        );
        PnlTabelaLayout.setVerticalGroup(
            PnlTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlTabelaLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(PnlTabela);
        PnlTabela.setBounds(480, 30, 480, 454);

        gbnSP.add(rbtServico);
        rbtServico.setSelected(true);
        rbtServico.setText("Serviços");
        rbtServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtServicoActionPerformed(evt);
            }
        });
        getContentPane().add(rbtServico);
        rbtServico.setBounds(23, 148, 100, 23);

        gbnSP.add(rbtProdutos);
        rbtProdutos.setText("Produtos");
        rbtProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtProdutosActionPerformed(evt);
            }
        });
        getContentPane().add(rbtProdutos);
        rbtProdutos.setBounds(142, 148, 120, 23);

        btnPesquisaSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaSPActionPerformed(evt);
            }
        });
        getContentPane().add(btnPesquisaSP);
        btnPesquisaSP.setBounds(400, 120, 50, 40);

        lblTotal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTotal.setText("Total");
        getContentPane().add(lblTotal);
        lblTotal.setBounds(478, 502, 137, 38);
        getContentPane().add(txtTotais);
        txtTotais.setBounds(810, 500, 154, 38);

        btnPagar.setText("PAGAR");
        btnPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagarActionPerformed(evt);
            }
        });
        getContentPane().add(btnPagar);
        btnPagar.setBounds(630, 550, 180, 63);

        lblInfSistema.setText("info do sistema");
        getContentPane().add(lblInfSistema);
        lblInfSistema.setBounds(840, 630, 140, 14);

        lblNome1.setText("Codigo:");
        getContentPane().add(lblNome1);
        lblNome1.setBounds(124, 29, 80, 20);

        lblSetCodigo.setText("0000000");
        getContentPane().add(lblSetCodigo);
        lblSetCodigo.setBounds(130, 50, 240, 20);
        setJMenuBar(bmnFrente);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRapido3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRapido3ActionPerformed
        if(rbtServico.isSelected() == true){
            criarItem("5");
        }else{
            criarItem("0");
        }
    }//GEN-LAST:event_btnRapido3ActionPerformed

    private void btnPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerfilActionPerformed
        c.inicializar(true);
        config.tela("Cliente", c);
        if(c.cancelar){
            lblSetCodigo.setText(c.cliente.getCod());
            lblSetNome.setText(c.cliente.getNome());
            atd.setCliente(c.cliente.getCod());
            c.cancelar=false;
        }
    }//GEN-LAST:event_btnPerfilActionPerformed

    private void btnPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagarActionPerformed
        if(tblCarrinho.getRowCount()==0){
            JOptionPane.showMessageDialog(null, "Não há produtos...");
        }else{
            if(lblSetCodigo.getText().equals("0000000")){
                JOptionPane.showMessageDialog(null, "Por favor, insira o cliente");
            }else{
                Pagamento p = new Pagamento(null, true);
                p.setAtendiemnto(atd);   
                config.tela("Pagamento", p);
                if(p.cancelar){//pra ver se foi cancelado o pagamento ou não
                    criarTabela.limparTabela(tblCarrinho, nomes, txtTotais);
                    try {
                        atd.id_atendimentoBD();
                    } catch (SQLException ex) {
                        Logger.getLogger(FrenteCaixa.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    atd.construtor();
                    lblSetCodigo.setText("0000000");
                    lblSetNome.setText("xxxxxxx xxxxxxx xxxxxx");
                    p.cancelar = false;
                }
                
            }           
           
        }
    
    }//GEN-LAST:event_btnPagarActionPerformed

    private void rbtProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtProdutosActionPerformed
        ProdServ(true);
    }//GEN-LAST:event_rbtProdutosActionPerformed

    private void btnPesquisaSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaSPActionPerformed
        //se rbnProdutos estiver selecionado
        if(rbtProdutos.isSelected()){
           bsp.configPruduto();
       }else{
           bsp.configServico();
       }
       config.tela("Bucar Serviço ou Produto", bsp);
        criarItem(bsp.codSP);
    }//GEN-LAST:event_btnPesquisaSPActionPerformed

    private void rbtServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtServicoActionPerformed
        ProdServ(false);
    }//GEN-LAST:event_rbtServicoActionPerformed

    private void btnRapido1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRapido1ActionPerformed
       if(rbtServico.isSelected() == true){
           criarItem("1");
       }else{
           criarItem("2");
       }
    }//GEN-LAST:event_btnRapido1ActionPerformed

    private void btnRapido2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRapido2ActionPerformed
        if(rbtServico.isSelected() == true){
            criarItem("4");
        }else{
            criarItem("8");
        }        
    }//GEN-LAST:event_btnRapido2ActionPerformed

    private void btnRapido4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRapido4ActionPerformed
        if(rbtServico.isSelected() == true){
            criarItem("6");
        }else{
            criarItem("9");
        }
    }//GEN-LAST:event_btnRapido4ActionPerformed

    private void btnRapido5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRapido5ActionPerformed
        if(rbtServico.isSelected() == true){
            criarItem("6");
        }else{
            criarItem("11");
        }
    }//GEN-LAST:event_btnRapido5ActionPerformed

    private void btnRapido6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRapido6ActionPerformed
        if(rbtServico.isSelected() == true){
            criarItem("7");
        }else{
            criarItem("10");
        }
    }//GEN-LAST:event_btnRapido6ActionPerformed

    private void btnRapido7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRapido7ActionPerformed
        if(rbtServico.isSelected() == true){
            criarItem("13");
        }else{
            criarItem("12");
        }
    }//GEN-LAST:event_btnRapido7ActionPerformed

    private void btnRapido8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRapido8ActionPerformed
        if(rbtServico.isSelected() == true){
            criarItem("15");
        }else{
            criarItem("1");
        }
    }//GEN-LAST:event_btnRapido8ActionPerformed

    private void btnRapido9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRapido9ActionPerformed
        if(rbtServico.isSelected() == true){
            criarItem("16");
        }else{
            criarItem("1");
        }
    }//GEN-LAST:event_btnRapido9ActionPerformed

    private void btnRapido10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRapido10ActionPerformed
        if(rbtServico.isSelected() == true){
            criarItem("16");
        }else{
            criarItem("1");
        }
    }//GEN-LAST:event_btnRapido10ActionPerformed

    private void btnRapido11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRapido11ActionPerformed
//        criarTabela.confgTabela("11",txtTotais);
    }//GEN-LAST:event_btnRapido11ActionPerformed

    private void btnRapido12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRapido12ActionPerformed
//        criarTabela.confgTabela("12", txtTotais);
    }//GEN-LAST:event_btnRapido12ActionPerformed

    private void btnRapido13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRapido13ActionPerformed
//        criarTabela.confgTabela("13",txtTotais);
    }//GEN-LAST:event_btnRapido13ActionPerformed

    private void btnRapido14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRapido14ActionPerformed
//        criarTabela.confgTabela("14",txtTotais);
    }//GEN-LAST:event_btnRapido14ActionPerformed

    private void btnRapido15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRapido15ActionPerformed
//        criarTabela.confgTabela("15",txtTotais);
    }//GEN-LAST:event_btnRapido15ActionPerformed

    private void btnRapido16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRapido16ActionPerformed
//        criarTabela.confgTabela("16", txtTotais);
    }//GEN-LAST:event_btnRapido16ActionPerformed

    private void btnRapido17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRapido17ActionPerformed
//        criarTabela.confgTabela("17", txtTotais);
    }//GEN-LAST:event_btnRapido17ActionPerformed

    private void btnRapido18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRapido18ActionPerformed
//        criarTabela.confgTabela("18",txtTotais);
    }//GEN-LAST:event_btnRapido18ActionPerformed

    private void btnRapido19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRapido19ActionPerformed
//        criarTabela.confgTabela("19", txtTotais);
    }//GEN-LAST:event_btnRapido19ActionPerformed

    private void btnRapido20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRapido20ActionPerformed
//        criarTabela.confgTabela("20",txtTotais);
    }//GEN-LAST:event_btnRapido20ActionPerformed

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
            java.util.logging.Logger.getLogger(FrenteCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrenteCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrenteCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrenteCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrenteCaixa().setVisible(true);
            }
        });  
        
        
    }
    
    public String quarySP(String texto){
        String q = "SELECT * FROM servprod WHERE ";
        String query = q+"cd_ServProd"+"= '"+texto+"'";
        return query;
    }
        
    public void criarItem(String cod){
        ConexaoBD.connect();
        ResultSet rs = ConexaoBD.rsexecutar(quarySP(cod));
        try {
            while(rs.next()){
                classe.objetos.Item item = new classe.objetos.Item( rs.getString(1), //cod
                                                                    rs.getString(2), //serviço?
                                                                    rs.getString(3), //nome
                                                                    rs.getString(4), //ds
                                                                    rs.getString(6), //vl
                                                                    rs.getString(5),              //custo
                                                                    rs.getString(7));//qntd
                
//                System.out.println(rs.getString(1));
//                System.out.println(rs.getString(2));
//                System.out.println(rs.getString(3));
//                System.out.println(rs.getString(4));
//                System.out.println(rs.getString(6));
//                System.out.println(rs.getString(5));
//                System.out.println(rs.getString(7));
                atd.inserir(item, criarTabela);
                txtTotais.setText(""+atd.getTotal());
            }
                        
        } catch (SQLException ex) {
            Logger.getLogger(FrenteCaixa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void inserirImg(){
        JButton [] btnImg = {btnPerfil, btnPesquisaSP};
        String [] urlImg = {"woman1.png", "url.png"};
        imge.multiplasImagens(urlImg, btnImg);
    }
         
    public void ProdServ(Boolean sP){
        JButton [] btn = {btnRapido1, btnRapido2, btnRapido3, btnRapido4, btnRapido5, btnRapido6, btnRapido7, btnRapido8, btnRapido9, btnRapido10,btnRapido11, btnRapido12, btnRapido13, btnRapido14, btnRapido15, btnRapido16, btnRapido17, btnRapido18, btnRapido19, btnRapido20 };
        String [] codProduto = {"kit A","Kit B","Kit C","S.L.A","C.L.A","S.NANO","C.NANO","CAD","CAD","CAD","CAD","CADP","CAD","CAD","CAD","CAD","CAD","CAD","CAD","CAD"};
        String [] codServico = {"Escova","Chapa","Sombra","S.Rena","S.Limp","C.M.1","C.M.T","C.M.N","C.FEM","CAD","CAD","CAD","CAD","CAD","CAD","CAD","CAD","CAD","CAD","CAD"};
        //serviços
        if(sP){
            for(int i =0; i<btn.length;i++){
                btn[i].setText(codProduto[i]);
            }
        }else{
            for(int i =0; i<btn.length;i++){
                btn[i].setText(codServico[i]);
            }
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PnlTabela;
    private javax.swing.JMenuBar bmnFrente;
    private javax.swing.JButton btnPagar;
    private javax.swing.JButton btnPerfil;
    private javax.swing.JButton btnPesquisaSP;
    private javax.swing.JButton btnRapido1;
    private javax.swing.JButton btnRapido10;
    private javax.swing.JButton btnRapido11;
    private javax.swing.JButton btnRapido12;
    private javax.swing.JButton btnRapido13;
    private javax.swing.JButton btnRapido14;
    private javax.swing.JButton btnRapido15;
    private javax.swing.JButton btnRapido16;
    private javax.swing.JButton btnRapido17;
    private javax.swing.JButton btnRapido18;
    private javax.swing.JButton btnRapido19;
    private javax.swing.JButton btnRapido2;
    private javax.swing.JButton btnRapido20;
    private javax.swing.JButton btnRapido3;
    private javax.swing.JButton btnRapido4;
    private javax.swing.JButton btnRapido5;
    private javax.swing.JButton btnRapido6;
    private javax.swing.JButton btnRapido7;
    private javax.swing.JButton btnRapido8;
    private javax.swing.JButton btnRapido9;
    private javax.swing.ButtonGroup gbnSP;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCod;
    private javax.swing.JLabel lblInfSistema;
    private javax.swing.JLabel lblNome1;
    private javax.swing.JLabel lblSetCodigo;
    private javax.swing.JLabel lblSetNome;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JPanel pnlMenuSP;
    private javax.swing.JRadioButton rbtProdutos;
    private javax.swing.JRadioButton rbtServico;
    private javax.swing.JTable tblCarrinho;
    private javax.swing.JTextField txtTotais;
    // End of variables declaration//GEN-END:variables
}
