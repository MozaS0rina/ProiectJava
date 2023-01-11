package org.ieti.MozaSorina;
import javax.swing.*;
import java.awt.*;

public class Table {

    private static final String[] COLUMN_NAMES = {"Reteta",
            "Tip",
            "Timp de preparare",
            "Portii",
            "Vegetarian"};

    private static final Object[][] RETETE = {
            {"Clatite", "Desert", "30 minute",4, true},
            {"Carne de vita ", "Carne", "2 ore", 2, false},
            {"Ice coffee", "Bautura non-alcoolica", "5 minute", 2, true},
            {"Gogosi", "Desert", "40 minute", 10, true},
            {"Ciorba radauteana", "Ciorba", "1 ora 30 minute", 6, false},
            {"Ciorba de perisoare", "Ciorba", "2 ore 30 minute", 6, false},
            {"Cuba libre", "Bautura alcoolica", "5 minute", 2, true}
    };

    public static void main(String[] args) {

        JFrame container = new JFrame("Tabel cu preparate");
        CustomJTable table = new CustomJTable(RETETE, COLUMN_NAMES);
        table.setCellSelectionEnabled(true);

        ListSelectionListenerImpl listSelectionListener = new ListSelectionListenerImpl(table);

        ListSelectionModel select = table.getSelectionModel();
        select.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        select.addListSelectionListener(listSelectionListener);

        JScrollPane scrollPane = new JScrollPane(table);

        container.add(scrollPane);
        container.setLayout(new BorderLayout());
        container.add(table.getTableHeader(), BorderLayout.PAGE_START);
        container.add(table, BorderLayout.CENTER);
        container.setVisible(true);
        container.setSize(300, 400);
    }

}
