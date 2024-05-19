
package com.mycompany.BD;

import com.mycompany.entidades.Internacionalizacao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 * A classe bancoDados representa a configuração e operações de conexão com um banco de dados.
 * Ela fornece métodos para configurar os parâmetros de conexão e obter uma conexão ativa com o banco de dados.
 * 
 * @author Leonardo de Souza da Luz
 */
public class bancoDados {
    // Obtém o ResourceBundle contendo as mensagens internacionalizadas
    Internacionalizacao traducao = new Internacionalizacao();
    
    /** A URL de conexão com o banco de dados. */
    private String url;
    /** A porta do banco de dados. */
    private String porta;
    /** O nome do banco de dados. */
    private String banco;
    /** O nome de usuário para conexão com o banco de dados. */
    private String usuario;
    /** A senha de acesso ao banco de dados. */
    private String senha;
    /** O nome específico do banco de dados a ser acessado. */
    private String nomeBanco;
    
    /**
     * Construtor padrão que inicializa os parâmetros de conexão com valores padrão.
     */
    public bancoDados(){
        this.usuario = "root";
        this.senha = "@CR7#ls19";
        this.nomeBanco = "BancoGenerico";
        this.porta = "3306";
        this.banco = "mysql";                        
    }

    /**
     * Obtém a porta atualmente configurada para a conexão com o banco de dados.
     * @return A porta de conexão.
     */
    public String getPorta() {
        return porta;
    }

    /**
     * Define a porta para a conexão com o banco de dados.
     * @param porta A porta a ser definida.
     */
    public void setPorta(String porta) {
        this.porta = porta;
    }

    /**
     * Obtém o nome do banco de dados atualmente configurado.
     * @return O nome do banco de dados.
     */
    public String getBanco() {
        return banco;
    }

    /**
     * Define o nome do banco de dados a ser utilizado na conexão.
     * @param banco O nome do banco de dados.
     */
    public void setBanco(String banco) {
        this.banco = banco;
    }

    /**
     * Obtém o nome de usuário atualmente configurado para a conexão com o banco de dados.
     * @return O nome de usuário.
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * Define o nome de usuário para a conexão com o banco de dados.
     * @param usuario O nome de usuário a ser definido.
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * Obtém o nome específico do banco de dados a ser acessado.
     * @return O nome do banco de dados específico.
     */
    public String getNomeBanco() {
        return nomeBanco;
    }

    /**
     * Define o nome específico do banco de dados a ser acessado.
     * @param nomeBanco O nome do banco de dados específico.
     */
    public void setNomeBanco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }       

    /**
     * Obtém uma conexão ativa com o banco de dados usando os parâmetros configurados.
     * @return Uma conexão JDBC ativa ou null em caso de falha na conexão.
     */
    public Connection getConexao(){

        Connection conexao = null;        
        
        try {
            this.url = "jdbc:"+this.banco+"://localhost:"+this.porta+"/"+this.nomeBanco;
            conexao = DriverManager.getConnection(this.url, this.usuario, this.senha);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, traducao.getTraducao("error.conexao") + ex.getMessage(), traducao.getTraducao("title.ERROR_MESSAGE"), JOptionPane.ERROR_MESSAGE);
        }
        return conexao;
    }
    
}