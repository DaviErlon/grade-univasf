package com.appgrade.ui;

import com.appgrade.utils.Click;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.event.ActionEvent;

import java.io.IOException;

public class CadeiraController extends StackPane {

    @FXML
    private Button cadeira;

    private Click onCadeiraClicked;
    private int id;
    private boolean podeSerCursado;
    private boolean clicado;

    public CadeiraController() {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/components/cadeira.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);

        try {
            fxmlLoader.load();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void init(int id, String nome, Click onCadeiraClicked, boolean podeSerCursadoInicial) {
        this.id = id;
        this.cadeira.setText(nome);
        this.onCadeiraClicked = onCadeiraClicked;
        this.clicado = false;
        this.setPodeCursar(podeSerCursadoInicial);
        atualizarEstilo();
    }

    public static CadeiraController create(int id, String nome, Click onCadeiraClicked, boolean podeSerCursadoInicial) {
        CadeiraController c = new CadeiraController();
        c.init(id, nome, onCadeiraClicked, podeSerCursadoInicial);
        return c;
    }

    // O evento de clique agora apenas notifica o controlador pai.
    @FXML
    private void eventClick(ActionEvent event) {
        if (this.onCadeiraClicked != null) {
            this.onCadeiraClicked.run(this.id);
        }
    }

    // --- MÉTODOS PÚBLICOS PARA GERENCIAR O ESTADO ---

    public void selecionar() {
        if (!this.clicado) {
            this.clicado = true;
            atualizarEstilo();
        }
    }

    public void desmarcar() {
        if (this.clicado) {
            this.clicado = false;
            atualizarEstilo();
        }
    }

    public void setPodeCursar(boolean pode) {
        if (this.podeSerCursado != pode) {
            this.podeSerCursado = pode;
            atualizarEstilo();
        }
    }

    // --- GETTERS PARA O ESTADO PRIVADO ---

    public boolean isClicado() {
        return this.clicado;
    }

    public int getKey() {
        return this.id;
    }

    public void fire(){
        this.cadeira.fire();
    }

    /**
     * Centraliza toda a lógica de mudança de estilo baseada no estado atual do componente.
     * Este método é privado, pois é um detalhe de implementação.
     */
    private void atualizarEstilo() {
        // Estilo base que será mantido em todos os estados, vindo do seu FXML.
        final String baseStyle = "-fx-background-radius: 8; ";

        String styleCompleto;

        if (clicado) {
            // Estado 1: SELECIONADO (Azul)
            styleCompleto = baseStyle + "-fx-background-color: #4682B4; -fx-text-fill: white;";
        } else {
            if (podeSerCursado) {
                // Estado 2: PODE SER CURSADO (Cinza)
                styleCompleto = baseStyle + "-fx-background-color: #B0C4DE; -fx-text-fill: black;";
            } else {
                // Estado 3: NORMAL / NÃO DISPONÍVEL (Cinza quase branco, do FXML)
                styleCompleto = baseStyle + "-fx-background-color: #DCDCDC; -fx-text-fill: black;";
            }
        }

        this.cadeira.setStyle(styleCompleto);
    }
}
