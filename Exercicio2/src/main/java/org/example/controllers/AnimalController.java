package org.example.controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import org.example.Animal;
import org.example.Database.AnimalDAO;

public class AnimalController {
    @FXML
    private TableColumn<Animal, String> colunaNome;

    @FXML
    private TableColumn<Animal, String> colunaEspecie;

    @FXML
    private TableColumn<Animal, Integer> colunaIdade;
;

    @FXML
    private TextField especieField;

    @FXML
    private TextField idadeField;

    @FXML
    private TextField nomeField;

    @FXML
    private Label resultadoLabel;

    @FXML
    private TableView<Animal> tabelaAnimais;

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
            animalDAO.CriarAnimal(animal);
            // Exibir mensagem de sucesso
            resultadoLabel.setText("Animal criado: " + animal.getNome() + " (" + animal.getEspecie() + ")");
        } catch (NumberFormatException e) {
            resultadoLabel.setText("Erro: Insira uma idade válida.");
        }
    }

    @FXML
    public void atualizarAnimal() {
        Animal animal = tabelaAnimais.getSelectionModel().getSelectedItem();
        if (animal != null) {
            animal.setNome(nomeField.getText());
            animal.setEspecie(especieField.getText());
            animal.setIdade(Integer.parseInt(idadeField.getText()));

            AnimalDAO animalDAO =  new AnimalDAO();
            animalDAO.atualizar(animal);
            resultadoLabel.setText("Animal atualizado!");
            atualizarTabela();
        }
    }

    @FXML
    public void exibirDetalhesAnimal(MouseEvent event) {
        Animal selecionado = tabelaAnimais.getSelectionModel().getSelectedItem();
        System.out.println(selecionado);
        if (selecionado != null) {
            nomeField.setText(selecionado.getNome());
            especieField.setText(selecionado.getEspecie());
            idadeField.setText(String.valueOf(selecionado.getIdade()));
        }
    }

    @FXML
    public void deletarAnimal() {
        Animal animal = tabelaAnimais.getSelectionModel().getSelectedItem();
        if (animal != null) {
            AnimalDAO animalDAO = new AnimalDAO();
            animalDAO.deletar(animal.getId());
            resultadoLabel.setText("animal excluído!");
            atualizarTabela();
        }
    }


    private void atualizarTabela() {
        AnimalDAO animalDAO = new AnimalDAO();
        ObservableList<Animal> ListaAnimais;
        ListaAnimais = FXCollections.observableArrayList(animalDAO.listar());
        tabelaAnimais.setItems(ListaAnimais);
    }

    @FXML
    public void initialize() {
        colunaNome.setCellValueFactory(cellData -> new javafx.beans.property.SimpleStringProperty(cellData.getValue().getNome()));
        colunaEspecie.setCellValueFactory(cellData -> new javafx.beans.property.SimpleStringProperty(cellData.getValue().getEspecie()));
        colunaIdade.setCellValueFactory(cellData -> new javafx.beans.property.SimpleIntegerProperty(cellData.getValue().getIdade()).asObject());

        atualizarTabela();
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