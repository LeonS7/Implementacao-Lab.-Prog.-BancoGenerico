
package com.mycompany.entidades;

/**
 *
 * @author Leonardo de Souza da Luz
 * https://github.com/LeonS7
 */

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.io.FileOutputStream;
import java.io.IOException;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.parser.Path;
import java.io.File;
import java.nio.file.Paths;
import java.time.LocalDateTime;

/**
 * A classe Extrato fornece métodos para gerar e imprimir extratos bancários.
 * Ela inclui métodos para extratos de saque, depósito, transferência e para imprimir o extrato em um arquivo.
 */
public class Extrato {
    
    /**
     * Construtor padrão da classe Extrato.
     */
    public Extrato() {
    }
    // Obtém o ResourceBundle contendo as mensagens internacionalizadas
    Internacionalizacao traducao = new Internacionalizacao();
    /**
     * Gera o extrato de uma operação de saque.
     * @param nome O nome do titular da conta.
     * @param cpf O CPF do titular da conta.
     * @param saldo O saldo atual da conta após o saque.
     * @param numeroConta O número da conta.
     * @param valorSacado O valor sacado.
     * @return Uma string contendo o extrato formatado.
     */
    public String extratoSaque(String nome, String cpf, Double saldo, String numeroConta, String valorSacado){
        // Obtém o horário atual
        LocalTime horario = LocalTime.now();
        String horarioFormatado = horario.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        
        // Cria o cupom de extrato com a traducao necessaria
        String cupom1=traducao.getTraducao("extrato_titulo") + "\n" +
                      traducao.getTraducao("banco") + "\n" +
                      traducao.getTraducao("numero_conta") + " " + numeroConta + "\n" +
                      traducao.getTraducao("nome") + " " + nome + "\n" +
                      traducao.getTraducao("cpf") + " " + cpf + "\n" +
                      "---------------------------------------\n" +
                      traducao.getTraducao("operacao1") + "\n" +
                      traducao.getTraducao("valor_sacado") + " R$ " + String.format("%.2f", Double.valueOf(valorSacado)) + "\n" +
                      traducao.getTraducao("saldo") + " R$ " + String.format("%.2f", saldo) + "\n" +
                      "---------------------------------------\n" +
                      traducao.getTraducao("horario_transacao") + " " + horarioFormatado + "\n" +
                      "=======================================";
        return cupom1;
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
    public String extratoDeposito(String nome, String cpf, Double saldo, String numeroConta, String valorDepositado){
        // Obtém o horário atual
        LocalTime horario = LocalTime.now();
        String horarioFormatado = horario.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        
        // Cria o cupom de extrato com a traducao necessaria
        String cupom2=traducao.getTraducao("extrato_titulo") + "\n" +
                      traducao.getTraducao("banco") + "\n" +
                      traducao.getTraducao("numero_conta") + " " + numeroConta + "\n" +
                      traducao.getTraducao("nome") + " " + nome + "\n" +
                      traducao.getTraducao("cpf") + " " + cpf + "\n" +
                      "---------------------------------------\n" +
                      traducao.getTraducao("operacao2") + "\n" +
                      traducao.getTraducao("valor_depositado") + " R$ " + String.format("%.2f", Double.valueOf(valorDepositado)) + "\n" +
                      traducao.getTraducao("saldo") + " R$ " + String.format("%.2f", saldo) + "\n" +
                      "---------------------------------------\n" +
                      traducao.getTraducao("horario_transacao") + " " + horarioFormatado + "\n" +
                      "=======================================";
        return cupom2;
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
    public String extratoTransferencia(String nome, String cpf, Double saldo, String numeroConta, String valorTranferido, String bancoT, String contaT){
        // Obtém o horário atual
        LocalTime horario = LocalTime.now();
        String horarioFormatado = horario.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        
        // Cria o cupom de extrato com a traducao necessaria
        String cupom3=traducao.getTraducao("extrato_titulo") + "\n" +
                      traducao.getTraducao("banco") + "\n" +
                      traducao.getTraducao("numero_conta") + " " + numeroConta + "\n" +
                      traducao.getTraducao("nome") + " " + nome + "\n" +
                      traducao.getTraducao("cpf") + " " + cpf + "\n" +
                      "---------------------------------------\n" +
                      traducao.getTraducao("operacao3") + "\n" +
                      traducao.getTraducao("valor_transferido") + " R$ " + String.format("%.2f", Double.valueOf(valorTranferido)) + "\n" +
                      traducao.getTraducao("saldo") + " R$ " + String.format("%.2f", saldo) + "\n" +
                      "---------------------------------------\n" +
                      traducao.getTraducao("horario_transacao") + " " + horarioFormatado + "\n" +
                      "=======================================";
        return cupom3;
    }

    /**
     * Imprime o extrato bancário em um arquivo PDF.
     * 
     * @param telaMostraExtrato O componente JTextArea que contém o texto do extrato a ser impresso.
     */
    public void ImprimirExtrato(JTextArea telaMostraExtrato) {
        // Verifica se o JTextArea é nulo
        if (telaMostraExtrato == null) {
            JOptionPane.showMessageDialog(null, traducao.getTraducao("error.transacao"), traducao.getTraducao("title.ERROR_MESSAGE"), JOptionPane.ERROR_MESSAGE);
            return;
        }
        // Obtém o diretório padrão de downloads
        String diretorioDownloads = System.getProperty("user.home") + "/Downloads";

        // Cria o diretório se não existir
        File diretorio = new File(diretorioDownloads);
        if (!diretorio.exists()) {
            diretorio.mkdirs();
        }

        // Obtém o horário atual para formar o nome do arquivo
        LocalDateTime agora = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss");
        String nomeArquivo = "extrato_" + agora.format(formatter) + ".pdf";

        // Cria o caminho completo do arquivo
        Path caminhoArquivo = (Path) Paths.get(diretorioDownloads, nomeArquivo);

        // Tenta salvar o arquivo
        try {
            // Cria um documento PDF
            Document documento = new Document();
            PdfWriter.getInstance(documento, new FileOutputStream(caminhoArquivo.toString()));
            // Abre o documento
            documento.open();
            // Adiciona o texto do JTextArea ao documento PDF
            documento.add(new Paragraph(telaMostraExtrato.getText()));
            // Fecha o documento
            documento.close();
            // Exibe mensagem de sucesso
            JOptionPane.showMessageDialog(null, traducao.getTraducao("information.extrato_salvo") + caminhoArquivo, traducao.getTraducao("title.INFORMATION_MESSAGE"), JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException e) {
            // Exibe mensagem de erro em caso de falha ao salvar o arquivo
            JOptionPane.showMessageDialog(null, traducao.getTraducao("error.salvar_extrato") + e.getMessage(), traducao.getTraducao("title.ERROR_MESSAGE"), JOptionPane.ERROR_MESSAGE);
        } catch (DocumentException e) {
            // Exibe mensagem de erro em caso de falha ao criar o documento PDF
            JOptionPane.showMessageDialog(null, traducao.getTraducao("error.criar_doc") + e.getMessage(), traducao.getTraducao("title.ERROR_MESSAGE"), JOptionPane.ERROR_MESSAGE);
        }
    }
}
