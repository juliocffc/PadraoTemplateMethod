package br.com.atual.exemplo;

/**
 * Created by Ton on 04/03/2015.
 */
public abstract class Dao {

    protected  Boolean  valida(IBean entidade){
        System.out.println("eita pega");
        return true;
    }


    public void salvar(IBean entidade) {

        if (valida(entidade) == true) {
            System.out.println("registro salvo com sucesso");
        } else {
            System.out.println(" dados invalidos");
        }

    }


}
