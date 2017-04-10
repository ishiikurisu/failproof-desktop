package br.eng.crisjr.failproof.desktop.view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import br.eng.crisjr.failproof.desktop.controller.LinkController;

public class LinkView extends JFrame implements WindowListener {
    private LinkController controller = null;
    private JLabel labelTitle = null;
    private JPanel panelItems = null;
    private JButton buttonAdd = null;
    private JButton buttonCancel = null;

    public LinkView() {
        // Preparing checklist
        JPanel panelChecklist = new JPanel();
        JPanel panelItems = new JPanel();
        JLabel labelWait = new JLabel("Please wait");
        GridLayout layoutChecklist = new GridLayout(2, 1);
        labelTitle = new JLabel("Downloading...");
        panelItems.add(labelWait);
        panelChecklist.add(labelTitle);
        panelChecklist.add(panelItems);
        panelChecklist.setLayout(layoutChecklist);

        // Preparing buttons
        JPanel panelOptions = new JPanel();
        buttonAdd = new JButton("Add");
        buttonCancel = new JButton("Cancel");
        panelOptions.add(buttonAdd);
        panelOptions.add(buttonCancel);

        // Preparing environment
        JPanel panelMain = new JPanel();
        GridLayout layoutMain = new GridLayout(2, 1);
        panelMain.setLayout(layoutMain);
        panelMain.add(panelChecklist);
        panelMain.add(panelOptions);

        // Finally
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(600, 400);
        this.addWindowListener(this);
		this.add(panelMain);
    }

    // TODO Add callbacks for save and cancel buttons
    public void addSaveButtonCallback(ActionListener listener) {
        buttonAdd.addActionListener(listener);
    }

    public void addCancelButtonCallback(ActionListener listener) {
        buttonCancel.addActionListener(listener);
    }

    // TODO Enable update of checklist contents

    public void setController(LinkController c) {
        if (controller == null) {
            controller = c;
            controller.setView(this);
        }
    }

    public void setTitle(String title) {
        labelTitle.setText(title);
    }

    /* #####################
       # WINDOW OPERATIONS #
       ##################### */
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
