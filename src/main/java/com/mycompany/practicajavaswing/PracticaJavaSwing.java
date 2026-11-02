package com.mycompany.practicajavaswing;

import com.mycompany.practicajavaswing.ui.FinestraPrincipal;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class PracticaJavaSwing {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ignored) {
        }

        SwingUtilities.invokeLater(() -> {
            FinestraPrincipal finestra = new FinestraPrincipal();
            finestra.setVisible(true);
        });
    }
}
