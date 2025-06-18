package org.example.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class MainController {
    @FXML
    private Button animalButton;

    @FXML
    private Button carroButton;

    @FXML
    private Button pessoaButton;

    @FXML
    private Button jogoButton;

    @FXML
    private Button produtoButton;

    @FXML
    private Button livroButton;

    @FXML
    private Button computadorButton;

    @FXML
    private Button funcionarioButton;

    // Método para abrir a tela de Animal
    @FXML
    protected void abrirTelaAnimal() throws IOException {
        abrirNovaTela("/org/example/animal-view.fxml", "Cadastro de Animais");
    }

    // Método para abrir a tela de Carro
    @FXML
    protected void abrirTelaCarro() throws IOException {
        abrirNovaTela("/org/example/carro-view.fxml", "Cadastro de Carros");
    }

    // Método para abrir a tela de Pessoa
    @FXML
    protected void abrirTelaPessoa() throws IOException {
        abrirNovaTela("/org/example/pessoa-view.fxml", "Cadastro de Pessoas");
    }

    // Método para abrir a tela de Jogo
    @FXML
    protected void abrirTelaJogo() throws IOException {
        abrirNovaTela("/org/example/jogo-view_.fxml", "Cadastro de Jogos");
    }

    // Método para abrir a tela de Produto
    @FXML
    protected void abrirTelaProduto() throws IOException {
        abrirNovaTela("/org/example/produto-view.fxml", "Cadastro de Produtos");
    }

    // Método para abrir a tela de Livro
    @FXML
    protected void abrirTelaLivro() throws IOException {
        abrirNovaTela("/org/example/livro-view.fxml", "Cadastro de Livros");
    }

    // Método para abrir a tela de Computador
    @FXML
    protected void abrirTelaComputador() throws IOException {
        abrirNovaTela("/org/example/computador-view.fxml", "Cadastro de Computadores");
    }

    // Método para abrir a tela de Funcionário
    @FXML
    protected void abrirTelaFuncionario() throws IOException {
        abrirNovaTela("/org/example/funcionario-view.fxml", "Cadastro de Funcionários");
    }

    @FXML
    protected void abrirTelaRobo() throws IOException {
        abrirNovaTela("/org/example/robo-view.fxml", "Cadastro de Robôs");
    }

    // Método auxiliar para abrir uma nova tela
    private void abrirNovaTela(String fxmlPath, String titulo) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlPath));
        Scene scene = new Scene(loader.load(), 400, 350);
        Stage stage = new Stage();
        stage.setTitle(titulo);
        stage.setScene(scene);
        stage.show();
    }
}