package org.example;

public class Computador {
    private String marca;
    private String modelo;
    private int memoriaRAM;

    // Construtor
    public Computador(String marca, String modelo, int memoriaRAM) {
        this.marca = marca;
        this.modelo = modelo;
        this.memoriaRAM = memoriaRAM;
    }

    // Método para ligar o computador
    public void ligar() {
        System.out.println("O computador " + marca + " " + modelo + " está ligado.");
    }

    // Método para desligar o computador
    public void desligar() {
        System.out.println("O computador " + marca + " " + modelo + " está desligado.");
    }

    // Getters e Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getMemoriaRAM() {
        return memoriaRAM;
    }

    public void setMemoriaRAM(int memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }
}