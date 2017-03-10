package br.eng.crisjr.failproof.desktop.view;

import java.awt.event.ActionListener;
import javax.swing.*;

public class MainView extends JFrame {
	private JTextField firstNumber = new JTextField(10);
	private JLabel additionLabel = new JLabel("+");
    private JButton calculateButton = new JButton("Calculate");
    private JButton buttonAdd = new JButton("Add");
    private JButton buttonDelete = new JButton("Delete");
    private JLabel labelStuff = new JLabel("nothing here");

	public MainView () {
		// Sets up the view and adds the components
		JPanel panelButtons = new JPanel();
        panelButtons.add(buttonAdd);
        panelButtons.add(buttonDelete);
        panelButtons.add(labelStuff);

        // Setting frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 400);
		this.add(panelButtons);
	}

    public void addDownloadListener(ActionListener listener) {
        // TODO Add calculate button callback
        buttonAdd.addActionListener(listener);
    }

    public void setText(String text) {
        labelStuff.setText(text);
    }
}
