package com.mycompany.practicajavaswing.ui;

import com.mycompany.practicajavaswing.model.Joc;
import com.mycompany.practicajavaswing.model.Plataforma;
import com.mycompany.practicajavaswing.model.Usuari;
import com.mycompany.practicajavaswing.service.GestorDades;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

public class DialegLloguer extends javax.swing.JDialog {

    private boolean registrat;
    private LocalDate dataInici;
    private LocalDate dataTornada;

    public DialegLloguer(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        this.registrat = false;
        initComponents();
        carregarDadesInicials();
    }

    public boolean isRegistrat() {
        return registrat;
    }

    private void carregarDadesInicials() {
        dataInici = LocalDate.now();
        dataTornada = dataInici.plusDays(7);
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        jTextFieldNumRegistre.setText(String.format("%02d", GestorDades.getInstance().getSeguentNumLloguer()));
        jTextFieldDataInici.setText(dataInici.format(df));
        jTextFieldDataTornada.setText(dataTornada.format(df));

        jComboBoxUsuari.removeAllItems();
        for (Usuari u : GestorDades.getInstance().getUsuaris()) {
            jComboBoxUsuari.addItem(u);
        }

        jComboBoxJoc.removeAllItems();
        for (Joc j : GestorDades.getInstance().getJocs()) {
            jComboBoxJoc.addItem(j);
        }

        actualitzarEstatPlataformes();
    }

    private void actualitzarEstatPlataformes() {
        Joc seleccionat = (Joc) jComboBoxJoc.getSelectedItem();
        if (seleccionat == null) {
            jLabelGenereValor.setText("-");
            jButtonConfirmar.setEnabled(false);
            jRadioButtonPC.setEnabled(false);
            jRadioButtonPS5.setEnabled(false);
            jRadioButtonXbox.setEnabled(false);
            jRadioButtonSwitch2.setEnabled(false);
            buttonGroupPlataformes.clearSelection();
            return;
        }

        jLabelGenereValor.setText(seleccionat.getGenere());

        int estocPC = seleccionat.getEstoc(Plataforma.PC);
        int estocPS5 = seleccionat.getEstoc(Plataforma.PS5);
        int estocXbox = seleccionat.getEstoc(Plataforma.XBOX);
        int estocSwitch2 = seleccionat.getEstoc(Plataforma.SWITCH_2);

        jLabelStockPC.setText("PC: " + estocPC);
        jLabelStockPS5.setText("PS5: " + estocPS5);
        jLabelStockXbox.setText("Xbox: " + estocXbox);
        jLabelStockSwitch2.setText("Switch 2: " + estocSwitch2);

        jRadioButtonPC.setText("PC (" + estocPC + (estocPC == 1 ? " unitat disponible)" : " unitats disponibles)"));
        jRadioButtonPS5.setText("PS5 (" + estocPS5 + (estocPS5 == 1 ? " unitat disponible)" : " unitats disponibles)"));
        jRadioButtonXbox.setText("Xbox (" + estocXbox + (estocXbox == 1 ? " unitat disponible)" : " unitats disponibles)"));
        jRadioButtonSwitch2.setText("Switch 2 (" + estocSwitch2 + (estocSwitch2 == 1 ? " unitat disponible)" : " unitats disponibles)"));

        jRadioButtonPC.setEnabled(estocPC > 0);
        jRadioButtonPS5.setEnabled(estocPS5 > 0);
        jRadioButtonXbox.setEnabled(estocXbox > 0);
        jRadioButtonSwitch2.setEnabled(estocSwitch2 > 0);

        buttonGroupPlataformes.clearSelection();
        if (estocPC > 0) {
            jRadioButtonPC.setSelected(true);
            jButtonConfirmar.setEnabled(true);
        } else if (estocPS5 > 0) {
            jRadioButtonPS5.setSelected(true);
            jButtonConfirmar.setEnabled(true);
        } else if (estocXbox > 0) {
            jRadioButtonXbox.setSelected(true);
            jButtonConfirmar.setEnabled(true);
        } else if (estocSwitch2 > 0) {
            jRadioButtonSwitch2.setSelected(true);
            jButtonConfirmar.setEnabled(true);
        } else {
            jButtonConfirmar.setEnabled(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupPlataformes = new javax.swing.ButtonGroup();
        jPanelDadesLloguer = new javax.swing.JPanel();
        jLabelNumRegistre = new javax.swing.JLabel();
        jTextFieldNumRegistre = new javax.swing.JTextField();
        jLabelUsuari = new javax.swing.JLabel();
        jComboBoxUsuari = new javax.swing.JComboBox<>();
        jLabelJocElegit = new javax.swing.JLabel();
        jComboBoxJoc = new javax.swing.JComboBox<>();
        jLabelDataInici = new javax.swing.JLabel();
        jTextFieldDataInici = new javax.swing.JTextField();
        jLabelDataTornada = new javax.swing.JLabel();
        jTextFieldDataTornada = new javax.swing.JTextField();
        jPanelPlataforma = new javax.swing.JPanel();
        jRadioButtonPC = new javax.swing.JRadioButton();
        jRadioButtonPS5 = new javax.swing.JRadioButton();
        jRadioButtonXbox = new javax.swing.JRadioButton();
        jRadioButtonSwitch2 = new javax.swing.JRadioButton();
        jPanelInfoJoc = new javax.swing.JPanel();
        jLabelGenereTitol = new javax.swing.JLabel();
        jLabelGenereValor = new javax.swing.JLabel();
        jLabelUnitatsDispTitol = new javax.swing.JLabel();
        jLabelStockPS5 = new javax.swing.JLabel();
        jLabelStockXbox = new javax.swing.JLabel();
        jLabelStockPC = new javax.swing.JLabel();
        jLabelStockSwitch2 = new javax.swing.JLabel();
        jButtonConfirmar = new javax.swing.JButton();
        jButtonCancellar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registrar lloguer");
        setModal(true);
        setResizable(false);

        jPanelDadesLloguer.setBorder(javax.swing.BorderFactory.createTitledBorder("Dades del lloguer"));

        jLabelNumRegistre.setText("Núm. de registre:");

        jTextFieldNumRegistre.setEditable(false);

        jLabelUsuari.setText("Usuari:");

        jLabelJocElegit.setText("Joc elegit:");

        jComboBoxJoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxJocActionPerformed(evt);
            }
        });

        jLabelDataInici.setText("Data d'inici:");

        jTextFieldDataInici.setEditable(false);

        jLabelDataTornada.setText("Data de tornada:");

        jTextFieldDataTornada.setEditable(false);

        javax.swing.GroupLayout jPanelDadesLloguerLayout = new javax.swing.GroupLayout(jPanelDadesLloguer);
        jPanelDadesLloguer.setLayout(jPanelDadesLloguerLayout);
        jPanelDadesLloguerLayout.setHorizontalGroup(
            jPanelDadesLloguerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDadesLloguerLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanelDadesLloguerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelNumRegistre)
                    .addComponent(jLabelUsuari)
                    .addComponent(jLabelJocElegit)
                    .addComponent(jLabelDataInici)
                    .addComponent(jLabelDataTornada))
                .addGap(15, 15, 15)
                .addGroup(jPanelDadesLloguerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldNumRegistre, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxUsuari, 0, 180, Short.MAX_VALUE)
                    .addComponent(jComboBoxJoc, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldDataInici)
                    .addComponent(jTextFieldDataTornada))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanelDadesLloguerLayout.setVerticalGroup(
            jPanelDadesLloguerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDadesLloguerLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelDadesLloguerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNumRegistre)
                    .addComponent(jTextFieldNumRegistre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelDadesLloguerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelUsuari)
                    .addComponent(jComboBoxUsuari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelDadesLloguerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelJocElegit)
                    .addComponent(jComboBoxJoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelDadesLloguerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDataInici)
                    .addComponent(jTextFieldDataInici, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelDadesLloguerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDataTornada)
                    .addComponent(jTextFieldDataTornada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jPanelPlataforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Plataforma"));

        buttonGroupPlataformes.add(jRadioButtonPC);
        jRadioButtonPC.setText("PC");

        buttonGroupPlataformes.add(jRadioButtonPS5);
        jRadioButtonPS5.setText("PS5");

        buttonGroupPlataformes.add(jRadioButtonXbox);
        jRadioButtonXbox.setText("Xbox");

        buttonGroupPlataformes.add(jRadioButtonSwitch2);
        jRadioButtonSwitch2.setText("Switch 2");

        javax.swing.GroupLayout jPanelPlataformaLayout = new javax.swing.GroupLayout(jPanelPlataforma);
        jPanelPlataforma.setLayout(jPanelPlataformaLayout);
        jPanelPlataformaLayout.setHorizontalGroup(
            jPanelPlataformaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPlataformaLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanelPlataformaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButtonPC)
                    .addComponent(jRadioButtonPS5)
                    .addComponent(jRadioButtonXbox)
                    .addComponent(jRadioButtonSwitch2))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanelPlataformaLayout.setVerticalGroup(
            jPanelPlataformaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPlataformaLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jRadioButtonPC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButtonPS5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButtonXbox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButtonSwitch2)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jPanelInfoJoc.setBorder(javax.swing.BorderFactory.createTitledBorder("Informació del joc"));

        jLabelGenereTitol.setText("Gènere:");

        jLabelGenereValor.setText("-");

        jLabelUnitatsDispTitol.setText("Unitats disponibles:");

        jLabelStockPS5.setText("PS5: 0");

        jLabelStockXbox.setText("Xbox: 0");

        jLabelStockPC.setText("PC: 0");

        jLabelStockSwitch2.setText("Switch 2: 0");

        javax.swing.GroupLayout jPanelInfoJocLayout = new javax.swing.GroupLayout(jPanelInfoJoc);
        jPanelInfoJoc.setLayout(jPanelInfoJocLayout);
        jPanelInfoJocLayout.setHorizontalGroup(
            jPanelInfoJocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInfoJocLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanelInfoJocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelUnitatsDispTitol)
                    .addGroup(jPanelInfoJocLayout.createSequentialGroup()
                        .addComponent(jLabelGenereTitol)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelGenereValor))
                    .addGroup(jPanelInfoJocLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanelInfoJocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelStockXbox)
                            .addComponent(jLabelStockPS5)
                            .addComponent(jLabelStockPC)
                            .addComponent(jLabelStockSwitch2))))
                .addContainerGap(120, Short.MAX_VALUE))
        );
        jPanelInfoJocLayout.setVerticalGroup(
            jPanelInfoJocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInfoJocLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanelInfoJocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelGenereTitol)
                    .addComponent(jLabelGenereValor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelUnitatsDispTitol)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelStockPS5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelStockXbox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelStockPC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelStockSwitch2)
                .addContainerGap(10, Short.MAX_VALUE))
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
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonCancellar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelDadesLloguer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanelPlataforma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanelInfoJoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelPlataforma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanelInfoJoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanelDadesLloguer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCancellar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxJocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxJocActionPerformed
        actualitzarEstatPlataformes();
    }//GEN-LAST:event_jComboBoxJocActionPerformed

    private void jButtonConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarActionPerformed
        Usuari usuari = (Usuari) jComboBoxUsuari.getSelectedItem();
        Joc joc = (Joc) jComboBoxJoc.getSelectedItem();

        if (usuari == null || joc == null) {
            JOptionPane.showMessageDialog(this,
                    GestorDades.getInstance().getMissatge("msg.camps.obligatoris"),
                    GestorDades.getInstance().getMissatge("msg.atencio"),
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

        Plataforma seleccionada = null;
        if (jRadioButtonPC.isSelected() && jRadioButtonPC.isEnabled()) {
            seleccionada = Plataforma.PC;
        } else if (jRadioButtonPS5.isSelected() && jRadioButtonPS5.isEnabled()) {
            seleccionada = Plataforma.PS5;
        } else if (jRadioButtonXbox.isSelected() && jRadioButtonXbox.isEnabled()) {
            seleccionada = Plataforma.XBOX;
        } else if (jRadioButtonSwitch2.isSelected() && jRadioButtonSwitch2.isEnabled()) {
            seleccionada = Plataforma.SWITCH_2;
        }

        if (seleccionada == null) {
            JOptionPane.showMessageDialog(this,
                    GestorDades.getInstance().getMissatge("msg.lloguer.sense.estoc"),
                    GestorDades.getInstance().getMissatge("msg.error"),
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        boolean ok = GestorDades.getInstance().registrarLloguer(usuari, joc, seleccionada, dataInici, dataTornada);
        if (ok) {
            registrat = true;
            JOptionPane.showMessageDialog(this,
                    GestorDades.getInstance().getMissatge("msg.exit"),
                    GestorDades.getInstance().getMissatge("msg.exit"),
                    JOptionPane.INFORMATION_MESSAGE);
            dispose();
        } else {
            JOptionPane.showMessageDialog(this,
                    GestorDades.getInstance().getMissatge("msg.lloguer.sense.estoc"),
                    GestorDades.getInstance().getMissatge("msg.error"),
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonConfirmarActionPerformed

    private void jButtonCancellarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancellarActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonCancellarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupPlataformes;
    private javax.swing.JButton jButtonCancellar;
    private javax.swing.JButton jButtonConfirmar;
    private javax.swing.JComboBox<com.mycompany.practicajavaswing.model.Joc> jComboBoxJoc;
    private javax.swing.JComboBox<com.mycompany.practicajavaswing.model.Usuari> jComboBoxUsuari;
    private javax.swing.JLabel jLabelDataInici;
    private javax.swing.JLabel jLabelDataTornada;
    private javax.swing.JLabel jLabelGenereTitol;
    private javax.swing.JLabel jLabelGenereValor;
    private javax.swing.JLabel jLabelNumRegistre;
    private javax.swing.JLabel jLabelStockPC;
    private javax.swing.JLabel jLabelStockPS5;
    private javax.swing.JLabel jLabelStockSwitch2;
    private javax.swing.JLabel jLabelStockXbox;
    private javax.swing.JLabel jLabelUnitatsDispTitol;
    private javax.swing.JLabel jLabelUsuari;
    private javax.swing.JLabel jLabelJocElegit;
    private javax.swing.JPanel jPanelDadesLloguer;
    private javax.swing.JPanel jPanelInfoJoc;
    private javax.swing.JPanel jPanelPlataforma;
    private javax.swing.JRadioButton jRadioButtonPC;
    private javax.swing.JRadioButton jRadioButtonPS5;
    private javax.swing.JRadioButton jRadioButtonSwitch2;
    private javax.swing.JRadioButton jRadioButtonXbox;
    private javax.swing.JTextField jTextFieldDataInici;
    private javax.swing.JTextField jTextFieldDataTornada;
    private javax.swing.JTextField jTextFieldNumRegistre;
    // End of variables declaration//GEN-END:variables
}
