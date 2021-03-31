package Telas;

import javax.swing.JButton;
import classe.Imagens;
import ClasseBD.ConexaoBD;
import classe.Configuracao;
import classe.Tabela;
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
    Fornecedor f = new Fornecedor(null, true);
    Pagamento p = new Pagamento(null, true);
    ServProd s = new ServProd(null, true);
    ConexaoBD cxbd = new ConexaoBD();
    

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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
        criarTabela.confgTabela("3", txtTotais);
    }//GEN-LAST:event_btnRapido3ActionPerformed

    private void btnPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerfilActionPerformed
        c.inicializar(true);
        config.tela("Cliente", c);
    }//GEN-LAST:event_btnPerfilActionPerformed

    private void btnPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagarActionPerformed
        String x = txtTotais.getText();
        if(tblCarrinho.getRowCount()==0){
            JOptionPane.showMessageDialog(null, "Não há produtos...");
        }else{
            //System.out.println(txtTotais.getText());            
            p.setValor(txtTotais.getText());            
            p.configinicializacao();
            config.tela("Pagamento", p);
            criarTabela.limparTabela(tblCarrinho, nomes, txtTotais);
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
    }//GEN-LAST:event_btnPesquisaSPActionPerformed

    private void rbtServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtServicoActionPerformed
        ProdServ(false);
    }//GEN-LAST:event_rbtServicoActionPerformed

    private void btnRapido1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRapido1ActionPerformed
       criarTabela.confgTabela( "1", txtTotais);
       if(rbtServico.isSelected() == true){
           JOptionPane.showMessageDialog(null, "serviço");
       }else{
           JOptionPane.showMessageDialog(null, "produto");
       }
    }//GEN-LAST:event_btnRapido1ActionPerformed

    private void btnRapido2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRapido2ActionPerformed
        criarTabela.confgTabela("2",txtTotais);
    }//GEN-LAST:event_btnRapido2ActionPerformed

    private void btnRapido4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRapido4ActionPerformed
        criarTabela.confgTabela("4",txtTotais);
    }//GEN-LAST:event_btnRapido4ActionPerformed

    private void btnRapido5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRapido5ActionPerformed
        criarTabela.confgTabela("5", txtTotais);
    }//GEN-LAST:event_btnRapido5ActionPerformed

    private void btnRapido6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRapido6ActionPerformed
        criarTabela.confgTabela("6", txtTotais);
    }//GEN-LAST:event_btnRapido6ActionPerformed

    private void btnRapido7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRapido7ActionPerformed
        criarTabela.confgTabela("7", txtTotais);
    }//GEN-LAST:event_btnRapido7ActionPerformed

    private void btnRapido8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRapido8ActionPerformed
        criarTabela.confgTabela("8", txtTotais);
    }//GEN-LAST:event_btnRapido8ActionPerformed

    private void btnRapido9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRapido9ActionPerformed
        criarTabela.confgTabela("9",txtTotais);
    }//GEN-LAST:event_btnRapido9ActionPerformed

    private void btnRapido10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRapido10ActionPerformed
        criarTabela.confgTabela("10", txtTotais);
    }//GEN-LAST:event_btnRapido10ActionPerformed

    private void btnRapido11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRapido11ActionPerformed
        criarTabela.confgTabela("11",txtTotais);
    }//GEN-LAST:event_btnRapido11ActionPerformed

    private void btnRapido12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRapido12ActionPerformed
        criarTabela.confgTabela("12", txtTotais);
    }//GEN-LAST:event_btnRapido12ActionPerformed

    private void btnRapido13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRapido13ActionPerformed
        criarTabela.confgTabela("13",txtTotais);
    }//GEN-LAST:event_btnRapido13ActionPerformed

    private void btnRapido14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRapido14ActionPerformed
        criarTabela.confgTabela("14",txtTotais);
    }//GEN-LAST:event_btnRapido14ActionPerformed

    private void btnRapido15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRapido15ActionPerformed
        criarTabela.confgTabela("15",txtTotais);
    }//GEN-LAST:event_btnRapido15ActionPerformed

    private void btnRapido16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRapido16ActionPerformed
        criarTabela.confgTabela("16", txtTotais);
    }//GEN-LAST:event_btnRapido16ActionPerformed

    private void btnRapido17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRapido17ActionPerformed
        criarTabela.confgTabela("17", txtTotais);
    }//GEN-LAST:event_btnRapido17ActionPerformed

    private void btnRapido18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRapido18ActionPerformed
        criarTabela.confgTabela("18",txtTotais);
    }//GEN-LAST:event_btnRapido18ActionPerformed

    private void btnRapido19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRapido19ActionPerformed
        criarTabela.confgTabela("19", txtTotais);
    }//GEN-LAST:event_btnRapido19ActionPerformed

    private void btnRapido20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRapido20ActionPerformed
        criarTabela.confgTabela("20",txtTotais);
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
    
    //minhas clases
//    public void limparTabela(){
//        dtm = new DefaultTableModel();
//        criarTabela.criarTabelas(tblCarrinho, nomes);
//        txtTotais.setText("");
//    }
    
//    private void criarTabela(){   
//            //adiciona as colunas
//            tblCarrinho.setModel(dtm);
//            //qtd colunas
//            int qtdcoluna = 5;
//            String [] nomes = {"Cód","Descrição", "Qtde", "Vl Un.", "Vl Total"};  
//            //add as colunas na tabela
//            for(int i =0; i<qtdcoluna; i++){
//                //adiciona os nomes no dtm que é o model
//                //ele é quem adiciona os dados na tabela
//                dtm.addColumn(nomes[i]);
//            }
//           
//    }
    
//    public void confgTabela(String cod, String q){
//        boolean fdp = true;
//        if(dtm.getRowCount() != 0){
//            //posso colocar return para melhorar o processamento
//            for(int i =0; i<dtm.getRowCount(); i++ ){
//                if(dtm.getValueAt(i, 0).equals(cod)){
//                    int a = Integer.parseInt(dtm.getValueAt(i, 2).toString());
//                    a++;
//                    dtm.setValueAt(a, i, 2);
//                    fdp = false;
//                    valorQt(i);
//                }
//            }
//        }
//        if(fdp){
//            inserirSP(q);
//            valorQt(dtm.getRowCount()-1);
//        }
//        somaTotal();
//    }
//    
//    private void somaTotal(){
//        double b = 0;
//        for(int i = 0; i<dtm.getRowCount(); i++){
//            String a = dtm.getValueAt(i, 4).toString();
//            double c = Double.parseDouble(a);
//            b = b + c;
//            txtTotais.setText(""+b);
//        }
//    }
//    
//    private void inserirSP(String q){
//        
//        try{
//            //a execução do comando será feita pelo método rsexecutar, na classe AcesspBD
//            //o retorno do metodo sera um Resulset que sera armazenado em rsresultado
//            rsresultado = ConexaoBD.rsexecutar(q);
//           
//            //adicionar as linhas
//            //array que guarda os dados de cada linha
//            String [] row = new String[5];
//            while(rsresultado.next()){
//                int y = 1;
//                for(int i=0;i<row.length;i++){
//                    //adcionaos dados no array
//                    if(i!=2 && i != 4){
//                        row[i] = rsresultado.getString(y);
//                        y++;
//                    }else{
//                        if(i==2){
//                            row[i] = "1";
//                        }
//                    }  
//                }
//                //adicionar a linha toda na tabela
//                dtm.addRow(row);
//            }
//        }catch(Exception e){e.printStackTrace();}  
//    }
//    
//    private void valorQt(int i){
//        double c = Double.parseDouble(dtm.getValueAt(i, 3).toString());
//        double b = Double.parseDouble(dtm.getValueAt(i, 2).toString());
//        b = b * c;
//        dtm.setValueAt(b, i, 4);
//    }
 
    public void inserirImg(){
        JButton [] btnImg = {btnPerfil, btnPesquisaSP};
        String [] urlImg = {"woman1.png", "url.png"};
        imge.multiplasImagens(urlImg, btnImg);
    }
         
    public void ProdServ(Boolean sP){
        JButton [] btn = {btnRapido1, btnRapido2, btnRapido3, btnRapido4, btnRapido5, btnRapido6, btnRapido7, btnRapido8, btnRapido9, btnRapido10,btnRapido11, btnRapido12, btnRapido13, btnRapido14, btnRapido15, btnRapido16, btnRapido17, btnRapido18, btnRapido19, btnRapido20 };
        String [] codProduto = {"exp1P","exp2P","exp3P","exp4P","exp5P","exp6P","exp7P","exp8P","exp9P","exp10P","exp11P","exp12P","exp13P","exp14P","exp15P","exp16P","exp17P","exp18P","exp19P","exp20P"};
        String [] codServico = {"exp1","exp2","exp3","exp4","exp5","exp6","exp7","exp8","exp9","exp10","exp11","exp12","exp13","exp14","exp15","exp16","exp17","exp18","exp19","exp20"};
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
    
    public void setCliente(String nome, String cod){
        this.lblSetCodigo.setText(cod);
        this.lblSetNome.setText(nome);
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
