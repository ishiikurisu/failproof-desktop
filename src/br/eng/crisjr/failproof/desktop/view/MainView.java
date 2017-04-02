package br.eng.crisjr.failproof.desktop.view;

import java.awt.event.ActionListener;
import java.awt.GridLayout;
import javax.swing.*;

public class MainView extends JFrame {
	private JTextField firstNumber = new JTextField(10);
    private JButton buttonAdd = new JButton("Add");
    private JButton buttonDelete = new JButton("Delete");
    private JLabel labelStuff = new JLabel("nothing here");
	private JPanel panelChecklists = new JPanel();

	public MainView () {
		// TODO Adapt this to use a GridLayout
		JPanel panelButtons = new JPanel();
		GridLayout layoutButtons = new GridLayout(1, 2);
		panelButtons.setLayout(layoutButtons);
        panelButtons.add(buttonAdd);
        panelButtons.add(buttonDelete);

		// Creating checklist grid
		panelChecklists = new JPanel();
		GridLayout layoutChecklists = new GridLayout(0, 1);
		panelChecklists.setLayout(layoutChecklists);
        panelChecklists.add(labelStuff);

		// Adding children panels to main panel
		GridLayout mainLayout = new GridLayout(2, 1);
		JPanel panelMain = new JPanel();
		panelMain.setLayout(mainLayout);
		panelMain.add(panelButtons);
		panelMain.add(panelChecklists);

        // Setting frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 400);
		this.add(panelMain);
	}

    public void addDownloadListener(ActionListener listener) {
        // TODO Add + button callback
        buttonAdd.addActionListener(listener);
    }

    public void setText(String text) {
        labelStuff.setText(text);
    }
}
