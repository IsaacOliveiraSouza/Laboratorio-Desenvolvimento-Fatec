package org.example.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.example.Produto;

public class ProdutoController {
    @FXML
    private TextField nomeField;

    @FXML
    private TextField precoField;

    @FXML
    private TextField estoqueField;

    @FXML
    private TextField quantidadeCompraField;

    @FXML
    private Button criarButton;

    @FXML
    private Button comprarButton;

    @FXML
    private Label resultadoLabel;

    private Produto produto;

    @FXML
    protected void criarProduto() {
        try {
            // Obter os valores dos campos
            String nome = nomeField.getText();
            double preco = Double.parseDouble(precoField.getText());
            int quantidadeEstoque = Integer.parseInt(estoqueField.getText());

            // Criar um novo produto
            produto = new Produto(nome, preco, quantidadeEstoque);

            // Exibir mensagem de sucesso
            resultadoLabel.setText("Produto criado: " + produto.getNome() + ", Preço: R$" + produto.getPreco() + ", Estoque: " + produto.getQuantidadeEstoque());
        } catch (NumberFormatException e) {
            resultadoLabel.setText("Erro: Preencha os campos corretamente.");
        }
    }

    @FXML
    protected void comprarProduto() {
        if (produto != null) {
            try {
                int quantidade = Integer.parseInt(quantidadeCompraField.getText());
                produto.comprar(quantidade);
                resultadoLabel.setText("Compra realizada no console. Estoque restante: " + produto.getQuantidadeEstoque());
            } catch (NumberFormatException e) {
                resultadoLabel.setText("Erro: Insira uma quantidade válida.");
            }
        } else {
            resultadoLabel.setText("Erro: Crie um produto primeiro.");
        }
    }
}