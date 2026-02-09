package com.example.sistemaecomerceadidas;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HelloAplication extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(
                HelloAplication.class.getResource("/fxml/mainLayout.fxml")
        );

        Scene scene = new Scene(loader.load(), 1200,800);
        stage.setTitle("Sistema de Menu Fixo");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }


}