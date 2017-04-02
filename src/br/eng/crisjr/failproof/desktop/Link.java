package br.eng.crisjr.failproof.desktop;

import br.eng.crisjr.failproof.desktop.view.LinkView;
import br.eng.crisjr.failproof.desktop.controller.LinkController;
import br.eng.crisjr.failproof.desktop.controller.MainController;

public class Link {
    private LinkView view;
    private LinkController controller;
    private MainController parent;
    private String code;

    public Link(MainController parent, String code) {
        this.parent = parent;
        this.code = code;
        this.view = new LinkView();
        this.controller = new LinkController(parent, code);
        this.controller.setView(this.view);
        this.view.setVisible(true);
        // TODO Download checklist
        this.controller.getChecklistsDownloader().start();
    }
}
