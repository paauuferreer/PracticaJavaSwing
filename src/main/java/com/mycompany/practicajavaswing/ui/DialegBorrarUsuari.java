package com.mycompany.practicajavaswing.ui;

import com.mycompany.practicajavaswing.model.Usuari;
import com.mycompany.practicajavaswing.service.GestorDades;
import javax.swing.JOptionPane;

public class DialegBorrarUsuari extends javax.swing.JDialog {

    private boolean esborrat;

    public DialegBorrarUsuari(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        this.esborrat = false;
        initComponents();
        setTitle(GestorDades.getInstance().getMissatge("menu.usuari.borrar"));
        carregarUsuaris();
        setLocationRelativeTo(parent);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelUsuari = new javax.swing.JLabel();
        jComboBoxUsuaris = new javax.swing.JComboBox<>();
        jButtonEsborrar = new javax.swing.JButton();
        jButtonTancar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabelUsuari.setText("Usuari:");

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
                        .addComponent(jLabelUsuari)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxUsuaris, 0, 300, Short.MAX_VALUE))
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
                    .addComponent(jLabelUsuari)
                    .addComponent(jComboBoxUsuaris, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void carregarUsuaris() {
        jComboBoxUsuaris.removeAllItems();
        for (Usuari u : GestorDades.getInstance().getUsuaris()) {
            jComboBoxUsuaris.addItem(u);
        }
    }

    private void esborrar() {
        Usuari seleccionat = (Usuari) jComboBoxUsuaris.getSelectedItem();
        if (seleccionat == null) {
            return;
        }

        if (!GestorDades.getInstance().potEsborrarUsuari(seleccionat)) {
            JOptionPane.showMessageDialog(this,
                    GestorDades.getInstance().getMissatge("msg.usuari.amb.lloguers"),
                    GestorDades.getInstance().getMissatge("msg.error"),
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        int resp = JOptionPane.showConfirmDialog(this,
                GestorDades.getInstance().getMissatge("msg.confirmar.esborrar.usuari"),
                GestorDades.getInstance().getMissatge("msg.confirmacio"),
                JOptionPane.YES_NO_OPTION);

        if (resp == JOptionPane.YES_OPTION) {
            GestorDades.getInstance().esborrarUsuari(seleccionat);
            esborrat = true;
            JOptionPane.showMessageDialog(this,
                    GestorDades.getInstance().getMissatge("msg.exit"),
                    GestorDades.getInstance().getMissatge("msg.exit"),
                    JOptionPane.INFORMATION_MESSAGE);
            carregarUsuaris();
        }
    }

    public boolean isEsborrat() {
        return esborrat;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEsborrar;
    private javax.swing.JButton jButtonTancar;
    private javax.swing.JComboBox<Usuari> jComboBoxUsuaris;
    private javax.swing.JLabel jLabelUsuari;
    // End of variables declaration//GEN-END:variables
}
