package org.example.controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.cell.PropertyValueFactory;
import org.example.Carro;
import org.example.Database.CarroDAO;

public class CarroController {

    @FXML private TextField marcaField;
    @FXML private TextField modeloField;
    @FXML private TextField anoField;
    @FXML private Label resultadoLabel;

    @FXML private TableView<Carro> tabelaCarros;
    @FXML private TableColumn<Carro, Integer> colunaId;
    @FXML private TableColumn<Carro, String> colunaMarca;
    @FXML private TableColumn<Carro, String> colunaModelo;
    @FXML private TableColumn<Carro, String> colunaAno;

    private ObservableList<Carro> listaCarros = FXCollections.observableArrayList();
    private Carro carroSelecionado;
    private CarroDAO carroDAO = new CarroDAO();

    @FXML
    public void initialize() {
        colunaId.setCellValueFactory(new PropertyValueFactory<>("id"));
        colunaMarca.setCellValueFactory(new PropertyValueFactory<>("marca"));
        colunaModelo.setCellValueFactory(new PropertyValueFactory<>("modelo"));
        colunaAno.setCellValueFactory(new PropertyValueFactory<>("anoFabricacao"));

        tabelaCarros.setItems(listaCarros);
        tabelaCarros.setOnMouseClicked(this::selecionarCarro);

        carregarDados();
    }

    private void carregarDados() {
        listaCarros.setAll(carroDAO.listarTodos());
    }

    public void criarCarro() {
        if (camposInvalidos()) return;

        Carro carro = new Carro(0, marcaField.getText(), modeloField.getText(), anoField.getText());
        if (carroDAO.inserir(carro)) {
            resultadoLabel.setText("Carro criado com sucesso.");
            limparCampos();
            carregarDados();
        } else {
            resultadoLabel.setText("Erro ao criar carro.");
        }
    }

    public void atualizarCarro() {
        if (carroSelecionado == null) {
            resultadoLabel.setText("Selecione um carro.");
            return;
        }

        carroSelecionado.setMarca(marcaField.getText());
        carroSelecionado.setModelo(modeloField.getText());
        carroSelecionado.setAnoFabricacao(anoField.getText());

        if (carroDAO.atualizar(carroSelecionado)) {
            resultadoLabel.setText("Carro atualizado.");
            limparCampos();
            carregarDados();
        } else {
            resultadoLabel.setText("Erro ao atualizar carro.");
        }
    }

    public void excluirCarro() {
        if (carroSelecionado == null) {
            resultadoLabel.setText("Selecione um carro.");
            return;
        }

        if (carroDAO.excluir(carroSelecionado.getId())) {
            resultadoLabel.setText("Carro excluído.");
            limparCampos();
            carregarDados();
        } else {
            resultadoLabel.setText("Erro ao excluir carro.");
        }
    }

    private void selecionarCarro(MouseEvent event) {
        carroSelecionado = tabelaCarros.getSelectionModel().getSelectedItem();
        if (carroSelecionado != null) {
            marcaField.setText(carroSelecionado.getMarca());
            modeloField.setText(carroSelecionado.getModelo());
            anoField.setText(carroSelecionado.getAnoFabricacao());
        }
    }

    private boolean camposInvalidos() {
        if (marcaField.getText().isEmpty() || modeloField.getText().isEmpty() || anoField.getText().isEmpty()) {
            resultadoLabel.setText("Preencha todos os campos.");
            return true;
        }
        return false;
    }

    private void limparCampos() {
        marcaField.clear();
        modeloField.clear();
        anoField.clear();
        carroSelecionado = null;
    }
}
