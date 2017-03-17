package br.eng.crisjr.failproof.desktop.model;

import br.eng.crisjr.failproof.web;

public class Downloader implements Runnable {
    private DownloadBox box;
    private int operation = GET_LISTS;

    /* AVAILABLE OPERATIONS */
    public static final int GET_LISTS = 0;

    public Downloader(DownloadBox box, int operation) {
        this.box = box;
        this.operation = operation;
    }

    public void run() {
        String[] stuff = null;
        switch (operation) {
            case GET_LISTS:
                stuff = web.getLists();
            break;
        }
        box.receive(stuff);
    }
}
