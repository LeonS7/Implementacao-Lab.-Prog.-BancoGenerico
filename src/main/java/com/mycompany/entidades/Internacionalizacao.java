package com.mycompany.entidades;
/**
 *
 * @author Leonardo de Souza da Luz
 * https://github.com/LeonS7
 */
import java.util.Locale;
import java.util.ResourceBundle;
/**
 * Classe para internacionalização de uma aplicação, utilizando ResourceBundle para carregar os arquivos de propriedades
 * correspondentes aos idiomas suportados.
 */
public class Internacionalizacao {
    // Caminho para a pasta contendo os arquivos de propriedades de idioma
    private static final String CAMINHO_IDIOMAS = "idiomas.MessagesBundle";

    // ResourceBundle para carregar as traduções
    private ResourceBundle resourceBundle;
    /**
     * Construtor da classe Internacionalizacao.
     * Carrega o ResourceBundle com base no idioma do sistema do usuário.
     * Se não encontrar um arquivo para o idioma do sistema, carrega o arquivo padrão (pt_BR).
     */
    public Internacionalizacao() {
        // Obtém o idioma do sistema do usuário
        Locale locale = Locale.getDefault();
        // Tenta carregar o ResourceBundle para o idioma do sistema
        try {
            resourceBundle = ResourceBundle.getBundle(CAMINHO_IDIOMAS, locale);
        } catch (Exception e) {
            // Caso não encontre para o idioma do sistema, carrega o padrão (pt_BR)
            resourceBundle = ResourceBundle.getBundle(CAMINHO_IDIOMAS, new Locale("pt", "BR"));
        }
    }
    /**
     * Obtém a tradução associada à chave especificada.
     * @param chave A chave para a qual a tradução é desejada.
     * @return A tradução associada à chave. Se não houver tradução, retorna a própria chave.
     */
    public String getTraducao(String chave) {
        String traducao = null;
        try {
            // Tenta obter a tradução da chave fornecida
            traducao = resourceBundle.getString(chave);
        } catch (Exception e) {
            // Se a tradução não for encontrada, retorna a mensagem padrão para a chave
            traducao = ResourceBundle.getBundle(CAMINHO_IDIOMAS, new Locale("pt", "BR")).getString(chave);
        }
        return traducao;
    }
}

