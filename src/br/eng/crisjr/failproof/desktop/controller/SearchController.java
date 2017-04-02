package br.eng.crisjr.failproof.desktop.controller;

import java.awt.event.ComponentListener;
import br.eng.crisjr.failproof.desktop.model.DownloadBox;
import br.eng.crisjr.failproof.desktop.model.Downloader;
import br.eng.crisjr.failproof.desktop.view.SearchView;
import br.eng.crisjr.failproof.desktop.controller.MainController;
import br.eng.crisjr.failproof.desktop.Link;

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
        int limit = stuff.length;
        String[] newTitles = new String[limit];
        String[] codes = new String[limit];
        for (int i = 0; i < limit; ++i) {
            String it = stuff[i];
            newTitles[i] = it.split(":")[0];
            codes[i] = it.split(":")[1];
        }
        view.setTitles(newTitles, codes);
        view.show();
    }

    public Thread getChecklistsDownloader() {
        Downloader downloader = new Downloader(this, Downloader.GET_LISTS);
        Thread thread = new Thread(downloader);
        return thread;
    }

    /* OTHER ACTIVITIES */
    public void getChecklist(String code) {
        view.setVisible(false);
        new Link(parent, code);
    }
}
