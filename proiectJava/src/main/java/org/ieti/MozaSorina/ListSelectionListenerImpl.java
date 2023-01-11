package org.ieti.MozaSorina;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
/*
public class ListSelectionListenerImpl implements ListSelectionListener {

	private final JTable table;

	public ListSelectionListenerImpl(JTable table) {
		this.table = table;
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		int[] selectedRows = table.getSelectedRows();
		int[] selectedColumns = table.getSelectedColumns();
		StringBuilder value = new StringBuilder();
		for (int selectedRow : selectedRows) {
			for (int selectedColumn : selectedColumns) {
				value.append(table.getValueAt(selectedRow, selectedColumn));
			}
		}
		System.out.println("Table element selected is: " + value);
	}
}
*/

public class ListSelectionListenerImpl implements ListSelectionListener {

	private final CustomJTable table;

	public ListSelectionListenerImpl(CustomJTable table) {
		this.table = table;
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		int[] selectedRows = table.getSelectedRows();
		int[] selectedColumns = table.getSelectedColumns();
		StringBuilder value = new StringBuilder();
		for (int selectedRow : selectedRows) {
			for (int selectedColumn : selectedColumns) {
				value.append(table.getValueAt(selectedRow, selectedColumn));
			}
		}

		System.out.println("Elementul selectat din tabel este : " + value);
	}
}