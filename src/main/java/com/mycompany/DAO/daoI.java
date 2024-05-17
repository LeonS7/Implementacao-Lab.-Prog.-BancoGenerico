package com.mycompany.DAO;

import java.util.List;

/**
 * A interface daoI(T) define os métodos básicos para operações de CRUD (Create, Read, Update, Delete)
 * em classes de acesso a dados (DAO - Data Access Object).
 * @param <T> O tipo genérico que representa a entidade associada ao DAO.
 * 
 * @author Leonardo de Souza da Luz
 */
public interface daoI<T> {

    /**
     * Salva um objeto do tipo T no banco de dados.
     * @param t O objeto a ser salvo.
     * @return true se o objeto foi salvo com sucesso, false caso contrário.
     */
    public boolean salvar(T t);

    /**
     * Lista todos os objetos do tipo T presentes no banco de dados.
     * @return Uma lista contendo todos os objetos do tipo T.
     */
    public List<T> listar();

    /**
     * Atualiza um objeto do tipo T no banco de dados.
     * @param t O objeto a ser atualizado.
     * @return true se o objeto foi atualizado com sucesso, false caso contrário.
     */
    public boolean atualizar(T t);

    /**
     * Exclui um objeto do tipo T do banco de dados.
     * @param t O objeto a ser excluído.
     * @return true se o objeto foi excluído com sucesso, false caso contrário.
     */
    public boolean excluir(T t);

}
