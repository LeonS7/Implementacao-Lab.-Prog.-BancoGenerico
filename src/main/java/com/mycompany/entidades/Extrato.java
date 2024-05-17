
package com.mycompany.entidades;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 * A classe Extrato fornece métodos para gerar e imprimir extratos bancários.
 * Ela inclui métodos para extratos de saque, depósito, transferência e para imprimir o extrato em um arquivo.
 * 
 * @author Leonardo de Souza da Luz
 */
public class Extrato {
    
    /**
     * Construtor padrão da classe Extrato.
     */
    public Extrato() {
    }
    
    /**
     * Gera o extrato de uma operação de saque.
     * @param nome O nome do titular da conta.
     * @param cpf O CPF do titular da conta.
     * @param saldo O saldo atual da conta após o saque.
     * @param numeroConta O número da conta.
     * @param valorSacado O valor sacado.
     * @return Uma string contendo o extrato formatado.
     */
    public static String extratoSaque(String nome, String cpf, Double saldo, String numeroConta, String valorSacado){
        // Obtém o horário atual
        LocalTime horario = LocalTime.now();
        String horarioFormatado = horario.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        
        // Cria o cupom de extrato
        String cupom = "========== Extrato Bancário ==========\n" +
                       "Banco: BancoGenerico" + "\n" +
                       "Número da Conta: " + numeroConta + "\n" +
                       "Nome: " + nome + "\n" +
                       "CPF: " + cpf + "\n" +
                       "---------------------------------------\n" +
                       "Operacao: Saque \n" +
                       String.format("Valor sacado: R$ %.2f\n", valorSacado) +
                       String.format("Saldo: R$ %.2f\n", saldo) +
                       "---------------------------------------\n" +
                       String.format("Horario da Transacao: \n", horarioFormatado) +
                       "=======================================";
        return cupom;
    }
    
    /**
     * Gera o extrato de uma operação de depósito.
     * @param nome O nome do titular da conta.
     * @param cpf O CPF do titular da conta.
     * @param saldo O saldo atual da conta após o depósito.
     * @param numeroConta O número da conta.
     * @param valorDepositado O valor depositado.
     * @return Uma string contendo o extrato formatado.
     */
    public static String extratoDeposito(String nome, String cpf, Double saldo, String numeroConta, String valorDepositado){
        // Obtém o horário atual
        LocalTime horario = LocalTime.now();
        String horarioFormatado = horario.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        
        // Cria o cupom de extrato
        String cupom = "========== Extrato Bancário ==========\n" +
                       "Banco: BancoGenerico" + "\n" +
                       "Número da Conta: " + numeroConta + "\n" +
                       "Nome: " + nome + "\n" +
                       "CPF: " + cpf + "\n" +
                       "---------------------------------------\n" +
                       "Operacao: Deposito \n" +
                       String.format("Valor Depositado: R$ %.2f\n", valorDepositado) +
                       String.format("Saldo: R$ %.2f\n", saldo) +
                       "---------------------------------------\n" +
                       String.format("Horario da Transacao: \n", horarioFormatado) +
                       "=======================================";
        return cupom;
    }
    
    /**
     * Gera o extrato de uma operação de transferência.
     * @param nome O nome do titular da conta.
     * @param cpf O CPF do titular da conta.
     * @param saldo O saldo atual da conta após a transferência.
     * @param numeroConta O número da conta.
     * @param valorTranferido
     * @param bancoT O banco destino da transferência.
     * @param contaT A conta destino da transferência.
     * @return Uma string contendo o extrato formatado.
     */
    public static String extratoTransferencia(String nome, String cpf, Double saldo, String numeroConta, String valorTranferido, String bancoT, String contaT){
        // Obtém o horário atual
        LocalTime horario = LocalTime.now();
        String horarioFormatado = horario.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        
        // Cria o cupom de extrato
        String cupom = "========== Extrato Bancário ==========\n" +
                       "Banco: BancoGenerico" + "\n" +
                       "Número da Conta: " + numeroConta + "\n" +
                       "Nome: " + nome + "\n" +
                       "CPF: " + cpf + "\n" +
                       "---------------------------------------\n" +
                       "Operacao: Transferencia \n" +
                       "Banco: " + bancoT + "\n" +
                       "Conta: " + contaT + "\n" +
                       String.format("Valor Transferido: R$ %.2f\n", valorTranferido) +
                       String.format("Saldo atual: R$ %.2f\n", saldo) +
                       "---------------------------------------\n" +
                       String.format("Horario da Transacao: \n", horarioFormatado) +
                       "=======================================";
        return cupom;
    }
    
    /**
    * Imprime o extrato em um arquivo de texto.
    * @param telaMostraExtrato O JTextArea que contém o extrato a ser impresso.
    * @param caminhoArquivo O caminho onde o arquivo de texto será salvo.
    */
    public void imprimirExtrato(JTextArea telaMostraExtrato, String caminhoArquivo) {
        // Obtém o nome do sistema operacional
        String sistemaOperacional = System.getProperty("os.name").toLowerCase();
        
        // Adiciona a pasta Downloads ao caminho do arquivo com base no sistema operacional
        if (sistemaOperacional.contains("win")) {
            caminhoArquivo += "\\Downloads\\";
        } else if (sistemaOperacional.contains("mac")) {
            caminhoArquivo += "/Downloads/";
        } else {
            caminhoArquivo += "/Downloads/";
        }

        // Cria um seletor de arquivos para salvar o arquivo
        JFileChooser fileChooser = new JFileChooser(caminhoArquivo);
        int resultado = fileChooser.showSaveDialog(null);
        
        // Verifica se o JTextArea é nulo
        if (telaMostraExtrato == null) {
            System.err.println("O JTextArea não pode ser nulo.");
            JOptionPane.showMessageDialog(null, "Nenhuma transaçao foi realizada, realiza uma transaçao para visualizar o extrato.", "Erro!", JOptionPane.ERROR_MESSAGE);

            return;
        }

        // Verifica se o caminho do arquivo é inválido
        if (caminhoArquivo == null || caminhoArquivo.isEmpty()) {
            System.err.println("O caminho do arquivo não pode ser nulo ou vazio.");
            JOptionPane.showMessageDialog(null, "Caminho do arquivo invalido.", "Erro!", JOptionPane.ERROR_MESSAGE);

            return;
        }

        // Obtém o texto do JTextArea
        String texto = telaMostraExtrato.getText();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(caminhoArquivo))) {
            // Escreve o texto no arquivo
            writer.write(texto);
            System.out.println("Texto salvo com sucesso em " + caminhoArquivo);
            JOptionPane.showMessageDialog(null, "Extrato salvo com sucesso em " + caminhoArquivo, "Operaçao concluida!", JOptionPane.INFORMATION_MESSAGE);

        // Tratamento das exceçoes
        } catch (IOException e) {
            System.err.println("Erro ao salvar o texto no arquivo: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao salvar o Extrato no arquivo: " + e.getMessage(), "Erro!", JOptionPane.ERROR_MESSAGE);
        } catch (SecurityException e) {
            System.err.println("Erro de segurança ao acessar o sistema de arquivos: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro de segurança ao acessar o sistema de arquivos: " + e.getMessage(), "Erro!", JOptionPane.ERROR_MESSAGE);
        } catch (NullPointerException e) {
            System.err.println("Argumento nulo passado para o método: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Argumento nulo passado para o método: " + e.getMessage(), "Erro!", JOptionPane.ERROR_MESSAGE);
        } catch (IllegalArgumentException e) {
            System.err.println("Caminho de arquivo inválido: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Caminho de arquivo inválido: " + e.getMessage(), "Erro!", JOptionPane.ERROR_MESSAGE);
        }
    }
    
}
