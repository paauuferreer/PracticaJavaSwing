package com.mycompany.practicajavaswing.ui;

import com.mycompany.practicajavaswing.model.Joc;
import com.mycompany.practicajavaswing.model.Plataforma;
import com.mycompany.practicajavaswing.service.GestorDades;
import com.mycompany.practicajavaswing.validation.ValidationAPI;
import javax.swing.JOptionPane;

public class DialegJocs extends javax.swing.JDialog {

    private boolean creat;

    public DialegJocs(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        this.creat = false;
        initComponents();
    }

    public boolean isCreat() {
        return creat;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelNom = new javax.swing.JLabel();
        jTextFieldNom = new javax.swing.JTextField();
        jLabelGenere = new javax.swing.JLabel();
        jComboBoxGenere = new javax.swing.JComboBox<>();
        jPanelPlataformes = new javax.swing.JPanel();
        jCheckBoxPS5 = new javax.swing.JCheckBox();
        jLabelUnitatsPS5 = new javax.swing.JLabel();
        jSpinnerPS5 = new javax.swing.JSpinner();
        jCheckBoxXbox = new javax.swing.JCheckBox();
        jLabelUnitatsXbox = new javax.swing.JLabel();
        jSpinnerXbox = new javax.swing.JSpinner();
        jCheckBoxPC = new javax.swing.JCheckBox();
        jLabelUnitatsPC = new javax.swing.JLabel();
        jSpinnerPC = new javax.swing.JSpinner();
        jCheckBoxSwitch2 = new javax.swing.JCheckBox();
        jLabelUnitatsSwitch2 = new javax.swing.JLabel();
        jSpinnerSwitch2 = new javax.swing.JSpinner();
        jButtonConfirmar = new javax.swing.JButton();
        jButtonCancellar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Crear joc");
        setModal(true);
        setResizable(false);

        jLabelNom.setText("Nom *:");

        jLabelGenere.setText("Gènere *:");

        jComboBoxGenere.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Acció", "Aventura", "Esports", "RPG", "Estratègia", "Simulació" }));

        jPanelPlataformes.setBorder(javax.swing.BorderFactory.createTitledBorder("Plataformes disponibles"));

        jCheckBoxPS5.setText("PS5");
        jCheckBoxPS5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxPS5ActionPerformed(evt);
            }
        });

        jLabelUnitatsPS5.setText("Unitats:");

        jSpinnerPS5.setModel(new javax.swing.SpinnerNumberModel(0, 0, 99, 1));
        jSpinnerPS5.setEnabled(false);

        jCheckBoxXbox.setText("Xbox");
        jCheckBoxXbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxXboxActionPerformed(evt);
            }
        });

        jLabelUnitatsXbox.setText("Unitats:");

        jSpinnerXbox.setModel(new javax.swing.SpinnerNumberModel(0, 0, 99, 1));
        jSpinnerXbox.setEnabled(false);

        jCheckBoxPC.setText("PC");
        jCheckBoxPC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxPCActionPerformed(evt);
            }
        });

        jLabelUnitatsPC.setText("Unitats:");

        jSpinnerPC.setModel(new javax.swing.SpinnerNumberModel(0, 0, 99, 1));
        jSpinnerPC.setEnabled(false);

        jCheckBoxSwitch2.setText("Switch 2");
        jCheckBoxSwitch2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxSwitch2ActionPerformed(evt);
            }
        });

        jLabelUnitatsSwitch2.setText("Unitats:");

        jSpinnerSwitch2.setModel(new javax.swing.SpinnerNumberModel(0, 0, 99, 1));
        jSpinnerSwitch2.setEnabled(false);

        javax.swing.GroupLayout jPanelPlataformesLayout = new javax.swing.GroupLayout(jPanelPlataformes);
        jPanelPlataformes.setLayout(jPanelPlataformesLayout);
        jPanelPlataformesLayout.setHorizontalGroup(
            jPanelPlataformesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPlataformesLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelPlataformesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBoxPS5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBoxXbox, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBoxPC, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBoxSwitch2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanelPlataformesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelUnitatsPS5)
                    .addComponent(jLabelUnitatsXbox)
                    .addComponent(jLabelUnitatsPC)
                    .addComponent(jLabelUnitatsSwitch2))
                .addGap(18, 18, 18)
                .addGroup(jPanelPlataformesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSpinnerPS5, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                    .addComponent(jSpinnerXbox)
                    .addComponent(jSpinnerPC)
                    .addComponent(jSpinnerSwitch2))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        jPanelPlataformesLayout.setVerticalGroup(
            jPanelPlataformesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPlataformesLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanelPlataformesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBoxPS5)
                    .addComponent(jLabelUnitatsPS5)
                    .addComponent(jSpinnerPS5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelPlataformesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBoxXbox)
                    .addComponent(jLabelUnitatsXbox)
                    .addComponent(jSpinnerXbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelPlataformesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBoxPC)
                    .addComponent(jLabelUnitatsPC)
                    .addComponent(jSpinnerPC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelPlataformesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBoxSwitch2)
                    .addComponent(jLabelUnitatsSwitch2)
                    .addComponent(jSpinnerSwitch2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jButtonConfirmar.setText("Confirmar");
        jButtonConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarActionPerformed(evt);
            }
        });

        jButtonCancellar.setText("Cancel·lar");
        jButtonCancellar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancellarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonCancellar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabelNom)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jTextFieldNom, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabelGenere)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jComboBoxGenere, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(jPanelPlataformes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNom)
                    .addComponent(jTextFieldNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelGenere)
                    .addComponent(jComboBoxGenere, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanelPlataformes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCancellar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBoxPS5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxPS5ActionPerformed
        actualitzarEstatSpinner(jCheckBoxPS5.isSelected(), jSpinnerPS5);
    }//GEN-LAST:event_jCheckBoxPS5ActionPerformed

    private void jCheckBoxXboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxXboxActionPerformed
        actualitzarEstatSpinner(jCheckBoxXbox.isSelected(), jSpinnerXbox);
    }//GEN-LAST:event_jCheckBoxXboxActionPerformed

    private void jCheckBoxPCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxPCActionPerformed
        actualitzarEstatSpinner(jCheckBoxPC.isSelected(), jSpinnerPC);
    }//GEN-LAST:event_jCheckBoxPCActionPerformed

    private void jCheckBoxSwitch2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxSwitch2ActionPerformed
        actualitzarEstatSpinner(jCheckBoxSwitch2.isSelected(), jSpinnerSwitch2);
    }//GEN-LAST:event_jCheckBoxSwitch2ActionPerformed

    private void actualitzarEstatSpinner(boolean seleccionat, javax.swing.JSpinner spn) {
        spn.setEnabled(seleccionat);
        if (seleccionat && ((Integer) spn.getValue()) == 0) {
            spn.setValue(1);
        } else if (!seleccionat) {
            spn.setValue(0);
        }
    }

    private void jButtonConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarActionPerformed
        String nom = jTextFieldNom.getText().trim();
        String genere = (String) jComboBoxGenere.getSelectedItem();

        if (!ValidationAPI.esTextNoBuit(nom)) {
            JOptionPane.showMessageDialog(this,
                    GestorDades.getInstance().getMissatge("msg.camps.obligatoris"),
                    GestorDades.getInstance().getMissatge("msg.atencio"),
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (!ValidationAPI.comencaPerMajuscula(nom)) {
            JOptionPane.showMessageDialog(this,
                    GestorDades.getInstance().getMissatge("msg.majuscula.joc"),
                    GestorDades.getInstance().getMissatge("msg.error"),
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        int uPS5 = jCheckBoxPS5.isSelected() ? (Integer) jSpinnerPS5.getValue() : 0;
        int uXbox = jCheckBoxXbox.isSelected() ? (Integer) jSpinnerXbox.getValue() : 0;
        int uPC = jCheckBoxPC.isSelected() ? (Integer) jSpinnerPC.getValue() : 0;
        int uSwitch2 = jCheckBoxSwitch2.isSelected() ? (Integer) jSpinnerSwitch2.getValue() : 0;

        if (uPS5 == 0 && uXbox == 0 && uPC == 0 && uSwitch2 == 0) {
            JOptionPane.showMessageDialog(this,
                    GestorDades.getInstance().getMissatge("msg.joc.sense.plataforma"),
                    GestorDades.getInstance().getMissatge("msg.error"),
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        Joc nou = new Joc(0, nom, genere);
        nou.setEstoc(Plataforma.PS5, uPS5);
        nou.setEstoc(Plataforma.XBOX, uXbox);
        nou.setEstoc(Plataforma.PC, uPC);
        nou.setEstoc(Plataforma.SWITCH_2, uSwitch2);

        GestorDades.getInstance().afegirJoc(nou);
        creat = true;
        JOptionPane.showMessageDialog(this,
                GestorDades.getInstance().getMissatge("msg.exit"),
                GestorDades.getInstance().getMissatge("msg.exit"),
                JOptionPane.INFORMATION_MESSAGE);
        dispose();
    }//GEN-LAST:event_jButtonConfirmarActionPerformed

    private void jButtonCancellarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancellarActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonCancellarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancellar;
    private javax.swing.JButton jButtonConfirmar;
    private javax.swing.JCheckBox jCheckBoxPC;
    private javax.swing.JCheckBox jCheckBoxPS5;
    private javax.swing.JCheckBox jCheckBoxSwitch2;
    private javax.swing.JCheckBox jCheckBoxXbox;
    private javax.swing.JComboBox<String> jComboBoxGenere;
    private javax.swing.JLabel jLabelGenere;
    private javax.swing.JLabel jLabelNom;
    private javax.swing.JLabel jLabelUnitatsPC;
    private javax.swing.JLabel jLabelUnitatsPS5;
    private javax.swing.JLabel jLabelUnitatsSwitch2;
    private javax.swing.JLabel jLabelUnitatsXbox;
    private javax.swing.JPanel jPanelPlataformes;
    private javax.swing.JSpinner jSpinnerPC;
    private javax.swing.JSpinner jSpinnerPS5;
    private javax.swing.JSpinner jSpinnerSwitch2;
    private javax.swing.JSpinner jSpinnerXbox;
    private javax.swing.JTextField jTextFieldNom;
    // End of variables declaration//GEN-END:variables
}
