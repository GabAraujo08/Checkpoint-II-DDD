package org.example.pessoas;

public class PessoaJuridica extends Pessoa{
    private String cnjp;

    public PessoaJuridica(String nome, String cnjp) {
        super(nome);
        this.cnjp = cnjp;
    }

    public String getCnjp() {
        return cnjp;
    }

    public boolean validarDocumento(){
        return true;
    }
}
