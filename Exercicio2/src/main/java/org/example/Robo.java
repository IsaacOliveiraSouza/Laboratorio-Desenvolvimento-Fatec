package org.example;

public class Robo {
    private int id;
    private String nome;
    private String tipo;
    private int bateria;

    public Robo(String nome, String tipo, int bateria) {
        this.nome = nome;
        this.tipo = tipo;
        this.bateria = bateria;
    }

    public Robo(int id, String nome, String tipo, int bateria) {
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
        this.bateria = bateria;
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }

    public void realizarTarefa() {
        if (bateria > 20) bateria -= 10;
    }

    public void recarregarBateria() {
        bateria = 100;
    }
}
