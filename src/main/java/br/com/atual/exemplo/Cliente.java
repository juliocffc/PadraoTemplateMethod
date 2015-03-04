package br.com.atual.exemplo;

/**
 * Created by Ton on 04/03/2015.
 */
public class Cliente extends  Entidade implements IBean {

    private String cpf;

    private String rg;

    @Override
    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
}
