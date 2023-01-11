package org.ieti.MozaSorina;

import javax.swing.*;

public class JavaSwingJScrollBar {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Scroll");
		JScrollBar b = new JScrollBar();
		b.setBounds(10,200,20,200);
		frame.add(b);
		frame.setSize(600,400);
		frame.setLayout(null);
		frame.setVisible(true);
	}

}
