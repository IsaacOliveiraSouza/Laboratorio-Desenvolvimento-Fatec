package org.example;

public class Computador {
    private String marca;
    private String modelo;
    private int memoriaRAM;

    public Computador(String marca, String modelo, int memoriaRAM) {
        this.marca = marca;
        this.modelo = modelo;
        this.memoriaRAM = memoriaRAM;
    }

    public void ligar() {
        System.out.println("O computador " + marca + " " + modelo + " está ligado.");
    }

    public void desligar() {
        System.out.println("O computador " + marca + " " + modelo + " está desligado.");
    }

    public int getMemoriaRAM() {
        return memoriaRAM;
    }
}