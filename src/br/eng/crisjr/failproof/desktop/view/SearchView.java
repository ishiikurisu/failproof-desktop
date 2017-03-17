package br.eng.crisjr.failproof.desktop.view;

import javax.swing.*;
import java.awt.event.*;
import br.eng.crisjr.failproof.desktop.controller.SearchController;

public class SearchView extends JFrame implements WindowListener {
    private SearchController controller = null;
    private JLabel[] titles = new JLabel[] { new JLabel("Downloading...") };
    private JPanel panelTitles = new JPanel();

    public SearchView() {
        // Building initial window
        setTitles(titles);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.addWindowListener(this);
        this.setSize(600, 400);
		this.add(panelTitles);
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

    public void setTitles(String[] stuff) {
        int limit = stuff.length;
        titles = new JLabel[limit];
        for (int i = 0; i < limit; ++i) {
            titles[i] = new JLabel(stuff[i]);
        }
    }

    public void setTitles(JLabel[] labels) {
        panelTitles.removeAll();
        for (int i = 0; i < labels.length; ++i) {
            panelTitles.add(labels[i]);
        }
    }

    /* WINDOW EVENTS */
    public void windowActivated(WindowEvent e) { }
    public void windowClosed(WindowEvent e) { }
    public void windowDeactivated(WindowEvent e) { }
    public void windowDeiconified(WindowEvent e) { }
    public void windowIconified(WindowEvent e) { }
    public void windowOpened(WindowEvent e) { }
}
