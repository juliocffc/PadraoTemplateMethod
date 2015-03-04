package br.com.atual.exemplo;

/**
 * Created by Ton on 04/03/2015.
 */
public class DaoPessoaFisica extends Dao {

    @Override
    protected Boolean valida(IBean entidade) {
        System.out.println(" executou em pessoa fisica");
        if(entidade.getId() != null  && entidade.getCpf() !=null){
                return true;
        }
        return false;
    }
}
