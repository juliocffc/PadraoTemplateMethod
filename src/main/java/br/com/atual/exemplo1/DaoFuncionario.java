/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.atual.exemplo1;

/**
 *
 * @author Alunos
 */
public class DaoFuncionario extends Dao{

    @Override
    protected Boolean valida(IBean entidade) {
        
        Funcionario funcionario =(Funcionario) entidade;
        
         if (funcionario.getNumeroFuncionario() != null) {
            return true;
        }

        return false;
    }
    
}
