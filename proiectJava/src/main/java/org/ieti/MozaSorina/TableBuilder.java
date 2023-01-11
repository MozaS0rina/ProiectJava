package org.ieti.MozaSorina;
import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class TableBuilder {

    public void buildTable(String[][] content, String[] headers) {
        JFrame container = new JFrame("Tabelul retetelor");
        container.setDefaultCloseOperation(EXIT_ON_CLOSE);
        //container.setBackground(Color.ORANGE);
        container.setVisible(true);


        CustomJTable table = new CustomJTable(content, headers);

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
        container.setSize(800, 500);

    }

}