package org.example.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.example.Carro;

public class CarroController {
    @FXML
    private TextField marcaField;

    @FXML
    private TextField modeloField;

    @FXML
    private TextField anoField;

    @FXML
    private Button criarButton;

    @FXML
    private Label resultadoLabel;

    private Carro carro;

    @FXML
    protected void criarCarro() {
        try {
            // Obter os valores dos campos
            String marca = marcaField.getText();
            String modelo = modeloField.getText();
            int anoFabricacao = Integer.parseInt(anoField.getText());

            // Criar um novo carro
            carro = new Carro(marca, modelo, anoFabricacao);

            // Exibir mensagem de sucesso
            resultadoLabel.setText("Carro criado: " + carro.getMarca() + " " + carro.getModelo() + " (" + carro.getAnoFabricacao() + ")");
        } catch (NumberFormatException e) {
            resultadoLabel.setText("Erro: Insira um ano válido.");
        }
    }

    @FXML
    protected void ligarCarro() {
        if (carro != null) {
            carro.ligar();
            resultadoLabel.setText("O carro foi ligado no console.");
        } else {
            resultadoLabel.setText("Erro: Crie um carro primeiro.");
        }
    }

    @FXML
    protected void desligarCarro() {
        if (carro != null) {
            carro.desligar();
            resultadoLabel.setText("O carro foi desligado no console.");
        } else {
            resultadoLabel.setText("Erro: Crie um carro primeiro.");
        }
    }
}