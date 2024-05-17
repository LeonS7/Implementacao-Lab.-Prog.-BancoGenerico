
package com.mycompany.telas;

import com.mycompany.entidades.*;
import com.mycompany.DAO.*;
import javax.swing.JOptionPane;

/**
 * A classe Sistema representa a interface gráfica de um sistema bancário.
 * Permite ao usuário realizar operações como saque, depósito, transferência e imprimir extrato.
 * 
 * @author Leonardo de Souza da Luz
 */
public class Sistema extends javax.swing.JFrame {

    // Variáveis de instância para armazenar dados da conta do usuário
    String nome;
    String cpf;
    double saldo;
    String numeroConta;
    String senha;
    String pegaSaldo;
    
    /**
     * Construtor da classe Sistema que inicializa a interface gráfica com os dados da conta.
     * @param conta A conta do usuário para exibir informações na interface.
     */
    public Sistema(Conta conta) {
        initComponents();
        // Exibe os dados da conta na interface
        telaMostraDados.setText(conta.toString());
        // Exibe o saldo da conta
        mostraSaldo.setText(pegaSaldo = String.valueOf(conta.getSaldo()));
        
        // Inicializa as variáveis com os dados da conta
        nome = conta.getNome();
        cpf = conta.getCpf();
        saldo = conta.getSaldo();
        numeroConta = conta.getNumeroConta();
        senha = conta.getSenha();
        
        // Controla a visibilidade dos componentes dependendo da seleção do botão
        if(botaoSaque.isSelected()){
            valorDeposito.setEnabled(false);
            deposito.setEnabled(false);
            bancoTransferencia.setEnabled(false);
            contaTransferencia.setEnabled(false);
            valorTransferencia.setEnabled(false);
            transferir.setEnabled(false);
        }else{
            if(botaoDeposito.isSelected()){
                valorSaque.setEnabled(false);
                sacar.setEnabled(false);
                bancoTransferencia.setEnabled(false);
                contaTransferencia.setEnabled(false);
                valorTransferencia.setEnabled(false);
                transferir.setEnabled(false);
            }else{
                if(botaoTransferencia.isSelected()){
                    valorSaque.setEnabled(false);
                    sacar.setEnabled(false);
                    valorDeposito.setEnabled(false);
                    deposito.setEnabled(false);
                }
            }
            valorSaque.setEnabled(false);
            sacar.setEnabled(false);
            valorDeposito.setEnabled(false);
            deposito.setEnabled(false);
            bancoTransferencia.setEnabled(false);
            contaTransferencia.setEnabled(false);
            valorTransferencia.setEnabled(false);
            transferir.setEnabled(false);
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        telaMostraDados = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        mostraSaldo = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        telaMostraExtrato = new javax.swing.JTextArea();
        imprimiExtrato = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        valorSaque = new javax.swing.JTextField();
        sacar = new javax.swing.JButton();
        botaoSaque = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        valorDeposito = new javax.swing.JTextField();
        deposito = new javax.swing.JButton();
        botaoDeposito = new javax.swing.JRadioButton();
        logout = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        contaTransferencia = new javax.swing.JTextField();
        valorTransferencia = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        bancoTransferencia = new javax.swing.JTextField();
        transferir = new javax.swing.JButton();
        botaoTransferencia = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bank (1).png"))); // NOI18N
        jLabel1.setText("Banco Generico");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
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

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Saldo: ");

        mostraSaldo.setEditable(false);
        mostraSaldo.setBackground(new java.awt.Color(102, 102, 102));
        mostraSaldo.setForeground(new java.awt.Color(255, 255, 255));

        telaMostraExtrato.setEditable(false);
        telaMostraExtrato.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.background"));
        telaMostraExtrato.setColumns(20);
        telaMostraExtrato.setForeground(new java.awt.Color(255, 255, 255));
        telaMostraExtrato.setRows(5);
        jScrollPane2.setViewportView(telaMostraExtrato);

        imprimiExtrato.setBackground(new java.awt.Color(102, 102, 102));
        imprimiExtrato.setForeground(new java.awt.Color(255, 255, 255));
        imprimiExtrato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/document-signed.png"))); // NOI18N
        imprimiExtrato.setText("Imprimir Extrato");
        imprimiExtrato.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imprimiExtratoMouseClicked(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Valor a ser sacado:");

        valorSaque.setBackground(new java.awt.Color(102, 102, 102));
        valorSaque.setForeground(new java.awt.Color(255, 255, 255));

        sacar.setBackground(new java.awt.Color(102, 102, 102));
        sacar.setForeground(new java.awt.Color(255, 255, 255));
        sacar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/hand-holding-usd.png"))); // NOI18N
        sacar.setText("Sacar");
        sacar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sacarMouseClicked(evt);
            }
        });

        buttonGroup1.add(botaoSaque);
        botaoSaque.setForeground(new java.awt.Color(255, 255, 255));
        botaoSaque.setText("Saque");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(valorSaque)
                    .addComponent(sacar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoSaque, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botaoSaque)
                .addGap(7, 7, 7)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(valorSaque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sacar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Valor a ser depositado:");

        valorDeposito.setBackground(new java.awt.Color(102, 102, 102));
        valorDeposito.setForeground(new java.awt.Color(255, 255, 255));

        deposito.setBackground(new java.awt.Color(102, 102, 102));
        deposito.setForeground(new java.awt.Color(255, 255, 255));
        deposito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/piggy-bank.png"))); // NOI18N
        deposito.setText("Depositar");
        deposito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                depositoMouseClicked(evt);
            }
        });

        buttonGroup1.add(botaoDeposito);
        botaoDeposito.setForeground(new java.awt.Color(255, 255, 255));
        botaoDeposito.setText("Deposito");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(valorDeposito)
                    .addComponent(deposito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoDeposito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botaoDeposito)
                .addGap(1, 1, 1)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(valorDeposito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deposito)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        logout.setBackground(new java.awt.Color(102, 102, 102));
        logout.setForeground(new java.awt.Color(255, 255, 255));
        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sign-out-alt.png"))); // NOI18N
        logout.setText("Logout");
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Extrato");

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Numero da conta:");

        contaTransferencia.setBackground(new java.awt.Color(102, 102, 102));
        contaTransferencia.setForeground(new java.awt.Color(255, 255, 255));

        valorTransferencia.setBackground(new java.awt.Color(102, 102, 102));
        valorTransferencia.setForeground(new java.awt.Color(255, 255, 255));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Valor:");

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Banco:");

        bancoTransferencia.setBackground(new java.awt.Color(102, 102, 102));
        bancoTransferencia.setForeground(new java.awt.Color(255, 255, 255));

        transferir.setBackground(new java.awt.Color(102, 102, 102));
        transferir.setForeground(new java.awt.Color(255, 255, 255));
        transferir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/money-check-edit.png"))); // NOI18N
        transferir.setText("Transferir");
        transferir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                transferirMouseClicked(evt);
            }
        });

        buttonGroup1.add(botaoTransferencia);
        botaoTransferencia.setForeground(new java.awt.Color(255, 255, 255));
        botaoTransferencia.setText("Transferencia");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoTransferencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(transferir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(botaoTransferencia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(bancoTransferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(contaTransferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valorTransferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(transferir)
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
                    .addComponent(imprimiExtrato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mostraSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(mostraSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(imprimiExtrato)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(logout)
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
    private void sacarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sacarMouseClicked
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
            mostraSaldo.setText(pegaSaldo = String.valueOf(saldo));
            valorSaque = null; // Limpa o campo de valor do saque após a operação
        
        } else {
            // Exibe uma mensagem de erro se o saldo for insuficiente
            JOptionPane.showMessageDialog(null, "Saldo insuficiente!", "Erro!", JOptionPane.ERROR_MESSAGE);
            valorSaque = null; // Limpa o campo de valor do saque
        }
    }//GEN-LAST:event_sacarMouseClicked
    /**
    * O método depositoMouseClicked trata o evento de clique do mouse para realizar um depósito na conta.
     */
    private void depositoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_depositoMouseClicked
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
            mostraSaldo.setText(pegaSaldo = String.valueOf(saldo));
            valorDeposito = null; // Limpa o campo de valor do depósito
       
        } else {
            // Exibe uma mensagem de erro se o valor do depósito for inválido
            JOptionPane.showMessageDialog(null, "Valor inválido!", "Erro!", JOptionPane.ERROR_MESSAGE);
            valorDeposito = null; // Limpa o campo de valor do depósito
        }
    }//GEN-LAST:event_depositoMouseClicked
    /**
    * O método transferirMouseClicked trata o evento de clique do mouse para realizar uma transferência de valores.
    */
    private void transferirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transferirMouseClicked
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
            mostraSaldo.setText(pegaSaldo = String.valueOf(saldo));
            // Limpa os campos após a operação
            bancoTransferencia = null;
            contaTransferencia = null;
            valorTransferencia = null;
        } else {
            // Exibe uma mensagem de erro se os campos não estiverem preenchidos corretamente
            JOptionPane.showMessageDialog(null, "Preencha todos os campos corretamente!", "Erro!", JOptionPane.ERROR_MESSAGE);
            // Limpa os campos após a operação
            bancoTransferencia = null;
            contaTransferencia = null;
            valorTransferencia = null;
        }
    }//GEN-LAST:event_transferirMouseClicked
    /**
    * O método imprimiExtratoMouseClicked trata o evento de clique do mouse para imprimir o extrato.
    */
    private void imprimiExtratoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imprimiExtratoMouseClicked
        // Cria uma instância do objeto Extrato
        Extrato imprimiExtrato = new Extrato();
        String caminhoArquivo = "\\Downloads\\"; // Caminho onde o arquivo será salvo
        // Chama o método para imprimir o extrato na interface
        imprimiExtrato.imprimirExtrato(telaMostraExtrato, caminhoArquivo);
    }//GEN-LAST:event_imprimiExtratoMouseClicked
    /**
    * O método logoutMouseClicked trata o evento de clique do mouse para fazer logout do sistema.
    * Ele fecha a janela atual e abre a tela de login.
    */
    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        // Cria uma instância da tela de login
        Login login = new Login();
        // Centraliza a tela de login na tela principal
        login.setLocationRelativeTo(null);
        // Torna a tela de login visível
        login.setVisible(true);
        // Fecha a janela atual do sistema
        this.dispose();
    }//GEN-LAST:event_logoutMouseClicked

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bancoTransferencia;
    private javax.swing.JRadioButton botaoDeposito;
    private javax.swing.JRadioButton botaoSaque;
    private javax.swing.JRadioButton botaoTransferencia;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField contaTransferencia;
    private javax.swing.JButton deposito;
    private javax.swing.JButton imprimiExtrato;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton logout;
    private javax.swing.JTextField mostraSaldo;
    private javax.swing.JButton sacar;
    private javax.swing.JTextArea telaMostraDados;
    private javax.swing.JTextArea telaMostraExtrato;
    private javax.swing.JButton transferir;
    private javax.swing.JTextField valorDeposito;
    private javax.swing.JTextField valorSaque;
    private javax.swing.JTextField valorTransferencia;
    // End of variables declaration//GEN-END:variables
}
