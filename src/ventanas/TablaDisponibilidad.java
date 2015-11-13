package ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class TablaDisponibilidad extends JPanel{

    public static void main(String[] args) {
        JFrame frame = new JFrame("Testing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.setMaximumSize(new java.awt.Dimension(400,400));
        frame.setMinimumSize(new java.awt.Dimension(400,400));
        frame.add(new TablaDisponibilidad());
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public TablaDisponibilidad() {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                DefaultTableModel model = new DefaultTableModel(){
                    @Override
                    public boolean isCellEditable(int row, int column){
                        return false;
                    }
                };
                
                model.addColumn("Lugar");
                model.addColumn("Cant. ocupada");
                
                for (int row = 0; row < 10; row++) {
                    Vector<String> rowData = new Vector<>(2);
                    for (int col = 0; col < 2; col++) {
                        rowData.add(row + "x" + col);
                    }
                    model.addRow(rowData);
                }
                
                JTable table = new JTable(model);
                DeleteRowFromTableAction deleteAction = new DeleteRowFromTableAction(table, model);
                
                table.setMaximumSize(new java.awt.Dimension(200,200));
                table.setPreferredSize(new java.awt.Dimension(200,200));
                table.getColumnModel().getColumn(0).setPreferredWidth(100);
                table.getColumnModel().getColumn(0).setMaxWidth(100);
                table.getColumnModel().getColumn(1).setPreferredWidth(100);
                table.getColumnModel().getColumn(1).setMaxWidth(100);
                /*table.getTableHeader().setResizingAllowed(false);
                table.getTableHeader().setReorderingAllowed(false);*/
                table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

                JToolBar tb = new JToolBar();
                tb.add(deleteAction);
                tb.setFloatable(false);
                tb.setMaximumSize(new java.awt.Dimension(200,200));

                InputMap im = table.getInputMap(JTable.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
                ActionMap am = table.getActionMap();
                im.put(KeyStroke.getKeyStroke(KeyEvent.VK_DELETE, 0), "deleteRow");
                am.put("deleteRow", deleteAction);
                
/*
                JFrame frame = new JFrame("Testing");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setLayout(new BorderLayout());
                frame.add(tb, BorderLayout.NORTH);
                frame.add(new JScrollPane(table));
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);*/
                
                add(tb, BorderLayout.NORTH);
                add(new JScrollPane(table));
                setMinimumSize(new java.awt.Dimension(290,260));
                setPreferredSize(new java.awt.Dimension(290,260));
                setVisible(true);
            }
        });
    }

    public abstract class AbstractTableAction<T extends JTable, M extends TableModel> extends AbstractAction {

        private T table;
        private M model;

        public AbstractTableAction(T table, M model) {
            this.table = table;
            this.model = model;
        }

        public T getTable() {
            return table;
        }

        public M getModel() {
            return model;
        }

    }

    public class DeleteRowFromTableAction extends AbstractTableAction<JTable, DefaultTableModel> {

        public DeleteRowFromTableAction(JTable table, DefaultTableModel model) {
            super(table, model);
            putValue(NAME, "Eliminar filas");
            putValue(SHORT_DESCRIPTION, "Eliminar filas");
            table.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
                @Override
                public void valueChanged(ListSelectionEvent e) {
                    setEnabled(getTable().getSelectedRowCount() > 0);
                }
            });
            setEnabled(getTable().getSelectedRowCount() > 0);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("...");
            JTable table = getTable();
            if (table.getSelectedRowCount() > 0) {
                List<Vector> selectedRows = new ArrayList<>(25);
                DefaultTableModel model = getModel();
                Vector rowData = model.getDataVector();
                for (int row : table.getSelectedRows()) {
                    int modelRow = table.convertRowIndexToModel(row);
                    Vector rowValue = (Vector) rowData.get(modelRow);
                    selectedRows.add(rowValue);
                }

                for (Vector rowValue : selectedRows) {
                    int rowIndex = rowData.indexOf(rowValue);
                    model.removeRow(rowIndex);
                }
            }
        }

    }

}
