package com.mycompany.entidades;
/**
 *
 * @author Leonardo de Souza da Luz
 * https://github.com/LeonS7
 */
import com.mycompany.telas.Login;

/**
 * A classe Executa contém o método principal (main) que inicia a execução da aplicação.
 * Ela cria uma instância da tela de login (Login) e a torna visível para o usuário.
 * 
 */
public class Executa {
    
    /**
     * O método principal (main) que inicia a execução da aplicação.
     * @param args Os argumentos da linha de comando (não são utilizados neste contexto).
     */
    public static void main(String args[]) {
        // Cria uma instância da tela de login
        Login login = new Login();
        // Define a posição da tela para o centro da tela principal (null)
        login.setLocationRelativeTo(null);
        // Torna a tela de login visível para o usuário
        login.setVisible(true);
    }
}