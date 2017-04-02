package br.eng.crisjr.failproof.desktop.controller;

import br.eng.crisjr.failproof.desktop.view.LinkView;
import br.eng.crisjr.failproof.desktop.controller.MainController;

public class LinkController {
    private LinkView view;
    private MainController parent;
    private String code;

    public LinkController(MainController parent, String code) {
        this.parent = parent;
        this.code = code;
    }

    public void setView(LinkView v) {
        view = v;
        view.setController(this);
    }
}
