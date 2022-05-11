module com.example.pruebas {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.pruebas to javafx.fxml;
    exports com.example.pruebas;
}