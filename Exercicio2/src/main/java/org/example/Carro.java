package org.example;

public class Carro {
    private int id;
    private String marca;
    private String modelo;
    private String anoFabricacao;

    public Carro(int id, String marca, String modelo, String anoFabricacao) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
    }

    public int getId() { return id; }
    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
    public String getAnoFabricacao() { return anoFabricacao; }

    public void setId(int id) { this.id = id; }
    public void setMarca(String marca) { this.marca = marca; }
    public void setModelo(String modelo) { this.modelo = modelo; }
    public void setAnoFabricacao(String anoFabricacao) { this.anoFabricacao = anoFabricacao; }
}
