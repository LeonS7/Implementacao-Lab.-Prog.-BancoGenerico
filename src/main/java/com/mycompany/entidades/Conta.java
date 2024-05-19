package com.mycompany.entidades;
/**
 *
 * @author Leonardo de Souza da Luz
 * https://github.com/LeonS7
 */ 

/**
 * A classe Conta representa uma entidade que armazena informações sobre uma conta bancária.
 * Ela inclui atributos como nome, CPF, saldo, número da conta e senha.
 * 
 */
public class Conta {
    
    // Obtém o ResourceBundle contendo as mensagens internacionalizadas
    Internacionalizacao traducao = new Internacionalizacao();
    
    /** O identificador único da conta. */
    protected int id;
    /** O nome do titular da conta. */
    protected String nome;
    /** O CPF do titular da conta. */
    protected String cpf;
    /** O saldo atual da conta. */
    protected double saldo;
    /** O número da conta. */
    protected String numeroConta;
    /** A senha associada à conta. */
    protected String senha;

    /**
     * Construtor que inicializa uma instância de Conta com os parâmetros fornecidos.
     * @param nome O nome do titular da conta.
     * @param cpf O CPF do titular da conta.
     * @param saldo O saldo inicial da conta.
     * @param numeroConta O número da conta.
     * @param senha A senha associada à conta.
     */
    public Conta(String nome, String cpf, double saldo, String numeroConta, String senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.saldo = saldo;
        this.numeroConta = numeroConta;
        this.senha = senha;
    }

    /**
     * Obtém o ID da conta.
     * @return O ID da conta.
     */
    public int getId() {
        return id;
    }

    /**
     * Define o ID da conta.
     * @param id O ID a ser definido.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtém o nome do titular da conta.
     * @return O nome do titular da conta.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome do titular da conta.
     * @param nome O nome a ser definido.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Obtém o CPF do titular da conta.
     * @return O CPF do titular da conta.
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * Define o CPF do titular da conta.
     * @param cpf O CPF a ser definido.
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * Obtém o saldo atual da conta.
     * @return O saldo atual da conta.
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Define o saldo da conta.
     * @param saldo O saldo a ser definido.
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Obtém o número da conta.
     * @return O número da conta.
     */
    public String getNumeroConta() {
        return numeroConta;
    }

    /**
     * Define o número da conta.
     * @param numeroConta O número da conta a ser definido.
     */
    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    /**
     * Obtém a senha associada à conta.
     * @return A senha associada à conta.
     */
    public String getSenha() {
        return senha;
    }

    /**
     * Define a senha associada à conta.
     * @param senha A senha a ser definida.
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * Retorna uma representação textual da conta.
     * @return Uma string formatada com informações da conta.
     */
    @Override
    public String toString() {
    return traducao.getTraducao("conta") + " id = " + id + "\n" +
           traducao.getTraducao("nome") + " = " + nome + "\n" +
           traducao.getTraducao("cpf") + " = " + cpf + "\n" +
           traducao.getTraducao("numero_conta") + " = " + numeroConta + "\n";
    } 
}