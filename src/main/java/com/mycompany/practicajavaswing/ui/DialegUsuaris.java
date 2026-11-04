package com.mycompany.practicajavaswing.ui;

import com.mycompany.practicajavaswing.model.Usuari;
import com.mycompany.practicajavaswing.service.GestorDades;
import com.mycompany.practicajavaswing.validation.ValidationAPI;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

public class DialegUsuaris extends javax.swing.JDialog {

    private boolean creat;

    public DialegUsuaris(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        this.creat = false;
        initComponents();
        jTextFieldDataRegistre.setText(LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    }

    public boolean isCreat() {
        return creat;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelNom = new javax.swing.JLabel();
        jTextFieldNom = new javax.swing.JTextField();
        jLabelLlinatge1 = new javax.swing.JLabel();
        jTextFieldLlinatge1 = new javax.swing.JTextField();
        jLabelLlinatge2 = new javax.swing.JLabel();
        jTextFieldLlinatge2 = new javax.swing.JTextField();
        jLabelDni = new javax.swing.JLabel();
        jTextFieldDni = new javax.swing.JTextField();
        jLabelTelefon = new javax.swing.JLabel();
        jTextFieldTelefon = new javax.swing.JTextField();
        jLabelDataRegistre = new javax.swing.JLabel();
        jTextFieldDataRegistre = new javax.swing.JTextField();
        jButtonConfirmar = new javax.swing.JButton();
        jButtonCancellar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Crear usuari");
        setModal(true);
        setResizable(false);

        jLabelNom.setText("Nom *:");

        jLabelLlinatge1.setText("Llinatge 1 *:");

        jLabelLlinatge2.setText("Llinatge 2 *:");

        jLabelDni.setText("DNI *:");

        jLabelTelefon.setText("Telèfon *:");

        jLabelDataRegistre.setText("Data de registre:");

        jTextFieldDataRegistre.setEditable(false);

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
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNom)
                            .addComponent(jLabelLlinatge1)
                            .addComponent(jLabelLlinatge2)
                            .addComponent(jLabelDni)
                            .addComponent(jLabelTelefon)
                            .addComponent(jLabelDataRegistre))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldNom, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                            .addComponent(jTextFieldLlinatge1)
                            .addComponent(jTextFieldLlinatge2)
                            .addComponent(jTextFieldDni)
                            .addComponent(jTextFieldTelefon)
                            .addComponent(jTextFieldDataRegistre))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNom)
                    .addComponent(jTextFieldNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelLlinatge1)
                    .addComponent(jTextFieldLlinatge1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelLlinatge2)
                    .addComponent(jTextFieldLlinatge2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDni)
                    .addComponent(jTextFieldDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTelefon)
                    .addComponent(jTextFieldTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDataRegistre)
                    .addComponent(jTextFieldDataRegistre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCancellar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarActionPerformed
        String nom = jTextFieldNom.getText().trim();
        String llinatge1 = jTextFieldLlinatge1.getText().trim();
        String llinatge2 = jTextFieldLlinatge2.getText().trim();
        String dni = jTextFieldDni.getText().trim();
        String telefon = jTextFieldTelefon.getText().trim();

        if (!ValidationAPI.esTextNoBuit(nom) || !ValidationAPI.esTextNoBuit(llinatge1) ||
            !ValidationAPI.esTextNoBuit(llinatge2) || !ValidationAPI.esTextNoBuit(dni) ||
            !ValidationAPI.esTextNoBuit(telefon)) {
            JOptionPane.showMessageDialog(this,
                    GestorDades.getInstance().getMissatge("msg.camps.obligatoris"),
                    GestorDades.getInstance().getMissatge("msg.atencio"),
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (!ValidationAPI.comencaPerMajuscula(nom) ||
            !ValidationAPI.comencaPerMajuscula(llinatge1) ||
            !ValidationAPI.comencaPerMajuscula(llinatge2)) {
            JOptionPane.showMessageDialog(this,
                    GestorDades.getInstance().getMissatge("msg.majuscula.usuari"),
                    GestorDades.getInstance().getMissatge("msg.error"),
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!ValidationAPI.esTelefonValid(telefon)) {
            JOptionPane.showMessageDialog(this,
                    GestorDades.getInstance().getMissatge("msg.telefon.invalid"),
                    GestorDades.getInstance().getMissatge("msg.error"),
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!ValidationAPI.esDniValid(dni)) {
            JOptionPane.showMessageDialog(this,
                    GestorDades.getInstance().getMissatge("msg.dni.invalid"),
                    GestorDades.getInstance().getMissatge("msg.error"),
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        Usuari nou = new Usuari(0, nom, llinatge1, llinatge2, dni, telefon, LocalDate.now());
        GestorDades.getInstance().afegirUsuari(nou);
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
    private javax.swing.JLabel jLabelDataRegistre;
    private javax.swing.JLabel jLabelDni;
    private javax.swing.JLabel jLabelLlinatge1;
    private javax.swing.JLabel jLabelLlinatge2;
    private javax.swing.JLabel jLabelNom;
    private javax.swing.JLabel jLabelTelefon;
    private javax.swing.JTextField jTextFieldDataRegistre;
    private javax.swing.JTextField jTextFieldDni;
    private javax.swing.JTextField jTextFieldLlinatge1;
    private javax.swing.JTextField jTextFieldLlinatge2;
    private javax.swing.JTextField jTextFieldNom;
    private javax.swing.JTextField jTextFieldTelefon;
    // End of variables declaration//GEN-END:variables
}
