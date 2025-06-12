package org.example.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.example.Animal;
import org.example.Database.AnimalDAO;

public class AnimalController {
    @FXML
    private TextField nomeField;

    @FXML
    private TextField idadeField;

    @FXML
    private TextField especieField;

    @FXML
    private Button criarButton;

    @FXML
    private Label resultadoLabel;

    private Animal animal;

    @FXML
    protected void criarAnimal() {
        try {
            String nome = nomeField.getText();
            int idade = Integer.parseInt(idadeField.getText());
            String especie = especieField.getText();

            // Criar um novo animal
            animal = new Animal(nome, idade, especie);
            AnimalDAO animalDAO =  new AnimalDAO();

            // Exibir mensagem de sucesso
            resultadoLabel.setText("Animal criado: " + animal.getNome() + " (" + animal.getEspecie() + ")");
        } catch (NumberFormatException e) {
            resultadoLabel.setText("Erro: Insira uma idade válida.");
        }
    }

    @FXML
    protected void emitirSomAnimal() {
        if (animal != null) {
            animal.emitirSom();
            resultadoLabel.setText("O som do animal foi emitido no console.");
        } else {
            resultadoLabel.setText("Erro: Crie um animal primeiro.");
        }
    }
}