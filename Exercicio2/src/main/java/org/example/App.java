package org.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
        // Carregar o arquivo FXML da tela principal
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/org/example/main-view.fxml"));
        Scene scene = new Scene(loader.load(), 300, 400);

        // Configurar a cena
        primaryStage.setTitle("Menu Principal");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}