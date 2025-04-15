package org.example.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.example.Jogo;

public class JogoController {
    @FXML
    private TextField nomeField;

    @FXML
    private TextField generoField;

    @FXML
    private CheckBox multiplayerCheckBox;

    @FXML
    private Button criarButton;

    @FXML
    private Label resultadoLabel;

    private Jogo jogo;

    @FXML
    protected void criarJogo() {
        try {
            // Obter os valores dos campos
            String nome = nomeField.getText();
            String genero = generoField.getText();
            boolean multiplayer = multiplayerCheckBox.isSelected();

            // Criar um novo jogo
            jogo = new Jogo(nome, genero, multiplayer);

            // Exibir mensagem de sucesso
            resultadoLabel.setText("Jogo criado: " + jogo.getNome() + " (" + jogo.getGenero() + ")");
        } catch (Exception e) {
            resultadoLabel.setText("Erro: Preencha todos os campos corretamente.");
        }
    }

    @FXML
    protected void iniciarJogo() {
        if (jogo != null) {
            jogo.iniciar();
            resultadoLabel.setText("O jogo foi iniciado no console.");
        } else {
            resultadoLabel.setText("Erro: Crie um jogo primeiro.");
        }
    }
}