package com.appgrade;

import com.appgrade.models.GradeCC;
import com.appgrade.ui.GradeController;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Scene scene = new Scene(GradeController.create(new GradeCC()));
        stage.setScene(scene);
        stage.setTitle("Tela da Grade");
        stage.show();
    }
}