package br.com.atual.exemplo;

/**
 * Created by Ton on 04/03/2015.
 */
public class Inicio {


    public static void main (String[] args) {
        System.out.println("Teste salvando");

        DaoPessoaFisica dao = new DaoPessoaFisica();
        PessoaFisica pf = new PessoaFisica();
        pf.setId(0);
        pf.setNome("Ana");
        pf.setCpf("04251217985");
        dao.salvar(pf);
    }

}
