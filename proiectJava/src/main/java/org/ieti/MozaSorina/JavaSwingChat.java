package org.ieti.MozaSorina;

import javax.swing.*;
import java.awt.*;

public class JavaSwingChat {

	public static void main(String[] args) {

		JFrame frame = new JFrame("Chat Frame");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600, 400);

		JMenuBar menuBar = new JMenuBar();
		JMenu fileMenu = new JMenu("File");
		JMenu viewMenu = new JMenu("View recepies");
		JMenu editMenu = new JMenu("Edit recepies");
		JMenu toolsMenu = new JMenu("Tools for recepies");
		JMenu helpMenu = new JMenu("Help");
		menuBar.add(fileMenu);
		menuBar.add(viewMenu);
		menuBar.add(editMenu);
		menuBar.add(toolsMenu);
		menuBar.add(helpMenu);


		JMenuItem openOption = new JMenuItem("Open");
		JMenuItem saveOption = new JMenuItem("Save recepie as");
		fileMenu.add(openOption);
		fileMenu.add(saveOption);

		JMenuItem Option1 = new JMenuItem("Clatite");
		JMenuItem Option2 = new JMenuItem("Carne de vita");
		JMenuItem Option3 = new JMenuItem("Ice coffe");
		JMenuItem Option4 = new JMenuItem("Gogosi");
		JMenuItem Option5 = new JMenuItem("Ciorba radauteana");
		JMenuItem Option6 = new JMenuItem("Ciorba de perisoare");
		JMenuItem Option7 = new JMenuItem("Cuba libre");

		fileMenu.add(openOption);
		fileMenu.add(saveOption);
		viewMenu.add(Option1);
		viewMenu.add(Option2);
		viewMenu.add(Option3);
		viewMenu.add(Option4);
		viewMenu.add(Option5);
		viewMenu.add(Option6);
		viewMenu.add(Option7);

		JMenuItem toolOption1 = new JMenuItem("Type");
		JMenuItem toolOption2 = new JMenuItem("Time");
		JMenuItem toolOption3 = new JMenuItem("Vegetarian");


		toolsMenu.add(toolOption1);
		toolsMenu.add(toolOption2);
		toolsMenu.add(toolOption3);


		JPanel panel = new JPanel(); // the panel is not visible in output
		JLabel label = new JLabel("Send a recepie: ");
		JTextField tf = new JTextField(10); // accepts upto 10 characters
		JButton send = new JButton("Send");
		JButton reset = new JButton("Reset");
		panel.add(label); // Components Added using Flow Layout
		panel.add(label); // Components Added using Flow Layout
		panel.add(tf);
		panel.add(send);
		panel.add(reset);
		JTextArea ta = new JTextArea();

		frame.setJMenuBar(menuBar);
		frame.getContentPane().add(BorderLayout.SOUTH, panel);
		frame.getContentPane().add(BorderLayout.NORTH, tf);
		frame.getContentPane().add(BorderLayout.CENTER, ta);
		frame.setVisible(true);

	}

}
