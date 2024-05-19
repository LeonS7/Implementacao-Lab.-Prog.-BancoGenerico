
package com.mycompany.DAO;

import com.mycompany.entidades.*;
import br.com.company.db.Banco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * A classe ContaDao fornece métodos para acessar e manipular dados relacionados a contas no banco de dados.
 * Ela implementa a interface daoI(conta) para operações básicas de CRUD (Create, Read, Update, Delete).
 * 
 * @author Leonardo de Souza da Luz
 */
public class ContaDao implements daoI<Conta>{
    // Obtém o ResourceBundle contendo as mensagens internacionalizadas
    Internacionalizacao traducao = new Internacionalizacao();
    
    /** O objeto Banco utilizado para obter a conexão com o banco de dados. */
    private final Banco banco;

    /**
     * Construtor padrão que inicializa o objeto Banco para estabelecer a conexão com o banco de dados.
     */
    public ContaDao() {
        this.banco = new Banco();
    }
    
    /**
     * Salva uma nova conta no banco de dados.
     * @param conta A conta a ser salva.
     * @return true se a conta foi salva com sucesso, false caso contrário.
     */
    public boolean salvar(Conta conta){
        
        Connection conexao = this.banco.getConexao();
        boolean resultado = false;
        
        String sql = "INSERT INTO conta(nome, cpf, saldo, numeroConta, senha) VALUES (?,?,?,?,?)";
        PreparedStatement consulta;
        
        try {
            
            consulta = conexao.prepareStatement(sql);
            consulta.setString(1, conta.getNome());
            consulta.setString(2, conta.getCpf());
            consulta.setDouble(3, conta.getSaldo());
            consulta.setString(4, conta.getNumeroConta());
            consulta.setString(5, conta.getSenha());
            consulta.execute();
            resultado = true;
            
        } catch (SQLException ex) {
            resultado = false;
            JOptionPane.showMessageDialog(null, traducao.getTraducao("error.inserindo_dados") + ex.getMessage(), traducao.getTraducao("title.ERROR_MESSAGE"), JOptionPane.ERROR_MESSAGE);
        }
        
        return resultado;   
    }
    
    /**
     * Lista todas as contas presentes no banco de dados.
     * @return Uma lista de objetos Conta.
     */
    public List<Conta> listar(){
        
        Connection conexao = this.banco.getConexao();
        ArrayList<Conta> lista = new ArrayList<>();
                
        String sql = "SELECT * FROM conta";        
        ResultSet resultados;
        
        try {
            
            resultados = conexao.createStatement().executeQuery(sql);
            Conta objeto;
            while(resultados.next()){
                int idPessoa = Integer.parseInt(resultados.getString("id"));
                String nomeConta = resultados.getString("nome");
                String cpfConta = resultados.getString("cpf");
                Double saldoConta = resultados.getDouble("saldo");
                String numeroConta = resultados.getString("numeroConta");
                String senhaConta = resultados.getString("senha");
                objeto = new Conta(nomeConta, cpfConta, saldoConta, numeroConta,senhaConta);
                lista.add(objeto);
            }
        } catch (SQLException ex) {
            //Obtem as traducoes necessarias
            JOptionPane.showMessageDialog(null, traducao.getTraducao("error.lendo_dados") + ex.getMessage(), traducao.getTraducao("title.ERROR_MESSAGE"), JOptionPane.ERROR_MESSAGE);
        }
        return lista;
    }
    
    
    /**
     * Obtém uma conta do banco de dados com base no CPF.
     * @param cpf O CPF da conta a ser obtida.
     * @return O objeto Conta correspondente ao CPF fornecido, ou null se não encontrado.
     */
    public Conta get(String cpf){
        Connection conexao = this.banco.getConexao();
                
        String sql = "SELECT * FROM conta WHERE cpf = ?";     
        PreparedStatement consulta;
        ResultSet resultado;
        
        Conta objeto = null;        
        try {

            consulta = conexao.prepareStatement(sql);
            consulta.setString(1, cpf);
            resultado = consulta.executeQuery();            
            if(resultado.next()){
                
                int idConta = Integer.parseInt(resultado.getString("id"));
                String nomeConta = resultado.getString("nome");
                String cpfConta = resultado.getString("cpf");
                Double saldoConta = resultado.getDouble("saldo");
                String numeroConta = resultado.getString("numeroConta");
                String senhaConta = resultado.getString("senha");
                objeto = new Conta(nomeConta, cpfConta, saldoConta, numeroConta,senhaConta);
            }            
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, traducao.getTraducao("error.lendo_dados") + ex.getMessage(), traducao.getTraducao("title.ERROR_MESSAGE"), JOptionPane.ERROR_MESSAGE);
        }
        return objeto;
    }
    
    /**
     * Verifica se um determinado CPF e senha correspondem a uma conta existente no banco de dados.
     * @param cpf O CPF a ser verificado.
     * @param senha A senha a ser verificada.
     * @return true se o CPF e a senha correspondem a uma conta existente, false caso contrário.
     */
    public boolean pesquisaCPFeSENHA(String cpf, String senha){
        
        Connection conexao = this.banco.getConexao();
        boolean resultado = false;
        
        String sql = "SELECT * FROM conta WHERE cpf = ? AND senha = ?";
        PreparedStatement consulta;
        
        try {
            
            consulta = conexao.prepareStatement(sql);
            consulta.setString(1, cpf);
            consulta.setString(2, senha);
            consulta.execute();
            resultado = true;
            
        } catch (SQLException ex) {
            resultado = false;
            JOptionPane.showMessageDialog(null, traducao.getTraducao("error.buscando_dados") + ex.getMessage(), traducao.getTraducao("title.ERROR_MESSAGE"), JOptionPane.ERROR_MESSAGE);
        }
        return resultado;  
        
    }
    
    /**
     * Atualiza os dados de uma conta existente no banco de dados.
     * @param conta A conta com os novos dados a serem atualizados.
     * @return true se a conta foi atualizada com sucesso, false caso contrário.
     */
    public boolean atualizar(Conta conta){
        
        Connection conexao = this.banco.getConexao();
                
        String sql = "UPDATE conta SET nome = ?, cpf = ?, saldo = ?, numeroConta = ?, senha = ? WHERE id = ?";     
        PreparedStatement consulta;
        boolean atualizado = false;
                
        try {
            
            consulta = conexao.prepareStatement(sql);
            consulta.setString(1, conta.getNome());
            consulta.setString(2, conta.getCpf());
            consulta.setDouble(3, conta.getSaldo());
            consulta.setString(4, conta.getNumeroConta());
            consulta.setString(5, conta.getSenha());
            consulta.setInt(6, conta.getId());
            int linhasAtualizadas = consulta.executeUpdate();
            if(linhasAtualizadas > 0) atualizado = true;
            
        } catch (SQLException ex) {
            atualizado = false;
            JOptionPane.showMessageDialog(null, traducao.getTraducao("error.atualizando_registro") + ex.getMessage(), traducao.getTraducao("title.ERROR_MESSAGE"), JOptionPane.ERROR_MESSAGE);
        }
        
        return atualizado;
    }
    
    
    /**
     * Exclui uma conta existente no banco de dados.
     * @param conta A conta a ser excluída.
     * @return true se a conta foi excluída com sucesso, false caso contrário.
     */
    public boolean excluir(Conta conta){
        
        Connection conexao = this.banco.getConexao();
                
        String sql = "DELETE FROM conta WHERE id = ?";     
        PreparedStatement consulta;
        boolean excluido = false;
                
        try {
            
            consulta = conexao.prepareStatement(sql);
            consulta.setInt(1, conta.getId());
            int linhasExcluidas = consulta.executeUpdate();
            if( linhasExcluidas > 0) excluido = true;
            
        } catch (SQLException ex) {
            excluido = false;
            JOptionPane.showMessageDialog(null, traducao.getTraducao("error.deletando_registro") + ex.getMessage(), traducao.getTraducao("title.ERROR_MESSAGE"), JOptionPane.ERROR_MESSAGE);
        }
        return excluido;        
    }
}

