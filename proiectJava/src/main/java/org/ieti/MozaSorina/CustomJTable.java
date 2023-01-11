package org.ieti.MozaSorina;

import javax.swing.*;
import javax.swing.table.TableCellRenderer;
import java.awt.*;

public class CustomJTable extends JTable {
    @Override
    public Component prepareRenderer(TableCellRenderer renderer, int row, int column) {
        Component component= super.prepareRenderer(renderer, row, column);
        if(row==0 )
        {
            component.setBackground(Color.PINK);
        }

        return component;
    }

    public CustomJTable(Object[][] rowData, Object[] columnNames) {
        super(rowData, columnNames);
    }
}
