package com.mycompany.practicajavaswing.ui;

import com.mycompany.practicajavaswing.model.Lloguer;
import com.mycompany.practicajavaswing.service.GestorDades;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class FinestraPrincipal extends javax.swing.JFrame {

    public FinestraPrincipal() {
        initComponents();
        personalitzarTaula();
        actualitzarTaula();
    }

    private void personalitzarTaula() {
        jTableLloguers.setRowHeight(24);
    }

    public void actualitzarTaula() {
        DefaultTableModel model = (DefaultTableModel) jTableLloguers.getModel();
        model.setRowCount(0);
        List<Lloguer> llista = GestorDades.getInstance().getLloguersDescendents();
        for (Lloguer ll : llista) {
            String genere = (ll.getJoc() != null) ? ll.getJoc().getGenere() : "";
            model.addRow(new Object[]{
                ll.getNumRegistreFormatat(),
                ll.getJoc() != null ? ll.getJoc().getTitol() : "",
                ll.getUsuari() != null ? ll.getUsuari().getNomComplet() : "",
                ll.getPlataforma() != null ? ll.getPlataforma().getNom() : "",
                ll.getDataIniciFormatada(),
                ll.getDataPrevistaFormatada(),
                genere
            });
        }
        jLabelTotalLloguers.setText(GestorDades.getInstance().getMissatge("taula.total") + llista.size());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPaneTaula = new javax.swing.JScrollPane();
        jTableLloguers = new javax.swing.JTable();
        jLabelTotalLloguers = new javax.swing.JLabel();
        jMenuBarPrincipal = new javax.swing.JMenuBar();
        jMenuLloguer = new javax.swing.JMenu();
        jMenuItemRegistrarLloguer = new javax.swing.JMenuItem();
        jMenuItemTornarLloguer = new javax.swing.JMenuItem();
        jMenuUsuari = new javax.swing.JMenu();
        jMenuItemCrearUsuari = new javax.swing.JMenuItem();
        jMenuItemBorrarUsuari = new javax.swing.JMenuItem();
        jMenuJoc = new javax.swing.JMenu();
        jMenuItemCrearJoc = new javax.swing.JMenuItem();
        jMenuItemBorrarJoc = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GestiÃ³ de Lloguer de Videojocs");

        jTableLloguers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NÃºm. registre", "TÃ­tol del joc", "Usuari que l'ha llogat", "Plataforma", "Data d'inici", "Data de tornada", "GÃ¨nere"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPaneTaula.setViewportView(jTableLloguers);

        jLabelTotalLloguers.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabelTotalLloguers.setText("Total de lloguers: 0");

        jMenuLloguer.setText("Lloguer");

        jMenuItemRegistrarLloguer.setText("Registrar...");
        jMenuItemRegistrarLloguer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRegistrarLloguerActionPerformed(evt);
            }
        });
        jMenuLloguer.add(jMenuItemRegistrarLloguer);

        jMenuItemTornarLloguer.setText("Tornar...");
        jMenuItemTornarLloguer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemTornarLloguerActionPerformed(evt);
            }
        });
        jMenuLloguer.add(jMenuItemTornarLloguer);

        jMenuBarPrincipal.add(jMenuLloguer);

        jMenuUsuari.setText("Usuari");

        jMenuItemCrearUsuari.setText("Crear...");
        jMenuItemCrearUsuari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCrearUsuariActionPerformed(evt);
            }
        });
        jMenuUsuari.add(jMenuItemCrearUsuari);

        jMenuItemBorrarUsuari.setText("Borrar...");
        jMenuItemBorrarUsuari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemBorrarUsuariActionPerformed(evt);
            }
        });
        jMenuUsuari.add(jMenuItemBorrarUsuari);

        jMenuBarPrincipal.add(jMenuUsuari);

        jMenuJoc.setText("Joc");

        jMenuItemCrearJoc.setText("Crear...");
        jMenuItemCrearJoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCrearJocActionPerformed(evt);
            }
        });
        jMenuJoc.add(jMenuItemCrearJoc);

        jMenuItemBorrarJoc.setText("Borrar...");
        jMenuItemBorrarJoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemBorrarJocActionPerformed(evt);
            }
        });
        jMenuJoc.add(jMenuItemBorrarJoc);

        jMenuBarPrincipal.add(jMenuJoc);

        setJMenuBar(jMenuBarPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPaneTaula, javax.swing.GroupLayout.DEFAULT_SIZE, 870, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelTotalLloguers)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPaneTaula, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
                .addGap(12, 12, 12)
                .addComponent(jLabelTotalLloguers)
                .addGap(15, 15, 15))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemRegistrarLloguerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRegistrarLloguerActionPerformed
    }//GEN-LAST:event_jMenuItemRegistrarLloguerActionPerformed

    private void jMenuItemTornarLloguerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemTornarLloguerActionPerformed
    }//GEN-LAST:event_jMenuItemTornarLloguerActionPerformed

    private void jMenuItemCrearUsuariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCrearUsuariActionPerformed
    }//GEN-LAST:event_jMenuItemCrearUsuariActionPerformed

    private void jMenuItemBorrarUsuariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemBorrarUsuariActionPerformed
    }//GEN-LAST:event_jMenuItemBorrarUsuariActionPerformed

    private void jMenuItemCrearJocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCrearJocActionPerformed
    }//GEN-LAST:event_jMenuItemCrearJocActionPerformed

    private void jMenuItemBorrarJocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemBorrarJocActionPerformed
    }//GEN-LAST:event_jMenuItemBorrarJocActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelTotalLloguers;
    private javax.swing.JMenuBar jMenuBarPrincipal;
    private javax.swing.JMenuItem jMenuItemBorrarJoc;
    private javax.swing.JMenuItem jMenuItemBorrarUsuari;
    private javax.swing.JMenuItem jMenuItemCrearJoc;
    private javax.swing.JMenuItem jMenuItemCrearUsuari;
    private javax.swing.JMenuItem jMenuItemRegistrarLloguer;
    private javax.swing.JMenuItem jMenuItemTornarLloguer;
    private javax.swing.JMenu jMenuJoc;
    private javax.swing.JMenu jMenuLloguer;
    private javax.swing.JMenu jMenuUsuari;
    private javax.swing.JScrollPane jScrollPaneTaula;
    private javax.swing.JTable jTableLloguers;
    // End of variables declaration//GEN-END:variables
}