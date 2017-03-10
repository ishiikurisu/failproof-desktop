package br.eng.crisjr.failproof.desktop.controller;

import br.eng.crisjr.failproof.desktop.model.MainModel;
import br.eng.crisjr.failproof.desktop.view.MainView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainController {
    protected MainModel model;
    protected MainView view;

    public MainController(MainModel model, MainView view) {
        // Setting MVC
        this.model = model;
        this.view = view;

        // Populating view with callbacks
        // TODO Add callbacks
        this.view.addDownloadListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                // TODO Implement download of lists
                view.setText("still nothing");
            }
        });
    }
}
