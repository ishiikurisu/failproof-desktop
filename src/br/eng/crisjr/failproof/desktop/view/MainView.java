package br.eng.crisjr.failproof.desktop.view;

import java.awt.event.ActionListener;
import javax.swing.*;

public class MainView extends JFrame {
	private JTextField firstNumber = new JTextField(10);
	private JLabel additionLabel = new JLabel("+");
    private JButton calculateButton = new JButton("Calculate");

	public MainView () {
		// Sets up the view and adds the components
		JPanel calcPanel = new JPanel();
		calcPanel.add(firstNumber);
		calcPanel.add(additionLabel);
        calcPanel.add(calculateButton);

        // Setting frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 200);
		this.add(calcPanel);
	}

    public void addCalculateListener(ActionListener listener) {
        // TODO Add calculate button callback
    }
}
