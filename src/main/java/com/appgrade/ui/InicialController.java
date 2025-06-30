package com.appgrade.ui;

import com.appgrade.models.GradeCC;
import com.appgrade.models.GradeProd;
import com.appgrade.models.NovaGradeCC;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.input.MouseEvent;
import java.io.IOException;

public class InicialController extends VBox {

    public InicialController() {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/components/inicial.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);

        try {
            fxmlLoader.load();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    private Button bt1;

    @FXML
    private Button bt2;

    @FXML
    private Button bt3;


    @FXML
    private void clickBt1(){
        Stage stage = (Stage) this.getScene().getWindow();
        if(telacc != null)
            stage.setScene(telacc);
    }

    @FXML
    private void clickBt2(){
        Stage stage = (Stage) this.getScene().getWindow();
        if(telaprd != null)
            stage.setScene(telaprd);
    }

    @FXML
    private void clickBt3(){
        Stage stage = (Stage) this.getScene().getWindow();
        if(telanewcc != null)
            stage.setScene(telanewcc);
    }

    @FXML
    private void mudarCor(MouseEvent e){
        Button btn = (Button) e.getSource();
        ColorAdjust efeito = new ColorAdjust();
        efeito.setBrightness(-0.08); // escurece um pouco (mais negativo = mais escuro)
        btn.setEffect(efeito);
    }

    @FXML
    private void voltarCor(MouseEvent e){
        Button btn = (Button) e.getSource();
        btn.setEffect(null); // remove o efeito
    }

    private MainController cc;
    private MainController prd;
    private MainController newcc;

    private Scene telacc;
    private Scene telaprd;
    private Scene telanewcc;

    private void init(){
        cc = MainController.create(GradeController.create(new GradeCC()));
        prd = MainController.create(GradeController.create(new GradeProd()));
        newcc = MainController.create(GradeController.create(new NovaGradeCC()));

        telacc = new Scene(cc);
        telaprd = new Scene(prd);
        telanewcc = new Scene(newcc);
    }

    public void fixarCena(){
        Scene s = this.getScene();
        if(s != null){
            cc.setCenaFixa(s);
            prd.setCenaFixa(s);
            newcc.setCenaFixa(s);
        }
    }

    public static InicialController create(){
        InicialController tela = new InicialController();
        tela.init();
        return tela;
    }
}
