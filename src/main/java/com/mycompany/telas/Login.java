package com.mycompany.telas;

import com.mycompany.entidades.*;
import com.mycompany.DAO.*;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 * Classe que representa a tela de login do sistema bancário.
 * 
 * @author Leonardo de Souza da Luz
 */
public class Login extends javax.swing.JFrame {

    String nome;
    String cpf;
    Double saldo;
    String numeroConta;
    String senha;
    String confirma_senha;
    
    // Obtém o ResourceBundle contendo as mensagens internacionalizadas
    Internacionalizacao traducao = new Internacionalizacao();
    
    /**
     * Construtor padrão da classe Login.
     */
    public Login() {
        //Faz a traduçao dos componentes da interface
        Label_titulo.setText(traducao.getTraducao("Label_titulo"));
        Label_criar_conta.setText(traducao.getTraducao("Label_criar_conta"));
        Label_nome.setText(traducao.getTraducao("Label_nome"));
        Label_senha.setText(traducao.getTraducao("Label_senha"));
        Label_senha2.setText(traducao.getTraducao("Label_senha"));
        Label_confirma_senha.setText(traducao.getTraducao("Label_confirma_senha"));
        bt_abrir_conta.setText(traducao.getTraducao("bt_abrir_conta"));
        bt_Sair.setText(traducao.getTraducao("bt_Sair"));
        initComponents();
    }
    

     // Código gerado pelo NetBeans para a interface gráfica foi omitido aqui
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        EnterCPF = new javax.swing.JTextField();
        Lebal_cpf2 = new javax.swing.JLabel();
        EnterSenha = new javax.swing.JTextField();
        Label_senha2 = new javax.swing.JLabel();
        bt_entrar = new javax.swing.JButton();
        bt_Sair = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        Label_criar_conta = new javax.swing.JLabel();
        Label_nome = new javax.swing.JLabel();
        Label_cpf = new javax.swing.JLabel();
        Label_senha = new javax.swing.JLabel();
        Label_confirma_senha = new javax.swing.JLabel();
        bt_abrir_conta = new javax.swing.JButton();
        DigitaNome = new javax.swing.JTextField();
        DigitaCPF = new javax.swing.JTextField();
        DigitaSenha = new javax.swing.JTextField();
        ConfirmaSenha = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        Label_titulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BancoGenerico");
        setBackground(new java.awt.Color(102, 102, 102));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Login");

        EnterCPF.setBackground(new java.awt.Color(102, 102, 102));
        EnterCPF.setForeground(new java.awt.Color(255, 255, 255));

        Lebal_cpf2.setForeground(new java.awt.Color(255, 255, 255));
        Lebal_cpf2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Lebal_cpf2.setText("CPF:");

        EnterSenha.setBackground(new java.awt.Color(102, 102, 102));
        EnterSenha.setForeground(new java.awt.Color(255, 255, 255));

        Label_senha2.setForeground(new java.awt.Color(255, 255, 255));
        Label_senha2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Label_senha2.setText("Senha:");

        bt_entrar.setBackground(new java.awt.Color(102, 102, 102));
        bt_entrar.setForeground(new java.awt.Color(255, 255, 255));
        bt_entrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sign-in-alt.png"))); // NOI18N
        bt_entrar.setText("Login");
        bt_entrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_entrarMouseClicked(evt);
            }
        });

        bt_Sair.setBackground(new java.awt.Color(102, 102, 102));
        bt_Sair.setForeground(new java.awt.Color(255, 255, 255));
        bt_Sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sign-out-alt.png"))); // NOI18N
        bt_Sair.setText("Sair");
        bt_Sair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_SairMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt_entrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Lebal_cpf2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Label_senha2, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EnterSenha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                            .addComponent(EnterCPF)))
                    .addComponent(bt_Sair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EnterCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lebal_cpf2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EnterSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label_senha2))
                .addGap(18, 18, 18)
                .addComponent(bt_entrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bt_Sair)
                .addGap(23, 23, 23))
        );

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Label_criar_conta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Label_criar_conta.setForeground(new java.awt.Color(255, 255, 255));
        Label_criar_conta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_criar_conta.setText("Criar Conta");

        Label_nome.setForeground(new java.awt.Color(255, 255, 255));
        Label_nome.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Label_nome.setText("Nome:");

        Label_cpf.setForeground(new java.awt.Color(255, 255, 255));
        Label_cpf.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Label_cpf.setText("CPF:");

        Label_senha.setForeground(new java.awt.Color(255, 255, 255));
        Label_senha.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Label_senha.setText("Senha:");

        Label_confirma_senha.setForeground(new java.awt.Color(255, 255, 255));
        Label_confirma_senha.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Label_confirma_senha.setText("Confirmar Senha:");

        bt_abrir_conta.setBackground(new java.awt.Color(102, 102, 102));
        bt_abrir_conta.setForeground(new java.awt.Color(255, 255, 255));
        bt_abrir_conta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/edit (1).png"))); // NOI18N
        bt_abrir_conta.setText("Abir Conta");
        bt_abrir_conta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_abrir_contaMouseClicked(evt);
            }
        });

        DigitaNome.setBackground(new java.awt.Color(102, 102, 102));
        DigitaNome.setForeground(new java.awt.Color(255, 255, 255));

        DigitaCPF.setBackground(new java.awt.Color(102, 102, 102));
        DigitaCPF.setForeground(new java.awt.Color(255, 255, 255));

        DigitaSenha.setBackground(new java.awt.Color(102, 102, 102));
        DigitaSenha.setForeground(new java.awt.Color(255, 255, 255));

        ConfirmaSenha.setBackground(new java.awt.Color(102, 102, 102));
        ConfirmaSenha.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Label_confirma_senha, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ConfirmaSenha))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bt_abrir_conta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Label_criar_conta, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Label_senha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Label_cpf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Label_nome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(DigitaSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                            .addComponent(DigitaNome)
                            .addComponent(DigitaCPF))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Label_criar_conta, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_nome)
                    .addComponent(DigitaNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_cpf)
                    .addComponent(DigitaCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_senha)
                    .addComponent(DigitaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_confirma_senha)
                    .addComponent(ConfirmaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bt_abrir_conta)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Label_titulo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Label_titulo.setForeground(new java.awt.Color(255, 255, 255));
        Label_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_titulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bank (1).png"))); // NOI18N
        Label_titulo.setText("Banco Generico");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Label_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Label_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(1, 1, 1)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Evento acionado ao clicar no botão "Login".
     * Realiza a autenticação do usuário e exibe a tela do sistema bancário.
     * @param evt O evento de clique do mouse
     */
    private void bt_entrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_entrarMouseClicked
        //Pega os dados digitados na interface grafica
        cpf = DigitaCPF.getText();
        senha = DigitaSenha.getText();
        
        ContaDao dao = new ContaDao();
        //Verifica se a conta existe no Banco de Dados
        if(dao.pesquisaCPFeSENHA(cpf, senha) == true){
            Conta conta = dao.get(cpf);
            Sistema banco = new Sistema(conta);
            banco.setLocationRelativeTo(null);
            banco.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null, traducao.getTraducao("error.conta_nao_encontrada"), traducao.getTraducao("title.ERROR_MESSAGE"), JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_bt_entrarMouseClicked
    /**
     * Evento acionado ao clicar no botão "Sair".
     * Fecha a janela de login.
     * @param evt O evento de clique do mouse
     */
    private void bt_SairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_SairMouseClicked
        this.dispose();
    }//GEN-LAST:event_bt_SairMouseClicked
    /**
     * Evento acionado ao clicar no botão "Abrir Conta".
     * Realiza o processo de abertura de uma nova conta bancária.
     * @param evt O evento de clique do mouse
     */
    private void bt_abrir_contaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_abrir_contaMouseClicked
        //Pega os dados digitados na interface grafica
        nome = DigitaNome.getText();
        cpf = DigitaCPF.getText();
        senha = DigitaSenha.getText();
        confirma_senha = ConfirmaSenha.getText();
        saldo = 0.0;

        ContaDao dao = new ContaDao();
        //Faz a verificacao de senha
        if(senha.equals(confirma_senha)){
            //Verifica se o usuario ja existe no Banco de Dados
            if(dao.pesquisaCPFeSENHA(cpf, senha) == false){
                //Gera o numero da Conta
                Random gerarNumeroConta = new Random();
                int aleatorio = gerarNumeroConta.nextInt(9000000) + 1000000;
                numeroConta = String.valueOf(aleatorio);

                //Cria a conta do usuario
                Conta conta = new Conta(nome,cpf,saldo,numeroConta,senha);

                dao.salvar(conta);

                Sistema banco = new Sistema(conta);
                banco.setLocationRelativeTo(null);
                banco.setVisible(true);
            }
            //Excecoes caso nao passe na verificacao
            JOptionPane.showMessageDialog(null, traducao.getTraducao("error.conta_ja_existe"), traducao.getTraducao("title.ERROR_MESSAGE"), JOptionPane.ERROR_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, traducao.getTraducao("error.senha_nao_corresponde"), traducao.getTraducao("title.ERROR_MESSAGE"), JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_bt_abrir_contaMouseClicked
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ConfirmaSenha;
    private javax.swing.JTextField DigitaCPF;
    private javax.swing.JTextField DigitaNome;
    private javax.swing.JTextField DigitaSenha;
    private javax.swing.JTextField EnterCPF;
    private javax.swing.JTextField EnterSenha;
    private javax.swing.JLabel Label_confirma_senha;
    private javax.swing.JLabel Label_cpf;
    private javax.swing.JLabel Label_criar_conta;
    private javax.swing.JLabel Label_nome;
    private javax.swing.JLabel Label_senha;
    private javax.swing.JLabel Label_senha2;
    private javax.swing.JLabel Label_titulo;
    private javax.swing.JLabel Lebal_cpf2;
    private javax.swing.JButton bt_Sair;
    private javax.swing.JButton bt_abrir_conta;
    private javax.swing.JButton bt_entrar;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
