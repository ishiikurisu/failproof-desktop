package br.eng.crisjr.failproof.desktop.view;

import javax.swing.*;
import java.awt.event.WindowEvent;
import java.awt.event.ActionListener;
import br.eng.crisjr.failproof.desktop.controller.SearchController;

public class SearchView extends JFrame {
    private SearchController controller = null;
    private JLabel[] titles = new JLabel[] { new JLabel("Downloading...") };

    public SearchView() {
        // Building initial window
        JPanel grid = new JPanel();
        for (int i = 0; i < titles.length; i++) {
            grid.add(titles[i]);
        }
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 400);
		this.add(grid);
        this.add(grid);
    }

    public void setController(SearchController controller) {
        if (this.controller == null) {
            this.controller = controller;
            this.controller.setView(this);
        }
    }

    public void windowClosing(WindowEvent event) {
        controller.showParent();
    }
}
