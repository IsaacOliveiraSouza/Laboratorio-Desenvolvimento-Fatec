package org.example;

public class Robo {
    private String nome;
    private String tipo;
    private int nivelBateria;

    public Robo(String nome, String tipo, int nivelBateria) {
        this.nome = nome;
        this.tipo = tipo;
        this.nivelBateria = nivelBateria;
    }

    public void mover() {
        if (nivelBateria > 0) {
            nivelBateria -= 10;
            System.out.println("O robô " + nome + " está se movendo. Bateria restante: " + nivelBateria + "%");
        } else {
            System.out.println("Bateria do robô " + nome + " esgotada.");
        }
    }

    public void recarregar() {
        nivelBateria = 100;
        System.out.println("O robô " + nome + " foi recarregado. Bateria: 100%");
    }
}