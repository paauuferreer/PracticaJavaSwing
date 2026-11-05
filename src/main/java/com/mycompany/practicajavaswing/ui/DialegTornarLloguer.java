package com.mycompany.practicajavaswing.ui;

import com.mycompany.practicajavaswing.model.Lloguer;
import com.mycompany.practicajavaswing.service.GestorDades;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class DialegTornarLloguer extends javax.swing.JDialog {

    private List<Lloguer> llistaActius;
    private boolean modificat;

    public DialegTornarLloguer(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        this.modificat = false;
        initComponents();
        setTitle(GestorDades.getInstance().getMissatge("menu.lloguer.tornar"));
        carregarDades();
        setLocationRelativeTo(parent);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableLloguers = new javax.swing.JTable();
        jPanelDetalls = new javax.swing.JPanel();
        jLabelJoc = new javax.swing.JLabel();
        jLabelJocValor = new javax.swing.JLabel();
        jLabelUsuari = new javax.swing.JLabel();
        jLabelUsuariValor = new javax.swing.JLabel();
        jLabelPlataforma = new javax.swing.JLabel();
        jLabelPlataformaValor = new javax.swing.JLabel();
        jLabelDataInici = new javax.swing.JLabel();
        jLabelDataIniciValor = new javax.swing.JLabel();
        jPanelBotons = new javax.swing.JPanel();
        jButtonMarcarRetornat = new javax.swing.JButton();
        jButtonTancar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(750, 480));

        jTableLloguers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {
                "Núm. registre", "Títol del joc", "Usuari", "Plataforma", "Data d'inici"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableLloguers.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTableLloguers.getSelectionModel().addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jTableLloguersValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jTableLloguers);

        jPanelDetalls.setBorder(javax.swing.BorderFactory.createTitledBorder("Dades del lloguer"));

        jLabelJoc.setText("Joc:");

        jLabelJocValor.setText("-");

        jLabelUsuari.setText("Usuari:");

        jLabelUsuariValor.setText("-");

        jLabelPlataforma.setText("Plataforma:");

        jLabelPlataformaValor.setText("-");

        jLabelDataInici.setText("Data d'inici:");

        jLabelDataIniciValor.setText("-");

        javax.swing.GroupLayout jPanelDetallsLayout = new javax.swing.GroupLayout(jPanelDetalls);
        jPanelDetalls.setLayout(jPanelDetallsLayout);
        jPanelDetallsLayout.setHorizontalGroup(
            jPanelDetallsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDetallsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDetallsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelJoc)
                    .addComponent(jLabelUsuari)
                    .addComponent(jLabelPlataforma)
                    .addComponent(jLabelDataInici))
                .addGap(18, 18, 18)
                .addGroup(jPanelDetallsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelJocValor)
                    .addComponent(jLabelUsuariValor)
                    .addComponent(jLabelPlataformaValor)
                    .addComponent(jLabelDataIniciValor))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelDetallsLayout.setVerticalGroup(
            jPanelDetallsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDetallsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDetallsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelJoc)
                    .addComponent(jLabelJocValor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDetallsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelUsuari)
                    .addComponent(jLabelUsuariValor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDetallsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPlataforma)
                    .addComponent(jLabelPlataformaValor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDetallsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDataInici)
                    .addComponent(jLabelDataIniciValor))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButtonMarcarRetornat.setText("Marcar com a retornat");
        jButtonMarcarRetornat.setEnabled(false);
        jButtonMarcarRetornat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMarcarRetornatActionPerformed(evt);
            }
        });

        jButtonTancar.setText("Tancar");
        jButtonTancar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTancarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBotonsLayout = new javax.swing.GroupLayout(jPanelBotons);
        jPanelBotons.setLayout(jPanelBotonsLayout);
        jPanelBotonsLayout.setHorizontalGroup(
            jPanelBotonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBotonsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonMarcarRetornat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonTancar)
                .addContainerGap())
        );
        jPanelBotonsLayout.setVerticalGroup(
            jPanelBotonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBotonsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBotonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonMarcarRetornat)
                    .addComponent(jButtonTancar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 726, Short.MAX_VALUE)
                    .addComponent(jPanelDetalls, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelBotons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelDetalls, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelBotons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTableLloguersValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jTableLloguersValueChanged
        if (!evt.getValueIsAdjusting()) {
            actualitzarDetallsSeleccio();
        }
    }//GEN-LAST:event_jTableLloguersValueChanged

    private void jButtonMarcarRetornatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMarcarRetornatActionPerformed
        marcarComARetornat();
    }//GEN-LAST:event_jButtonMarcarRetornatActionPerformed

    private void jButtonTancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTancarActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonTancarActionPerformed

    private void carregarDades() {
        DefaultTableModel model = (DefaultTableModel) jTableLloguers.getModel();
        model.setRowCount(0);
        llistaActius = GestorDades.getInstance().getLloguersActiusDescendents();
        for (Lloguer ll : llistaActius) {
            model.addRow(new Object[]{
                ll.getNumRegistreFormatat(),
                ll.getJoc() != null ? ll.getJoc().getTitol() : "",
                ll.getUsuari() != null ? ll.getUsuari().getNomComplet() : "",
                ll.getPlataforma() != null ? ll.getPlataforma().getNom() : "",
                ll.getDataIniciFormatada()
            });
        }
        netejarDetalls();
    }

    private void netejarDetalls() {
        jLabelJocValor.setText("-");
        jLabelUsuariValor.setText("-");
        jLabelPlataformaValor.setText("-");
        jLabelDataIniciValor.setText("-");
        jButtonMarcarRetornat.setEnabled(false);
    }

    private void actualitzarDetallsSeleccio() {
        int fila = jTableLloguers.getSelectedRow();
        if (fila >= 0 && fila < llistaActius.size()) {
            Lloguer ll = llistaActius.get(fila);
            jLabelJocValor.setText(ll.getJoc() != null ? ll.getJoc().getTitol() : "-");
            jLabelUsuariValor.setText(ll.getUsuari() != null ? ll.getUsuari().getNomComplet() : "-");
            jLabelPlataformaValor.setText(ll.getPlataforma() != null ? ll.getPlataforma().getNom() : "-");
            jLabelDataIniciValor.setText(ll.getDataIniciFormatada());
            jButtonMarcarRetornat.setEnabled(true);
        } else {
            netejarDetalls();
        }
    }

    private void marcarComARetornat() {
        int fila = jTableLloguers.getSelectedRow();
        if (fila < 0 || fila >= llistaActius.size()) {
            JOptionPane.showMessageDialog(this,
                    GestorDades.getInstance().getMissatge("msg.selecciona.lloguer"),
                    GestorDades.getInstance().getMissatge("msg.atencio"),
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

        Lloguer seleccionat = llistaActius.get(fila);
        boolean ok = GestorDades.getInstance().tornarLloguer(seleccionat);
        if (ok) {
            modificat = true;
            JOptionPane.showMessageDialog(this,
                    GestorDades.getInstance().getMissatge("msg.lloguer.retornat.exit"),
                    GestorDades.getInstance().getMissatge("msg.exit"),
                    JOptionPane.INFORMATION_MESSAGE);
            carregarDades();
        }
    }

    public boolean isModificat() {
        return modificat;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonMarcarRetornat;
    private javax.swing.JButton jButtonTancar;
    private javax.swing.JLabel jLabelDataInici;
    private javax.swing.JLabel jLabelDataIniciValor;
    private javax.swing.JLabel jLabelJoc;
    private javax.swing.JLabel jLabelJocValor;
    private javax.swing.JLabel jLabelPlataforma;
    private javax.swing.JLabel jLabelPlataformaValor;
    private javax.swing.JLabel jLabelUsuari;
    private javax.swing.JLabel jLabelUsuariValor;
    private javax.swing.JPanel jPanelBotons;
    private javax.swing.JPanel jPanelDetalls;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableLloguers;
    // End of variables declaration//GEN-END:variables
}
