package org.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
        // Carregar o arquivo FXML
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/org/example/carro-view.fxml"));
        Scene scene = new Scene(loader.load(), 400, 300);

        // Configurar a cena
        primaryStage.setTitle("Cadastro de carros");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}