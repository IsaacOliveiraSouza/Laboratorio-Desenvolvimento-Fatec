package org.example.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.example.Funcionario;

public class FuncionarioController {
    @FXML
    private TextField nomeField;

    @FXML
    private TextField cargoField;

    @FXML
    private TextField salarioField;

    @FXML
    private TextField aumentoField;

    @FXML
    private Button criarButton;

    @FXML
    private Label resultadoLabel;

    private Funcionario funcionario;

    @FXML
    protected void criarFuncionario() {
        try {
            // Obter os valores dos campos
            String nome = nomeField.getText();
            String cargo = cargoField.getText();
            double salario = Double.parseDouble(salarioField.getText());

            // Criar um novo funcionário
            funcionario = new Funcionario(nome, cargo, salario);

            // Exibir mensagem de sucesso
            resultadoLabel.setText("Funcionário criado: " + funcionario.getNome() + ", Cargo: " + funcionario.getCargo() + ", Salário: R$" + funcionario.getSalario());
        } catch (NumberFormatException e) {
            resultadoLabel.setText("Erro: Insira um salário válido.");
        }
    }

    @FXML
    protected void darAumento() {
        if (funcionario != null) {
            try {
                double percentual = Double.parseDouble(aumentoField.getText());
                funcionario.receberAumento(percentual);
                resultadoLabel.setText("Aumento aplicado no console. Novo salário: R$" + funcionario.getSalario());
            } catch (NumberFormatException e) {
                resultadoLabel.setText("Erro: Insira um percentual de aumento válido.");
            }
        } else {
            resultadoLabel.setText("Erro: Crie um funcionário primeiro.");
        }
    }
}