
package com.mycompany.telas;

/**
 *
 * @author Leonardo de Souza da Luz
 * https://github.com/LeonS7
 */

import com.mycompany.entidades.*;
import com.mycompany.DAO.*;
import javax.swing.JOptionPane;

/**
 * A classe Sistema representa a interface gráfica de um sistema bancário.
 * Permite ao usuário realizar operações como saque, depósito, transferência e imprimir extrato.
 */
public class Sistema extends javax.swing.JFrame {

    // Variáveis de instância para armazenar dados da conta do usuário
    String nome;
    String cpf;
    double saldo;
    String numeroConta;
    String senha;

    // Obtém o ResourceBundle contendo as mensagens internacionalizadas
    Internacionalizacao traducao = new Internacionalizacao();
    
    /**
     * Construtor da classe Sistema que inicializa a interface gráfica com os dados da conta.
     * @param conta A conta do usuário para exibir informações na interface.
     */
    public Sistema(Conta conta) {
        //Faz a traducao dos componentes da interface
        Label_titulo.setText(traducao.getTraducao("Label_titulo"));
        Label_saldo.setText(traducao.getTraducao("Label_saldo"));
        Label_vsacado.setText(traducao.getTraducao("Label_vsacado"));
        Label_vdepositado.setText(traducao.getTraducao("Label_vdepositado"));
        Label_banco.setText(traducao.getTraducao("Label_banco"));
        Label_nconta.setText(traducao.getTraducao("Label_nconta"));
        Label_valor.setText(traducao.getTraducao("Label_valor"));
        bt_imprimiExtrato.setText(traducao.getTraducao("bt_imprimiExtrato"));
        bt_sacar.setText(traducao.getTraducao("bt_sacar"));
        bt_depositar.setText(traducao.getTraducao("bt_depositar"));
        bt_transferir.setText(traducao.getTraducao("bt_tranferir"));
        s_botaoSaque.setText(traducao.getTraducao("s_botaoSacar"));
        s_botaoDeposito.setText(traducao.getTraducao("s_botaoDepositar"));
        s_botaoTransferencia.setText(traducao.getTraducao("s_botaoTranferir"));
        
        initComponents();
        // Exibe os dados da conta na interface
        telaMostraDados.setText(conta.toString());
        // Exibe o saldo da conta
        mostraSaldo.setText(String.valueOf(conta.getSaldo()));
        
        // Inicializa as variáveis com os dados da conta
        nome = conta.getNome();
        cpf = conta.getCpf();
        saldo = conta.getSaldo();
        numeroConta = conta.getNumeroConta();
        senha = conta.getSenha();
        
        // Controla a visibilidade dos componentes dependendo da seleção do botão
        if(s_botaoSaque.isSelected()){
            valorDeposito.setEnabled(false);
            bt_depositar.setEnabled(false);
            bancoTransferencia.setEnabled(false);
            contaTransferencia.setEnabled(false);
            valorTransferencia.setEnabled(false);
            bt_transferir.setEnabled(false);
        }else{
            if(s_botaoDeposito.isSelected()){
                valorSaque.setEnabled(false);
                bt_sacar.setEnabled(false);
                bancoTransferencia.setEnabled(false);
                contaTransferencia.setEnabled(false);
                valorTransferencia.setEnabled(false);
                bt_transferir.setEnabled(false);
            }else{
                if(s_botaoTransferencia.isSelected()){
                    valorSaque.setEnabled(false);
                    bt_sacar.setEnabled(false);
                    valorDeposito.setEnabled(false);
                    bt_depositar.setEnabled(false);
                }
            }
            valorSaque.setEnabled(false);
            bt_sacar.setEnabled(false);
            valorDeposito.setEnabled(false);
            bt_depositar.setEnabled(false);
            bancoTransferencia.setEnabled(false);
            contaTransferencia.setEnabled(false);
            valorTransferencia.setEnabled(false);
            bt_transferir.setEnabled(false);
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        Label_titulo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        telaMostraDados = new javax.swing.JTextArea();
        Label_saldo = new javax.swing.JLabel();
        mostraSaldo = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        telaMostraExtrato = new javax.swing.JTextArea();
        bt_imprimiExtrato = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        Label_vsacado = new javax.swing.JLabel();
        valorSaque = new javax.swing.JTextField();
        bt_sacar = new javax.swing.JButton();
        s_botaoSaque = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        Label_vdepositado = new javax.swing.JLabel();
        valorDeposito = new javax.swing.JTextField();
        bt_depositar = new javax.swing.JButton();
        s_botaoDeposito = new javax.swing.JRadioButton();
        bt_logout = new javax.swing.JButton();
        Label_extrato = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        Label_nconta = new javax.swing.JLabel();
        contaTransferencia = new javax.swing.JTextField();
        valorTransferencia = new javax.swing.JTextField();
        Label_valor = new javax.swing.JLabel();
        Label_banco = new javax.swing.JLabel();
        bancoTransferencia = new javax.swing.JTextField();
        bt_transferir = new javax.swing.JButton();
        s_botaoTransferencia = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Label_titulo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Label_titulo.setForeground(new java.awt.Color(255, 255, 255));
        Label_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_titulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bank (1).png"))); // NOI18N
        Label_titulo.setText("Banco Generico");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Label_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Label_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        telaMostraDados.setEditable(false);
        telaMostraDados.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.background"));
        telaMostraDados.setColumns(20);
        telaMostraDados.setForeground(new java.awt.Color(255, 255, 255));
        telaMostraDados.setRows(5);
        jScrollPane1.setViewportView(telaMostraDados);

        Label_saldo.setForeground(new java.awt.Color(255, 255, 255));
        Label_saldo.setText("Saldo: ");

        mostraSaldo.setEditable(false);
        mostraSaldo.setBackground(new java.awt.Color(102, 102, 102));
        mostraSaldo.setForeground(new java.awt.Color(255, 255, 255));

        telaMostraExtrato.setEditable(false);
        telaMostraExtrato.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.background"));
        telaMostraExtrato.setColumns(20);
        telaMostraExtrato.setForeground(new java.awt.Color(255, 255, 255));
        telaMostraExtrato.setRows(5);
        jScrollPane2.setViewportView(telaMostraExtrato);

        bt_imprimiExtrato.setBackground(new java.awt.Color(102, 102, 102));
        bt_imprimiExtrato.setForeground(new java.awt.Color(255, 255, 255));
        bt_imprimiExtrato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/document-signed.png"))); // NOI18N
        bt_imprimiExtrato.setText("Imprimir Extrato");
        bt_imprimiExtrato.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_imprimiExtratoMouseClicked(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Label_vsacado.setForeground(new java.awt.Color(255, 255, 255));
        Label_vsacado.setText("Valor a ser sacado:");

        valorSaque.setBackground(new java.awt.Color(102, 102, 102));
        valorSaque.setForeground(new java.awt.Color(255, 255, 255));

        bt_sacar.setBackground(new java.awt.Color(102, 102, 102));
        bt_sacar.setForeground(new java.awt.Color(255, 255, 255));
        bt_sacar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/hand-holding-usd.png"))); // NOI18N
        bt_sacar.setText("Sacar");
        bt_sacar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_sacarMouseClicked(evt);
            }
        });

        buttonGroup1.add(s_botaoSaque);
        s_botaoSaque.setForeground(new java.awt.Color(255, 255, 255));
        s_botaoSaque.setText("Saque");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Label_vsacado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(valorSaque)
                    .addComponent(bt_sacar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(s_botaoSaque, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(s_botaoSaque)
                .addGap(7, 7, 7)
                .addComponent(Label_vsacado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(valorSaque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bt_sacar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Label_vdepositado.setForeground(new java.awt.Color(255, 255, 255));
        Label_vdepositado.setText("Valor a ser depositado:");

        valorDeposito.setBackground(new java.awt.Color(102, 102, 102));
        valorDeposito.setForeground(new java.awt.Color(255, 255, 255));

        bt_depositar.setBackground(new java.awt.Color(102, 102, 102));
        bt_depositar.setForeground(new java.awt.Color(255, 255, 255));
        bt_depositar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/piggy-bank.png"))); // NOI18N
        bt_depositar.setText("Depositar");
        bt_depositar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_depositarMouseClicked(evt);
            }
        });

        buttonGroup1.add(s_botaoDeposito);
        s_botaoDeposito.setForeground(new java.awt.Color(255, 255, 255));
        s_botaoDeposito.setText("Deposito");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Label_vdepositado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(valorDeposito)
                    .addComponent(bt_depositar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(s_botaoDeposito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(s_botaoDeposito)
                .addGap(1, 1, 1)
                .addComponent(Label_vdepositado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(valorDeposito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bt_depositar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bt_logout.setBackground(new java.awt.Color(102, 102, 102));
        bt_logout.setForeground(new java.awt.Color(255, 255, 255));
        bt_logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sign-out-alt.png"))); // NOI18N
        bt_logout.setText("Logout");
        bt_logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_logoutMouseClicked(evt);
            }
        });

        Label_extrato.setForeground(new java.awt.Color(255, 255, 255));
        Label_extrato.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_extrato.setText("Extrato");

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Label_nconta.setForeground(new java.awt.Color(255, 255, 255));
        Label_nconta.setText("Numero da conta:");

        contaTransferencia.setBackground(new java.awt.Color(102, 102, 102));
        contaTransferencia.setForeground(new java.awt.Color(255, 255, 255));

        valorTransferencia.setBackground(new java.awt.Color(102, 102, 102));
        valorTransferencia.setForeground(new java.awt.Color(255, 255, 255));

        Label_valor.setForeground(new java.awt.Color(255, 255, 255));
        Label_valor.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Label_valor.setText("Valor:");

        Label_banco.setForeground(new java.awt.Color(255, 255, 255));
        Label_banco.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Label_banco.setText("Banco:");

        bancoTransferencia.setBackground(new java.awt.Color(102, 102, 102));
        bancoTransferencia.setForeground(new java.awt.Color(255, 255, 255));

        bt_transferir.setBackground(new java.awt.Color(102, 102, 102));
        bt_transferir.setForeground(new java.awt.Color(255, 255, 255));
        bt_transferir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/money-check-edit.png"))); // NOI18N
        bt_transferir.setText("Transferir");
        bt_transferir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_transferirMouseClicked(evt);
            }
        });

        buttonGroup1.add(s_botaoTransferencia);
        s_botaoTransferencia.setForeground(new java.awt.Color(255, 255, 255));
        s_botaoTransferencia.setText("Transferencia");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(s_botaoTransferencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_transferir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Label_banco, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Label_valor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Label_nconta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(contaTransferencia)
                            .addComponent(valorTransferencia)
                            .addComponent(bancoTransferencia))))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(s_botaoTransferencia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_banco)
                    .addComponent(bancoTransferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_nconta)
                    .addComponent(contaTransferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valorTransferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label_valor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bt_transferir)
                .addGap(11, 11, 11))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(bt_imprimiExtrato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Label_saldo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mostraSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(Label_extrato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_logout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Label_saldo)
                            .addComponent(mostraSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bt_imprimiExtrato)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Label_extrato)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bt_logout)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
    * O método sacarMouseClicked trata o evento de clique do mouse para realizar um saque na conta.
    */
    private void bt_sacarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_sacarMouseClicked
        // Obtém o valor do saque a partir do campo de texto
        double saque = Double.parseDouble(valorSaque.getText());
        String valorSacado = valorSaque.getText(); // Obtém o valor sacado como texto
    
        // Verifica se o saldo é suficiente para o saque
        if(saldo > saque){
            saldo = saldo - saque; // Atualiza o saldo após o saque
        
            // Atualiza a conta no banco de dados
            ContaDao dao = new ContaDao();
            Conta conta = new Conta(nome, cpf, saldo, numeroConta, senha);
            dao.atualizar(conta);
        
            // Cria e exibe o extrato do saque na interface
            Extrato extrato = new Extrato();
            telaMostraExtrato.setText(extrato.extratoSaque(nome, cpf, saldo, numeroConta, valorSacado));
        
            // Atualiza o saldo exibido na interface
            mostraSaldo.setText(String.valueOf(saldo));
            valorSaque = null; // Limpa o campo de valor do saque após a operação
        
        } else {
            // Exibe uma mensagem de erro se o saldo for insuficiente
            JOptionPane.showMessageDialog(null, traducao.getTraducao("error.saldo_insufuciente"), traducao.getTraducao("title.ERROR_MESSAGE"), JOptionPane.ERROR_MESSAGE);
            valorSaque = null; // Limpa o campo de valor do saque
        }
    }//GEN-LAST:event_bt_sacarMouseClicked
    /**
    * O método depositoMouseClicked trata o evento de clique do mouse para realizar um depósito na conta.
     */
    private void bt_depositarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_depositarMouseClicked
        // Obtém o valor do depósito a partir do campo de texto
        double deposito = Double.parseDouble(valorDeposito.getText());
        String valorDepositado = valorDeposito.getText(); // Obtém o valor depositado como texto
    
        // Verifica se o valor do depósito é positivo
        if(deposito > 0){
            saldo = saldo + deposito; // Atualiza o saldo após o depósito
        
            // Atualiza a conta no banco de dados
            ContaDao dao = new ContaDao();
            Conta conta = new Conta(nome, cpf, saldo, numeroConta, senha);
            dao.atualizar(conta);
        
            // Cria e exibe o extrato do depósito na interface
            Extrato extrato = new Extrato();
            telaMostraExtrato.setText(extrato.extratoDeposito(nome, cpf, saldo, numeroConta, valorDepositado));

            // Atualiza o saldo exibido na interface
            mostraSaldo.setText(String.valueOf(saldo));
            valorDeposito = null; // Limpa o campo de valor do depósito
       
        } else {
            // Exibe uma mensagem de erro se o valor do depósito for inválido
            JOptionPane.showMessageDialog(null, traducao.getTraducao("error.valor_invalido"), traducao.getTraducao("title.ERROR_MESSAGE"), JOptionPane.ERROR_MESSAGE);
            valorDeposito = null; // Limpa o campo de valor do depósito
        }
    }//GEN-LAST:event_bt_depositarMouseClicked
    /**
    * O método transferirMouseClicked trata o evento de clique do mouse para realizar uma transferência de valores.
    */
    private void bt_transferirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_transferirMouseClicked
        // Obtém os valores da transferência, banco e conta a partir dos campos de texto
        double transferencia = Double.parseDouble(valorTransferencia.getText());
        String valorTransferido = valorTransferencia.getText();
        String bancoT = bancoTransferencia.getText();
        String contaT = contaTransferencia.getText();
    
        // Verifica se os campos estão preenchidos corretamente para realizar a transferência
        if(transferencia > 0 && bancoTransferencia != null && contaTransferencia != null && contaT.matches("[0-9]+")){
            saldo = saldo - transferencia; // Atualiza o saldo após a transferência
        
            // Atualiza a conta no banco de dados
            ContaDao dao = new ContaDao();
            Conta conta = new Conta(nome, cpf, saldo, numeroConta, senha);
            dao.atualizar(conta);
         
            // Cria e exibe o extrato da transferência na interface
            Extrato extrato = new Extrato();
            telaMostraExtrato.setText(extrato.extratoTransferencia(nome, cpf, saldo, numeroConta, valorTransferido, bancoT, contaT));
        
            // Atualiza o saldo exibido na interface
            mostraSaldo.setText(String.valueOf(saldo));
            // Limpa os campos após a operação
            bancoTransferencia = null;
            contaTransferencia = null;
            valorTransferencia = null;
        } else {
            // Exibe uma mensagem de erro se os campos não estiverem preenchidos corretamente
            JOptionPane.showMessageDialog(null, traducao.getTraducao("error.preencha_corretamente"), traducao.getTraducao("title.ERROR_MESSAGE"), JOptionPane.ERROR_MESSAGE);
            // Limpa os campos após a operação
            bancoTransferencia = null;
            contaTransferencia = null;
            valorTransferencia = null;
        }
    }//GEN-LAST:event_bt_transferirMouseClicked
    /**
    * O método imprimiExtratoMouseClicked trata o evento de clique do mouse para imprimir o extrato.
    */
    private void bt_imprimiExtratoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_imprimiExtratoMouseClicked
        //Instancia a classe Extrato
        Extrato imprimir = new Extrato();
        //Imprime o Extrato exibido na JTextArea 'telaMostraExtrato' no formato PDF e guarda na pasta Downloads do sistema do usuario
        imprimir.ImprimirExtrato(telaMostraExtrato);
    }//GEN-LAST:event_bt_imprimiExtratoMouseClicked
    /**
    * O método logoutMouseClicked trata o evento de clique do mouse para fazer logout do sistema.
    * Ele fecha a janela atual e abre a tela de login.
    */
    private void bt_logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_logoutMouseClicked
        // Cria uma instância da tela de login
        Login login = new Login();
        // Centraliza a tela de login na tela principal
        login.setLocationRelativeTo(null);
        // Torna a tela de login visível
        login.setVisible(true);
        // Fecha a janela atual do sistema
        this.dispose();
    }//GEN-LAST:event_bt_logoutMouseClicked

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label_banco;
    private javax.swing.JLabel Label_extrato;
    private javax.swing.JLabel Label_nconta;
    private javax.swing.JLabel Label_saldo;
    private javax.swing.JLabel Label_titulo;
    private javax.swing.JLabel Label_valor;
    private javax.swing.JLabel Label_vdepositado;
    private javax.swing.JLabel Label_vsacado;
    private javax.swing.JTextField bancoTransferencia;
    private javax.swing.JButton bt_depositar;
    private javax.swing.JButton bt_imprimiExtrato;
    private javax.swing.JButton bt_logout;
    private javax.swing.JButton bt_sacar;
    private javax.swing.JButton bt_transferir;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField contaTransferencia;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField mostraSaldo;
    private javax.swing.JRadioButton s_botaoDeposito;
    private javax.swing.JRadioButton s_botaoSaque;
    private javax.swing.JRadioButton s_botaoTransferencia;
    private javax.swing.JTextArea telaMostraDados;
    private javax.swing.JTextArea telaMostraExtrato;
    private javax.swing.JTextField valorDeposito;
    private javax.swing.JTextField valorSaque;
    private javax.swing.JTextField valorTransferencia;
    // End of variables declaration//GEN-END:variables
}
