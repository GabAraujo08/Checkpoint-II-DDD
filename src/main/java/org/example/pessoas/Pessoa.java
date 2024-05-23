package org.example.pessoas;

public abstract class Pessoa implements Validador{
    private String nome;


    protected Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

}
