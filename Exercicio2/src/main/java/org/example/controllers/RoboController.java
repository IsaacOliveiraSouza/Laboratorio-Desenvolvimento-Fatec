package org.example.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.example.Robo;

public class RoboController {
    @FXML
    private TextField nomeField;

    @FXML
    private TextField tipoField;

    @FXML
    private TextField bateriaField;

    @FXML
    private Button criarButton;

    @FXML
    private Label resultadoLabel;

    private Robo robo;

    @FXML
    protected void criarRobo() {
        try {
            // Obter os valores dos campos
            String nome = nomeField.getText();
            String tipo = tipoField.getText();
            int bateria = Integer.parseInt(bateriaField.getText());

            // Validar a bateria
            if (bateria < 0 || bateria > 100) {
                resultadoLabel.setText("Erro: A bateria deve estar entre 0 e 100.");
                return;
            }

            // Criar um novo robô
            robo = new Robo(nome, tipo, bateria);

            // Exibir mensagem de sucesso
            resultadoLabel.setText("Robô criado: " + robo.getNome() + ", Tipo: " + robo.getTipo() + ", Bateria: " + robo.getBateria() + "%");
        } catch (NumberFormatException e) {
            resultadoLabel.setText("Erro: Insira uma bateria válida.");
        }
    }

    @FXML
    protected void realizarTarefa() {
        if (robo != null) {
            robo.realizarTarefa();
            resultadoLabel.setText("Tarefa realizada no console. Bateria restante: " + robo.getBateria() + "%");
        } else {
            resultadoLabel.setText("Erro: Crie um robô primeiro.");
        }
    }

    @FXML
    protected void recarregarBateria() {
        if (robo != null) {
            robo.recarregarBateria();
            resultadoLabel.setText("Bateria recarregada no console. Bateria: " + robo.getBateria() + "%");
        } else {
            resultadoLabel.setText("Erro: Crie um robô primeiro.");
        }
    }
}