package br.eng.crisjr.failproof.desktop;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML private StackPane stackTitles;

    public Controller() {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        stackTitles.getChildren().add(0, new Label("let's see"));
    }
}
