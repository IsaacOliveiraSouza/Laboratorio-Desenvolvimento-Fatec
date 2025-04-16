package org.example;

public class Robo {
    private String nome;
    private String tipo; // Ex.: "Exploração", "Resgate", "Doméstico"
    private int bateria; // Nível de bateria em porcentagem (0-100)

    // Construtor
    public Robo(String nome, String tipo, int bateria) {
        this.nome = nome;
        this.tipo = tipo;
        this.bateria = bateria;
    }

    // Método para realizar uma tarefa
    public void realizarTarefa() {
        if (bateria > 20) {
            System.out.println("O robô " + nome + " (" + tipo + ") está realizando uma tarefa.");
            bateria -= 10; // Consome 10% de bateria
        } else {
            System.out.println("Erro: Bateria insuficiente para realizar a tarefa.");
        }
    }

    // Método para recarregar a bateria
    public void recarregarBateria() {
        bateria = 100;
        System.out.println("O robô " + nome + " foi recarregado. Bateria: " + bateria + "%");
    }

    // Getters e Setters
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
}