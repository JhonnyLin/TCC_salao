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
        
        txtNmCliente.setEnabled(false);
        txtCdCliente.setEnabled(false);
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
        txtNmCliente = new javax.swing.JTextField();
        txtCdCliente = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
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
        bmnFrente = new javax.swing.JMenuBar();

        jMenu4.setText("File");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("Edit");
        jMenuBar2.add(jMenu5);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);
        setSize(new java.awt.Dimension(1500, 700));

        btnPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPerfilActionPerformed(evt);
            }
        });

        txtNmCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNmClienteActionPerformed(evt);
            }
        });

        txtCdCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCdClienteActionPerformed(evt);
            }
        });

        lblNome.setText("Nome:");

        lblCod.setText("Codigo:");

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
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
        );
        PnlTabelaLayout.setVerticalGroup(
            PnlTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlTabelaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        gbnSP.add(rbtServico);
        rbtServico.setSelected(true);
        rbtServico.setText("Serviços");
        rbtServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtServicoActionPerformed(evt);
            }
        });

        gbnSP.add(rbtProdutos);
        rbtProdutos.setText("Produtos");
        rbtProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtProdutosActionPerformed(evt);
            }
        });

        btnPesquisaSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaSPActionPerformed(evt);
            }
        });

        lblTotal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTotal.setText("Total");

        btnPagar.setText("PAGAR");
        btnPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagarActionPerformed(evt);
            }
        });

        lblInfSistema.setText("info do sistema");
        setJMenuBar(bmnFrente);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNome)
                                    .addComponent(txtNmCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblCod, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rbtServico)
                                .addGap(54, 54, 54)
                                .addComponent(rbtProdutos)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnPesquisaSP)
                            .addComponent(pnlMenuSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(PnlTabela, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(156, 156, 156)
                                .addComponent(btnPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtTotais, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblInfSistema, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PnlTabela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(103, 103, 103)
                                .addComponent(btnPesquisaSP)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtTotais, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(117, 117, 117))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblInfSistema)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblNome)
                                        .addGap(8, 8, 8)
                                        .addComponent(txtNmCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblCod)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtCdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(rbtServico)
                                    .addComponent(rbtProdutos))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pnlMenuSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNmClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNmClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNmClienteActionPerformed

    private void txtCdClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCdClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCdClienteActionPerformed

    private void btnRapido3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRapido3ActionPerformed
        criarTabela.confgTabela("3", txtTotais);
    }//GEN-LAST:event_btnRapido3ActionPerformed

    private void btnPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerfilActionPerformed
        c.inicializar(true);
        config.telaDialog("Cliente", c);
    }//GEN-LAST:event_btnPerfilActionPerformed

    private void btnPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagarActionPerformed
        String x = txtTotais.getText();
        if(tblCarrinho.getRowCount()==0){
            JOptionPane.showMessageDialog(null, "Não há produtos...");
        }else{
            //System.out.println(txtTotais.getText());            
            p.setValor(txtTotais.getText());            
            p.configinicializacao();
            config.telaDialog("Pagamento", p);
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
       config.telaDialog("Bucar Serviço ou Produto", bsp);
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
        this.txtCdCliente.setText(cod);
        this.txtNmCliente.setText(nome);
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
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JPanel pnlMenuSP;
    private javax.swing.JRadioButton rbtProdutos;
    private javax.swing.JRadioButton rbtServico;
    private javax.swing.JTable tblCarrinho;
    public javax.swing.JTextField txtCdCliente;
    public javax.swing.JTextField txtNmCliente;
    private javax.swing.JTextField txtTotais;
    // End of variables declaration//GEN-END:variables
}
