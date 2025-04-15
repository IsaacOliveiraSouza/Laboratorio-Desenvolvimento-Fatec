package org.example.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.example.Computador;

public class ComputadorController {
    @FXML
    private TextField marcaField;

    @FXML
    private TextField modeloField;

    @FXML
    private TextField ramField;

    @FXML
    private Button criarButton;

    @FXML
    private Label resultadoLabel;

    private Computador computador;

    @FXML
    protected void criarComputador() {
        try {
            // Obter os valores dos campos
            String marca = marcaField.getText();
            String modelo = modeloField.getText();
            int memoriaRAM = Integer.parseInt(ramField.getText());

            // Criar um novo computador
            computador = new Computador(marca, modelo, memoriaRAM);

            // Exibir mensagem de sucesso
            resultadoLabel.setText("Computador criado: " + computador.getMarca() + " " + computador.getModelo() + ", Memória RAM: " + computador.getMemoriaRAM() + " GB");
        } catch (NumberFormatException e) {
            resultadoLabel.setText("Erro: Insira uma memória RAM válida.");
        }
    }

    @FXML
    protected void ligarComputador() {
        if (computador != null) {
            computador.ligar();
            resultadoLabel.setText("O computador foi ligado no console.");
        } else {
            resultadoLabel.setText("Erro: Crie um computador primeiro.");
        }
    }

    @FXML
    protected void desligarComputador() {
        if (computador != null) {
            computador.desligar();
            resultadoLabel.setText("O computador foi desligado no console.");
        } else {
            resultadoLabel.setText("Erro: Crie um computador primeiro.");
        }
    }
}