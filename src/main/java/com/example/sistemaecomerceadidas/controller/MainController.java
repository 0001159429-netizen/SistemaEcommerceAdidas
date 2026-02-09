package com.example.sistemaecomerceadidas.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;


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

    @FXML
    private void mostrarSobre() {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Sobre o Sistema");
        alert.setHeaderText("Sistema Constance");

        alert.setContentText(
                "Versão: 1.0\n" +
                        "Desenvolvido por: Leticia\n" +
                        "Ano: 2026"
        );

        alert.showAndWait();
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