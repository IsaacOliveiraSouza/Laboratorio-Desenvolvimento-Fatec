package org.example.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.example.Livro;

public class LivroController {
    @FXML
    private TextField tituloField;

    @FXML
    private TextField autorField;

    @FXML
    private TextField paginasField;

    @FXML
    private Button criarButton;

    @FXML
    private Label resultadoLabel;

    private Livro livro;

    @FXML
    protected void criarLivro() {
        try {
            // Obter os valores dos campos
            String titulo = tituloField.getText();
            String autor = autorField.getText();
            int numeroPaginas = Integer.parseInt(paginasField.getText());

            // Criar um novo livro
            livro = new Livro(titulo, autor, numeroPaginas);

            // Exibir mensagem de sucesso
            resultadoLabel.setText("Livro criado: " + livro.getTitulo() + ", Autor: " + livro.getAutor() + ", Páginas: " + livro.getNumeroPaginas());
        } catch (NumberFormatException e) {
            resultadoLabel.setText("Erro: Insira um número válido de páginas.");
        }
    }

    @FXML
    protected void exibirDetalhesLivro() {
        if (livro != null) {
            livro.exibirDetalhes();
            resultadoLabel.setText("Os detalhes do livro foram exibidos no console.");
        } else {
            resultadoLabel.setText("Erro: Crie um livro primeiro.");
        }
    }
}