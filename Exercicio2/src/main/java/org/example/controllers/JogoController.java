package org.example.controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import org.example.Database.JogoDAO;
import org.example.Jogo;

public class JogoController {
    @FXML private TextField nomeField;
    @FXML private TextField generoField;
    @FXML private Label resultadoLabel;
    @FXML private TableView<Jogo> tabelaJogos;
    @FXML private TableColumn<Jogo, String> colunaNome;
    @FXML private TableColumn<Jogo, String> colunaGenero;

    private Jogo jogo;

    @FXML
    protected void criarJogo() {
        String nome = nomeField.getText();
        String genero = generoField.getText();
        jogo = new Jogo(nome, genero);
        new JogoDAO().criar(jogo);
        resultadoLabel.setText("Jogo criado: " + nome);
        atualizarTabela();
    }

    @FXML
    public void atualizarJogo() {
        Jogo jogo = tabelaJogos.getSelectionModel().getSelectedItem();
        if (jogo != null) {
            jogo.setNome(nomeField.getText());
            jogo.setGenero(generoField.getText());
            new JogoDAO().atualizar(jogo);
            resultadoLabel.setText("Jogo atualizado!");
            atualizarTabela();
        }
    }

    @FXML
    public void deletarJogo() {
        Jogo jogo = tabelaJogos.getSelectionModel().getSelectedItem();
        if (jogo != null) {
            new JogoDAO().deletar(jogo.getId());
            resultadoLabel.setText("Jogo deletado!");
            atualizarTabela();
        }
    }

    @FXML
    public void exibirDetalhesJogo(MouseEvent event) {
        Jogo selecionado = tabelaJogos.getSelectionModel().getSelectedItem();
        if (selecionado != null) {
            nomeField.setText(selecionado.getNome());
            generoField.setText(selecionado.getGenero());
        }
    }

    private void atualizarTabela() {
        ObservableList<Jogo> lista = FXCollections.observableArrayList(new JogoDAO().listar());
        tabelaJogos.setItems(lista);
    }

    @FXML
    public void initialize() {
        colunaNome.setCellValueFactory(cellData -> new javafx.beans.property.SimpleStringProperty(cellData.getValue().getNome()));
        colunaGenero.setCellValueFactory(cellData -> new javafx.beans.property.SimpleStringProperty(cellData.getValue().getGenero()));
        atualizarTabela();
    }

    @FXML
    protected void iniciarJogo() {
        if (jogo != null) {
            jogo.iniciar();
            resultadoLabel.setText("Jogo iniciado! Veja no console.");
        } else {
            resultadoLabel.setText("Erro: Crie um jogo primeiro.");
        }
    }
}
