package br.eng.crisjr.failproof.desktop.controller;

import br.eng.crisjr.failproof.desktop.view.LinkView;
import br.eng.crisjr.failproof.desktop.model.DownloadBox;
import br.eng.crisjr.failproof.desktop.model.Downloader;
import br.eng.crisjr.failproof.desktop.controller.MainController;

public class LinkController implements DownloadBox {
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

    public void showParent() {
        // TODO Display the Search activity, not the
        parent.show();
    }

    public void receive(String[] stuff) {
        // TODO Implement download of checklist
        System.out.println(stuff[0]);
        // TODO Display checklist
    }

    public Thread getChecklistsDownloader() {
        Downloader downloader = new Downloader(this, Downloader.GET_LIST);
        downloader.setParameter(code);
        Thread thread = new Thread(downloader);
        return thread;
    }
}
