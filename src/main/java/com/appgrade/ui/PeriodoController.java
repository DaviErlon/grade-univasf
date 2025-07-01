package com.appgrade.ui;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.event.ActionEvent;

import java.io.IOException;

public class PeriodoController extends VBox {

    @FXML
    private Button buttonTop;

    public PeriodoController() {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/components/periodo.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);

        try {
            fxmlLoader.load();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void init(int periodo) {
        this.buttonTop.setText(periodo + "° Período");
    }

    public static PeriodoController create(int periodo) {
        PeriodoController p = new PeriodoController();
        p.init(periodo);
        return p;
    }

    private boolean getEqualsState(){
        boolean estadoInicial = false;
        boolean primeiro = true;

        for(Node node : this.getChildren()){
            if (node instanceof CadeiraController c){
                if(primeiro){

                    estadoInicial = c.isClicado();
                    primeiro = false;
                } else {

                    if(estadoInicial != c.isClicado()){
                        return false;
                    }
                }
            }
        }
        return true;
    }

    @FXML
    private void eventClickButtonTop(ActionEvent event) {
        boolean todosIguais = getEqualsState();

        for (Node node : this.getChildren()) {
            if (node instanceof CadeiraController c) {
                if (todosIguais) {
                    // Se todos estão no mesmo estado, inverte todos
                    c.fire();
                } else {
                    // Se estão em estados mistos, seleciona apenas os não selecionados
                    if (!c.isClicado()) { // Usa o getter
                        c.fire();
                    }
                }
            }
        }
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
}
