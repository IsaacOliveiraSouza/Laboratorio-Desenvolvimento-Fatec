package org.example;

public class Computador {
    private int id;
    private String marca;
    private String modelo;
    private int ram;

    public Computador(String marca, String modelo, int ram) {
        this.marca = marca;
        this.modelo = modelo;
        this.ram = ram;
    }

    public void ligar() {
        System.out.println("Computador ligado: " + modelo);
    }

    public void desligar() {
        System.out.println("Computador desligado: " + modelo);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }
}
