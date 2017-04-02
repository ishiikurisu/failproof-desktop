package br.eng.crisjr.failproof.desktop.view;

import javax.swing.*;
import br.eng.crisjr.failproof.desktop.controller.LinkController;

public class LinkView extends JFrame {
    private LinkController controller = null;

    public void setController(LinkController c) {
        if (controller == null) {
            controller = c;
            controller.setView(this);
        }
    }
}
