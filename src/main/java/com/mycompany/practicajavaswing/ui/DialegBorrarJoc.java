package com.mycompany.practicajavaswing.ui;

import com.mycompany.practicajavaswing.model.Joc;
import com.mycompany.practicajavaswing.service.GestorDades;
import javax.swing.JOptionPane;

public class DialegBorrarJoc extends javax.swing.JDialog {

    private boolean esborrat;

    public DialegBorrarJoc(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        this.esborrat = false;
        initComponents();
        setTitle(GestorDades.getInstance().getMissatge("menu.joc.borrar"));
        carregarJocs();
        setLocationRelativeTo(parent);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelJoc = new javax.swing.JLabel();
        jComboBoxJocs = new javax.swing.JComboBox<>();
        jButtonEsborrar = new javax.swing.JButton();
        jButtonTancar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabelJoc.setText("Joc elegit:");

        jButtonEsborrar.setText("Borrar");
        jButtonEsborrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEsborrarActionPerformed(evt);
            }
        });

        jButtonTancar.setText("Tancar");
        jButtonTancar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTancarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelJoc)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxJocs, 0, 300, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonEsborrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonTancar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelJoc)
                    .addComponent(jComboBoxJocs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonEsborrar)
                    .addComponent(jButtonTancar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEsborrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEsborrarActionPerformed
        esborrar();
    }//GEN-LAST:event_jButtonEsborrarActionPerformed

    private void jButtonTancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTancarActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonTancarActionPerformed

    private void carregarJocs() {
        jComboBoxJocs.removeAllItems();
        for (Joc j : GestorDades.getInstance().getJocs()) {
            jComboBoxJocs.addItem(j);
        }
    }

    private void esborrar() {
        Joc seleccionat = (Joc) jComboBoxJocs.getSelectedItem();
        if (seleccionat == null) {
            return;
        }

        if (!GestorDades.getInstance().potEsborrarJoc(seleccionat)) {
            JOptionPane.showMessageDialog(this,
                    GestorDades.getInstance().getMissatge("msg.joc.amb.lloguers"),
                    GestorDades.getInstance().getMissatge("msg.error"),
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        int resp = JOptionPane.showConfirmDialog(this,
                GestorDades.getInstance().getMissatge("msg.confirmar.esborrar.joc"),
                GestorDades.getInstance().getMissatge("msg.confirmacio"),
                JOptionPane.YES_NO_OPTION);

        if (resp == JOptionPane.YES_OPTION) {
            GestorDades.getInstance().esborrarJoc(seleccionat);
            esborrat = true;
            JOptionPane.showMessageDialog(this,
                    GestorDades.getInstance().getMissatge("msg.exit"),
                    GestorDades.getInstance().getMissatge("msg.exit"),
                    JOptionPane.INFORMATION_MESSAGE);
            carregarJocs();
        }
    }

    public boolean isEsborrat() {
        return esborrat;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEsborrar;
    private javax.swing.JButton jButtonTancar;
    private javax.swing.JComboBox<Joc> jComboBoxJocs;
    private javax.swing.JLabel jLabelJoc;
    // End of variables declaration//GEN-END:variables
}
