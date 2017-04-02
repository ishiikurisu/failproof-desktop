package br.eng.crisjr.failproof.desktop.view;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import br.eng.crisjr.failproof.desktop.controller.SearchController;

public class SearchView extends JFrame implements WindowListener {
    private SearchController controller = null;
    private String[] codes = null;
    private JPanel panelTitles = new JPanel();

    public SearchView() {
        // Building initial window
        panelTitles.setLayout(new GridLayout(0, 1));
        JLabel[] titles = new JLabel[] { new JLabel("Downloading...") };
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
        JButton[] titles = new JButton[limit];
        for (int i = 0; i < limit; ++i) {
            titles[i] = new JButton(stuff[i]);
            titles[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent event) {
                    System.out.println(paramString());
                }
            });
        }
        setTitles(titles);
    }

    public void setTitles(JComponent[] labels) {
        panelTitles.removeAll();
        for (int i = 0; i < labels.length; ++i) {
            panelTitles.add(labels[i]);
        }
    }

    // TODO Add callback to each title label
    public void setTitles(String[] titles, String[] codes) {
        int limit = titles.length;
        JButton[] buttons = new JButton[limit];
        for (int i = 0; i < limit; ++i) {
            String title = titles[i];
            String code = codes[i];
            buttons[i] = new JButton(title);
            buttons[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent event) {
                    // TODO Implement callback to these lists in the controller class
                    System.out.println(code);
                }
            });
        }
        setTitles(buttons);
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
}
