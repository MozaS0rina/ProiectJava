package org.ieti.MozaSorina;

import javax.swing.*;

public class JavaSwingJButton {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Recepie");
		JButton b = new JButton("Send");
		b.setBounds(50, 90, 90, 50);
		frame.add(b);
		frame.setSize(600, 400);
		frame.setLayout(null);
		frame.setVisible(true);
	}

}
