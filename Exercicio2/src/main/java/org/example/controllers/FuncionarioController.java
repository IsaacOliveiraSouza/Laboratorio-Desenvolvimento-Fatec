package org.example.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import org.example.Database.FuncionarioDAO;
import org.example.Funcionario;

public class FuncionarioController {

    @FXML
    private TextField nomeField;
    @FXML
    private TextField cargoField;
    @FXML
    private TableView<Funcionario> tabelaFuncionarios;
    @FXML
    private TableColumn<Funcionario, Integer> idColumn;
    @FXML
    private TableColumn<Funcionario, String> nomeColumn;
    @FXML
    private TableColumn<Funcionario, String> cargoColumn;

    private final FuncionarioDAO dao = new FuncionarioDAO();
    private Funcionario funcionarioSelecionado;

    @FXML
    public void initialize() {
        nomeColumn.setCellValueFactory(cell -> new javafx.beans.property.SimpleStringProperty(cell.getValue().getNome()));
        cargoColumn.setCellValueFactory(cell -> new javafx.beans.property.SimpleStringProperty(cell.getValue().getCargo()));
        carregarTabela();
    }

    public void carregarTabela() {
        ObservableList<Funcionario> lista = FXCollections.observableArrayList(dao.listar());
        tabelaFuncionarios.setItems(lista);
    }

    @FXML
    public void criarFuncionario() {
        String nome = nomeField.getText();
        String cargo = cargoField.getText();

        if (nome.isEmpty() || cargo.isEmpty()) return;

        Funcionario novo = new Funcionario( nome, cargo);
        dao.salvar(novo);
        carregarTabela();
        limparCampos();
    }

    @FXML
    public void atualizarFuncionario() {
        if (funcionarioSelecionado != null) {
            funcionarioSelecionado.setNome(nomeField.getText());
            funcionarioSelecionado.setCargo(cargoField.getText());
            dao.atualizar(funcionarioSelecionado);
            carregarTabela();
            limparCampos();
        }
    }

    @FXML
    public void excluirFuncionario() {
        if (funcionarioSelecionado != null) {
            dao.excluir(funcionarioSelecionado.getId());
            carregarTabela();
            limparCampos();
        }
    }

    @FXML
    public void selecionarFuncionario(MouseEvent event) {
        funcionarioSelecionado = tabelaFuncionarios.getSelectionModel().getSelectedItem();
        if (funcionarioSelecionado != null) {
            nomeField.setText(funcionarioSelecionado.getNome());
            cargoField.setText(funcionarioSelecionado.getCargo());
        }
    }

    @FXML
    public void limparCampos() {
        nomeField.clear();
        cargoField.clear();
        funcionarioSelecionado = null;
        tabelaFuncionarios.getSelectionModel().clearSelection();
    }
}
