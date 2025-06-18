package org.example;

public class Jogo {
    private int id;
    private String nome;
    private String genero;

    public Jogo(String nome, String genero) {
        this.nome = nome;
        this.genero = genero;
    }

    public void iniciar() {
        System.out.println("Iniciando o jogo " + nome + ".");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
