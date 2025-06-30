package com.appgrade.ui;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class MainController extends VBox {

    private GradeController base;

    private Scene inicial;

    @FXML
    private ProgressBar barra;

    @FXML
    private Label percNumero;

    @FXML
    private void resetClick(){
        if(base != null)
            base.reset();
    }

    @FXML
    private void returnClick(){
        Stage stage = (Stage) this.getScene().getWindow();
        if(inicial != null)
            stage.setScene(inicial);
    }

    public MainController(){
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/components/main.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);

        this.base = null;
        this.inicial = null;

        try {
            fxmlLoader.load();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void init(GradeController c){
        c.setClickBarra(d -> {
            barra.setProgress(d);
            percNumero.setText((int) (d*100) + "%");
        });
        getChildren().add(c);
        this.base = c;
    }

    public static MainController create(GradeController c){
        MainController m = new MainController();
        m.init(c);
        return m;
    }

    public void setCenaFixa(Scene s){
        this.inicial = s;
    }
}
