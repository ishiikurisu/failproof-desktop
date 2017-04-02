package br.eng.crisjr.failproof.desktop.view;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import br.eng.crisjr.failproof.desktop.controller.SearchController;

public class SearchView extends JFrame implements WindowListener, MouseListener {
    private SearchController controller = null;
    private JLabel[] titles = new JLabel[] { new JLabel("Downloading...") };
    private String[] codes = null;
    private JPanel panelTitles = new JPanel();

    public SearchView() {
        // Building initial window
        panelTitles.setLayout(new GridLayout(0, 1));
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

    public void setTitles(String[] stuff) {
        int limit = stuff.length;
        JLabel[] titles = new JLabel[limit];
        for (int i = 0; i < limit; ++i) {
            titles[i] = new JLabel(stuff[i]);
        }
        setTitles(titles);
    }

    public void setTitles(JLabel[] labels) {
        panelTitles.removeAll();
        for (int i = 0; i < labels.length; ++i) {
            panelTitles.add(labels[i]);
        }
    }

    // TODO Add callback to each title label
    public void setTitles(String[] titles, String[] codes) {
        setTitles(titles);
        this.codes = codes;
    }


    /* WINDOW EVENTS */
    public void windowActivated(WindowEvent e) { }
    public void windowClosed(WindowEvent e) { }
    public void windowDeactivated(WindowEvent e) { }
    public void windowDeiconified(WindowEvent e) { }
    public void windowIconified(WindowEvent e) { }
    public void windowOpened(WindowEvent e) { }
    public void windowClosing(WindowEvent event) {
        controller.showParent();
    }

    /* MOUSE EVENTS */
    // TODO Make labels answer to mouse events
    public void mousePressed(MouseEvent e) { }
    public void mouseReleased(MouseEvent e) { }
    public void mouseEntered(MouseEvent e) { }
    public void mouseExited(MouseEvent e) { }
    public void mouseClicked(MouseEvent e) {
        System.out.println(e.getSource());
        System.out.println(e.getComponent());
    }
}
