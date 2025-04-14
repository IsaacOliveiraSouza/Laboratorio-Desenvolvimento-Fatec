package org.example;

public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEstoque;

    public Produto(String nome, double preco, int quantidadeEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public void comprar(int quantidade) {
        if (quantidade <= quantidadeEstoque) {
            quantidadeEstoque -= quantidade;
            System.out.println("Compra realizada: " + quantidade + " unidades de " + nome + ".");
        } else {
            System.out.println("Estoque insuficiente.");
        }
    }

    public double getPreco() {
        return preco;
    }
}