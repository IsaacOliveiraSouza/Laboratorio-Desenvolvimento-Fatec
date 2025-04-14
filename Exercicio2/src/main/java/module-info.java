module org.example {
    requires javafx.controls;
    requires javafx.fxml;

    // Exporta o pacote principal
    exports org.example;

    // Abre o pacote controllers para o FXMLLoader
    opens org.example.controllers to javafx.fxml;
}