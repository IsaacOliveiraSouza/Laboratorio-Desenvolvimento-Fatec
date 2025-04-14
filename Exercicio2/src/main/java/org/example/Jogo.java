package org.example;

public class Jogo {
    private String nome;
    private String genero;
    private boolean multiplayer;

    public Jogo(String nome, String genero, boolean multiplayer) {
        this.nome = nome;
        this.genero = genero;
        this.multiplayer = multiplayer;
    }

    public void iniciar() {
        System.out.println("Iniciando o jogo " + nome + ".");
    }

    public boolean isMultiplayer() {
        return multiplayer;
    }
}