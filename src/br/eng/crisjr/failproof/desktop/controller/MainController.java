package br.eng.crisjr.failproof.desktop.controller;

import br.eng.crisjr.failproof.desktop.model.MainModel;
import br.eng.crisjr.failproof.desktop.view.MainView;
import br.eng.crisjr.failproof.desktop.Search;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainController {
    protected MainModel model;
    protected MainView view;
    protected MainController controller;

    public MainController(MainModel model, MainView view) {
        // Setting MVC
        this.model = model;
        this.view = view;
        this.controller = this;

        // Populating view with callbacks
        // TODO Add callbacks
        this.view.addDownloadListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                // TODO Implement download of lists
                view.setVisible(false);
                new Search(controller);
            }
        });
    }

    public void show() {
        this.view.setVisible(true);
    }
}
