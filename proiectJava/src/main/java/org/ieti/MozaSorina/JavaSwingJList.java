package org.ieti.MozaSorina;

import javax.swing.*;
import java.awt.*;

public class JavaSwingJList {

	public static void main(String[] args) {
		JFrame frame  = new JFrame("List of recepies");
		DefaultListModel<String> l = new DefaultListModel<>();

		l.addElement("	1. Clatite");
		l.addElement("	2. Carne de vita");
		l.addElement("	3. Ice coffe");
		l.addElement("	4. Gogosi");
		l.addElement("	5. Ciorba radauteana");
		l.addElement("	6. Ciorba de perisoare");
		l.addElement("	7. Cuba libre");

		JList<String> jList = new JList<>(l);
		jList.setBounds(200,200,95,95);

		frame.add(jList);
		frame.setSize(600,400);
		//frame.setBackground(Color.ORANGE);
		frame.setVisible(true);
		frame.setLayout(null);
	}

}
