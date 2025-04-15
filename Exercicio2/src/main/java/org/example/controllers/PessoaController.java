package org.example.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.example.Pessoa;

public class PessoaController {
    @FXML
    private TextField nomeField;

    @FXML
    private TextField idadeField;

    @FXML
    private TextField profissaoField;

    @FXML
    private Button criarButton;

    @FXML
    private Label resultadoLabel;

    private Pessoa pessoa;

    @FXML // <--- Adicione esta anotação aqui
    protected void criarPessoa() {
        try {
            // Obter os valores dos campos
            String nome = nomeField.getText();
            int idade = Integer.parseInt(idadeField.getText());
            String profissao = profissaoField.getText();

            // Criar uma nova pessoa
            pessoa = new Pessoa(nome, idade, profissao);

            // Exibir mensagem de sucesso
            resultadoLabel.setText("Pessoa criada: " + pessoa.getNome() + ", " + pessoa.getIdade() + " anos, " + pessoa.getProfissao());
        } catch (NumberFormatException e) {
            resultadoLabel.setText("Erro: Insira uma idade válida.");
        }
    }

    @FXML
    protected void apresentarPessoa() {
        if (pessoa != null) {
            pessoa.apresentar();
            resultadoLabel.setText("A apresentação foi exibida no console.");
        } else {
            resultadoLabel.setText("Erro: Crie uma pessoa primeiro.");
        }
    }
}