package org.ieti.MozaSorina;

import java.awt.EventQueue;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JFrame;

public class PuzzleJFrame extends JFrame {

    public PuzzleJFrame() {

        initUI();
    }

    private void initUI() {

        add(new Board());

        setResizable(false);
        pack();

        setTitle("Puzzle");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {
           JFrame ex = new PuzzleJFrame();
            ex.setVisible(true);
        });
    }
}
