package br.eng.crisjr.failproof.desktop;

import br.eng.crisjr.failproof.desktop.view.SearchView;
import br.eng.crisjr.failproof.desktop.controller.SearchController;
import br.eng.crisjr.failproof.desktop.controller.MainController;

public class Search {
    private SearchView view;
    private SearchController controller;

    public Search(MainController mainController) {
        view = new SearchView();
        controller = new SearchController(mainController);
        controller.setView(view);
        view.setVisible(true);
        controller.getChecklistsDownloader().start();
    }
}
