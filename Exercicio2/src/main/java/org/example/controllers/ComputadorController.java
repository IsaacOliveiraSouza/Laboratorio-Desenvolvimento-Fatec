package org.example.controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import org.example.Computador;
import org.example.Database.ComputadorDAO;

public class ComputadorController {

    @FXML
    private TextField marcaField;
    @FXML
    private TextField modeloField;
    @FXML
    private TextField ramField;
    @FXML
    private Label resultadoLabel;

    @FXML
    private TableView<Computador> tabelaComputadores;
    @FXML
    private TableColumn<Computador, String> colunaMarca;
    @FXML
    private TableColumn<Computador, String> colunaModelo;
    @FXML
    private TableColumn<Computador, Integer> colunaRam;

    private Computador computador;

    @FXML
    public void initialize() {
        colunaMarca.setCellValueFactory(cellData -> new javafx.beans.property.SimpleStringProperty(cellData.getValue().getMarca()));
        colunaModelo.setCellValueFactory(cellData -> new javafx.beans.property.SimpleStringProperty(cellData.getValue().getModelo()));
        colunaRam.setCellValueFactory(cellData -> new javafx.beans.property.SimpleIntegerProperty(cellData.getValue().getRam()).asObject());

        atualizarTabela();
    }

    private void atualizarTabela() {
        ComputadorDAO dao = new ComputadorDAO();
        ObservableList<Computador> lista = FXCollections.observableArrayList(dao.listar());
        tabelaComputadores.setItems(lista);
    }

    @FXML
    protected void criarComputador() {
        try {
            String marca = marcaField.getText();
            String modelo = modeloField.getText();
            int ram = Integer.parseInt(ramField.getText());

            computador = new Computador(marca, modelo, ram);
            new ComputadorDAO().criarComputador(computador);

            resultadoLabel.setText("Computador criado com sucesso!");
            atualizarTabela();
        } catch (NumberFormatException e) {
            resultadoLabel.setText("Erro: RAM deve ser um número inteiro.");
        }
    }

    @FXML
    public void exibirDetalhesComputador(MouseEvent event) {
        Computador comp = tabelaComputadores.getSelectionModel().getSelectedItem();
        if (comp != null) {
            marcaField.setText(comp.getMarca());
            modeloField.setText(comp.getModelo());
            ramField.setText(String.valueOf(comp.getRam()));
        }
    }

    @FXML
    public void atualizarComputador() {
        Computador comp = tabelaComputadores.getSelectionModel().getSelectedItem();
        if (comp != null) {
            comp.setMarca(marcaField.getText());
            comp.setModelo(modeloField.getText());
            comp.setRam(Integer.parseInt(ramField.getText()));

            new ComputadorDAO().atualizar(comp);
            resultadoLabel.setText("Computador atualizado!");
            atualizarTabela();
        }
    }

    @FXML
    public void deletarComputador() {
        Computador comp = tabelaComputadores.getSelectionModel().getSelectedItem();
        if (comp != null) {
            new ComputadorDAO().deletar(comp.getId());
            resultadoLabel.setText("Computador deletado!");
            atualizarTabela();
        }
    }

    @FXML
    protected void ligarComputador() {
        if (computador != null) {
            computador.ligar();
            resultadoLabel.setText("Computador ligado (veja o console).");
        } else {
            resultadoLabel.setText("Crie um computador primeiro.");
        }
    }

    @FXML
    protected void desligarComputador() {
        if (computador != null) {
            computador.desligar();
            resultadoLabel.setText("Computador desligado (veja o console).");
        } else {
            resultadoLabel.setText("Crie um computador primeiro.");
        }
    }
}
