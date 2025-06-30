package com.appgrade;

import com.appgrade.ui.InicialController;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage stage) throws Exception {
        InicialController telaInicial = InicialController.create();
        Scene scene = new Scene(telaInicial);
        telaInicial.fixarCena();

        stage.setScene(scene);
        stage.centerOnScreen();
        stage.setResizable(false);
        stage.show();
    }
}