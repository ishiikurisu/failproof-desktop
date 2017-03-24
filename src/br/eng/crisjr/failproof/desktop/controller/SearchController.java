package br.eng.crisjr.failproof.desktop.controller;

import br.eng.crisjr.failproof.desktop.model.DownloadBox;
import br.eng.crisjr.failproof.desktop.model.Downloader;
import br.eng.crisjr.failproof.desktop.view.SearchView;
import br.eng.crisjr.failproof.desktop.controller.MainController;

public class SearchController implements DownloadBox {
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

    /* INTERNET STUFF */
    public void receive(String[] stuff) {
        // TODO Implement this reception of checklists
        int limit = stuff.length;
        String[] newTitles = new String[limit];
        for (int i = 0; i < limit; ++i) {
            String it = stuff[i];
            newTitles[i] = it.split(":")[0];
        }
        view.setTitles(newTitles);
    }

    public Thread getChecklistsDownloader() {
        Downloader downloader = new Downloader(this, Downloader.GET_LISTS);
        Thread thread = new Thread(downloader);
        return thread;
    }
}
