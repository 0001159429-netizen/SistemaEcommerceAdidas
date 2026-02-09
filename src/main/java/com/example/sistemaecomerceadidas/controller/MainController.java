package com.example.sistemaecomerceadidas.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;

public class MainController {

    @FXML
    private BorderPane root;

    @FXML
    public void initialize() {
        carregarTela("Home.fxml");
    }

    @FXML
    public void abrirTela(ActionEvent event) {
        MenuItem item = (MenuItem) event.getSource();
        String fxml = item.getUserData().toString();
        carregarTela(fxml);
    }

    private void carregarTela(String fxml) {
        try {
            root.setCenter(
                    FXMLLoader.load(
                            getClass().getResource("/fxml/" + fxml)
                    )
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}