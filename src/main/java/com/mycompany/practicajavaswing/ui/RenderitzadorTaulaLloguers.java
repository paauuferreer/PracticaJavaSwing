package com.mycompany.practicajavaswing.ui;

import com.mycompany.practicajavaswing.model.Lloguer;
import com.mycompany.practicajavaswing.service.GestorDades;
import java.awt.Color;
import java.awt.Component;
import java.util.List;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

public class RenderitzadorTaulaLloguers extends DefaultTableCellRenderer {

    private final Color colorRetornat = new Color(212, 237, 218);
    private final Color colorForaTermini = new Color(248, 215, 218);
    private final Color colorDefecte = Color.WHITE;

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

        if (column == 0 || column == 3 || column == 4 || column == 5) {
            setHorizontalAlignment(SwingConstants.CENTER);
        } else {
            setHorizontalAlignment(SwingConstants.LEFT);
        }

        if (!isSelected) {
            List<Lloguer> llista = GestorDades.getInstance().getLloguersDescendents();
            if (row >= 0 && row < llista.size()) {
                Lloguer ll = llista.get(row);
                if (ll.isRetornat()) {
                    c.setBackground(colorRetornat);
                } else if (ll.isForaDeTermini()) {
                    c.setBackground(colorForaTermini);
                } else {
                    c.setBackground(colorDefecte);
                }
            } else {
                c.setBackground(colorDefecte);
            }
            c.setForeground(Color.BLACK);
        } else {
            c.setBackground(table.getSelectionBackground());
            c.setForeground(table.getSelectionForeground());
        }

        return c;
    }
}
