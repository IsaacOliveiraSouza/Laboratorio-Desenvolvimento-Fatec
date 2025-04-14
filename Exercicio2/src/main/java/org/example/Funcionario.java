package org.example;

public class Funcionario {
    private String nome;
    private String cargo;
    private double salario;

    public Funcionario(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public void receberAumento(double percentual) {
        salario += salario * (percentual / 100);
        System.out.println(nome + " recebeu um aumento. Novo salário: R$" + salario);
    }

    public void exibirDetalhes() {
        System.out.println("Funcionário: " + nome + ", Cargo: " + cargo + ", Salário: R$" + salario);
    }
}