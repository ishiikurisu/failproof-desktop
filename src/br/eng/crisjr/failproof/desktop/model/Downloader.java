package br.eng.crisjr.failproof.desktop.model;

import br.eng.crisjr.failproof.web;

public class Downloader implements Runnable {
    private DownloadBox box;
    private int operation = GET_LISTS;
    private String parameter = null;

    /* AVAILABLE OPERATIONS */
    public static final int GET_LISTS = 0;
    public static final int GET_LIST = 1;

    public Downloader(DownloadBox box, int operation) {
        this.box = box;
        this.operation = operation;
    }

    public String setParameter(String parameter) {
        this.parameter = parameter;
        return this.parameter;
    }

    public void run() {
        String[] stuff = null;
        switch (operation) {
            case GET_LISTS:
                stuff = web.getLists();
            break;
            case GET_LIST:
                stuff = new String[] { web.getList(parameter) };
            break;
        }
        box.receive(stuff);
    }
}
