package br.eng.crisjr.failproof.desktop.controller;

import br.eng.crisjr.failproof.desktop.view.SearchView;
import br.eng.crisjr.failproof.desktop.controller.MainController;

public class SearchController {
    private SearchView view = null;
    private String[] titles = null;
    private String[] addresses = null;
    private MainController parent = null;

    public SearchController(MainController parent) {
        this.parent = parent;
    }

    public void setView(SearchView view) {
        if (this.view == null) {
            this.view = view;
            this.view.setController(this);
        }
    }

    public void showParent() {
        parent.show();
    }
}
