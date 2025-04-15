package org.example;

public class Funcionario {
    private String nome;
    private String cargo;
    private double salario;

    // Construtor
    public Funcionario(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    // Método para dar aumento ao funcionário
    public void receberAumento(double percentual) {
        salario += salario * (percentual / 100);
        System.out.println("O funcionário " + nome + " recebeu um aumento de " + percentual + "%. Novo salário: R$" + salario);
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}