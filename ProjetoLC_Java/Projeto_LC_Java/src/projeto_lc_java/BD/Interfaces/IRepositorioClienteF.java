/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projeto_lc_java.BD.Interfaces;
import projeto_lc_java.ClassesBasicas.ClienteFisico;
import projeto_lc_java.Exception.ClienteNaoEncontradoException;

/**
 *
 * @author Aluno
 */
public interface IRepositorioClienteF {
    public void inserir(ClienteFisico cliente);
    public void excluir(String cpf);
    public ClienteFisico consultar(String cpf) throws ClienteNaoEncontradoException;
    public void atualizar(ClienteFisico cliente);
    public boolean jaExiste(String cpf);
    
}
