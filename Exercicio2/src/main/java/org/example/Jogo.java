package org.example;

public class Jogo {
    private String nome;
    private String genero;
    private boolean multiplayer;

    // Construtor
    public Jogo(String nome, String genero, boolean multiplayer) {
        this.nome = nome;
        this.genero = genero;
        this.multiplayer = multiplayer;
    }

    // Método para iniciar o jogo
    public void iniciar() {
        System.out.println("Iniciando o jogo " + nome + ".");
    }

    // Getters e Setters
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

    public boolean isMultiplayer() {
        return multiplayer;
    }

    public void setMultiplayer(boolean multiplayer) {
        this.multiplayer = multiplayer;
    }
}