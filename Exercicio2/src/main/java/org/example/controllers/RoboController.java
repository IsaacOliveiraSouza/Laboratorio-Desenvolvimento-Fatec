package org.example.controllers;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import org.example.Database.RoboDAO;
import org.example.Robo;

public class RoboController {

    @FXML private TextField nomeField;
    @FXML private TextField tipoField;
    @FXML private TextField bateriaField;
    @FXML private Label resultadoLabel;
    @FXML private TableView<Robo> tabelaRobos;

    @FXML private TableColumn<Robo, String> nomeColumn;
    @FXML private TableColumn<Robo, String> tipoColumn;
    @FXML private TableColumn<Robo, Integer> bateriaColumn;

    private Robo roboSelecionado;

    private final RoboDAO roboDAO = new RoboDAO();

    @FXML
    public void initialize() {
        configurarColunas();
        atualizarTabela();
    }

    private void configurarColunas() {
        nomeColumn.setCellValueFactory(cell -> new SimpleStringProperty(cell.getValue().getNome()));
        tipoColumn.setCellValueFactory(cell -> new SimpleStringProperty(cell.getValue().getTipo()));
        bateriaColumn.setCellValueFactory(cell -> new SimpleIntegerProperty(cell.getValue().getBateria()).asObject());
    }

    private void atualizarTabela() {
        ObservableList<Robo> lista = FXCollections.observableArrayList(roboDAO.listarRobos());
        tabelaRobos.setItems(lista);
    }

    @FXML
    protected void criarRobo() {
        try {
            String nome = nomeField.getText();
            String tipo = tipoField.getText();
            int bateria = Integer.parseInt(bateriaField.getText());

            Robo novoRobo = new Robo(nome, tipo, bateria);
            roboDAO.inserirRobo(novoRobo);
            resultadoLabel.setText("Robô criado com sucesso!");
            limparCampos();
            atualizarTabela();
        } catch (NumberFormatException e) {
            resultadoLabel.setText("Erro: Informe um valor válido para a bateria.");
        }
    }

    @FXML
    protected void atualizarRobo() {
        if (roboSelecionado != null) {
            try {
                roboSelecionado.setNome(nomeField.getText());
                roboSelecionado.setTipo(tipoField.getText());
                roboSelecionado.setBateria(Integer.parseInt(bateriaField.getText()));
                roboDAO.atualizarRobo(roboSelecionado);
                resultadoLabel.setText("Robô atualizado com sucesso!");
                limparCampos();
                atualizarTabela();
            } catch (NumberFormatException e) {
                resultadoLabel.setText("Erro: Informe um valor válido para a bateria.");
            }
        } else {
            resultadoLabel.setText("Selecione um robô para atualizar.");
        }
    }

    @FXML
    protected void deletarRobo() {
        if (roboSelecionado != null) {
            roboDAO.deletarRobo(roboSelecionado.getId());
            resultadoLabel.setText("Robô excluído com sucesso!");
            limparCampos();
            atualizarTabela();
        } else {
            resultadoLabel.setText("Selecione um robô para excluir.");
        }
    }

    @FXML
    protected void realizarTarefa() {
        if (roboSelecionado != null) {
            roboSelecionado.realizarTarefa();
            roboDAO.atualizarRobo(roboSelecionado);
            resultadoLabel.setText("Tarefa realizada. Nova bateria: " + roboSelecionado.getBateria());
            atualizarTabela();
        } else {
            resultadoLabel.setText("Selecione um robô primeiro.");
        }
    }

    @FXML
    protected void recarregarBateria() {
        if (roboSelecionado != null) {
            roboSelecionado.recarregarBateria();
            roboDAO.atualizarRobo(roboSelecionado);
            resultadoLabel.setText("Bateria recarregada.");
            atualizarTabela();
        } else {
            resultadoLabel.setText("Selecione um robô primeiro.");
        }
    }

    @FXML
    public void selecionarRoboNaTabela(MouseEvent event) {
        roboSelecionado = tabelaRobos.getSelectionModel().getSelectedItem();
        if (roboSelecionado != null) {
            nomeField.setText(roboSelecionado.getNome());
            tipoField.setText(roboSelecionado.getTipo());
            bateriaField.setText(String.valueOf(roboSelecionado.getBateria()));
        }
    }

    private void limparCampos() {
        nomeField.clear();
        tipoField.clear();
        bateriaField.clear();
    }
}