module org.example.mejora_cronometro {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.mejora_cronometro to javafx.fxml;
    exports org.example.mejora_cronometro;
}