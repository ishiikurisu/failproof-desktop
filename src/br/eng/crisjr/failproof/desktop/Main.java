package br.eng.crisjr.failproof.desktop;

import br.eng.crisjr.failproof.desktop.model.*;
import br.eng.crisjr.failproof.desktop.view.*;
import br.eng.crisjr.failproof.desktop.controller.*;

public class Main {
    public static void main(String[] args) {
        MainModel model = new MainModel();
        MainView view = new MainView();
        MainController controller = new MainController(model, view);
        view.setVisible(true);
    }
}
