module com.example.sistemaecomerceadidas {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.sistemaecomerceadidas to javafx.fxml;
    exports com.example.sistemaecomerceadidas;
    exports com.example.sistemaecomerceadidas.controller;
    opens com.example.sistemaecomerceadidas.controller to javafx.fxml;
}