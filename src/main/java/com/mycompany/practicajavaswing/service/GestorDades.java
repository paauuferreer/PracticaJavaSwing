package com.mycompany.practicajavaswing.service;

import com.mycompany.practicajavaswing.model.Joc;
import com.mycompany.practicajavaswing.model.Lloguer;
import com.mycompany.practicajavaswing.model.Plataforma;
import com.mycompany.practicajavaswing.model.Usuari;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

public class GestorDades {
    private static GestorDades instancia;

    private List<Usuari> usuaris;
    private List<Joc> jocs;
    private List<Lloguer> lloguers;

    private int seguentIdUsuari;
    private int seguentIdJoc;
    private int seguentNumLloguer;
    private ResourceBundle bundle;

    private GestorDades() {
        this.usuaris = new ArrayList<>();
        this.jocs = new ArrayList<>();
        this.lloguers = new ArrayList<>();
        this.seguentIdUsuari = 1;
        this.seguentIdJoc = 1;
        this.seguentNumLloguer = 1;
        try {
            this.bundle = ResourceBundle.getBundle("Bundle_ca", Locale.forLanguageTag("ca-ES"));
        } catch (Exception e) {
            this.bundle = ResourceBundle.getBundle("Bundle_ca");
        }
        carregarDadesInicials();
    }

    public static GestorDades getInstance() {
        if (instancia == null) {
            instancia = new GestorDades();
        }
        return instancia;
    }

    public ResourceBundle getBundle() {
        return bundle;
    }

    public String getMissatge(String clau) {
        if (bundle != null && bundle.containsKey(clau)) {
            return bundle.getString(clau);
        }
        return clau;
    }

    private void carregarDadesInicials() {
        Usuari u1 = new Usuari(seguentIdUsuari++, "Marc", "Rosselló", "Mas", "43123456A", "611223344", LocalDate.of(2026, 10, 22));
        Usuari u2 = new Usuari(seguentIdUsuari++, "Laura", "Pons", "Servera", "43987654B", "655443322", LocalDate.of(2026, 10, 22));
        usuaris.add(u1);
        usuaris.add(u2);

        Joc j1 = new Joc(seguentIdJoc++, "The Legend of Zelda", "Aventura");
        j1.setEstoc(Plataforma.PS5, 1);
        j1.setEstoc(Plataforma.SWITCH_2, 0);
        jocs.add(j1);

        Joc j2 = new Joc(seguentIdJoc++, "Halo Infinite", "Acció");
        j2.setEstoc(Plataforma.XBOX, 2);
        j2.setEstoc(Plataforma.PC, 1);
        jocs.add(j2);

        Lloguer l1 = new Lloguer(seguentNumLloguer++, u1, j1, Plataforma.SWITCH_2, LocalDate.of(2026, 10, 23), LocalDate.of(2026, 10, 30), false);
        Lloguer l2 = new Lloguer(seguentNumLloguer++, u2, j2, Plataforma.PC, LocalDate.of(2026, 10, 20), LocalDate.of(2026, 10, 27), true);
        lloguers.add(l1);
        lloguers.add(l2);
    }

    public List<Usuari> getUsuaris() {
        return usuaris;
    }

    public List<Joc> getJocs() {
        return jocs;
    }

    public List<Lloguer> getLloguers() {
        return lloguers;
    }

    public List<Lloguer> getLloguersDescendents() {
        List<Lloguer> copia = new ArrayList<>(lloguers);
        Collections.reverse(copia);
        return copia;
    }

    public List<Lloguer> getLloguersActiusDescendents() {
        List<Lloguer> actius = new ArrayList<>();
        for (Lloguer ll : lloguers) {
            if (!ll.isRetornat()) {
                actius.add(ll);
            }
        }
        Collections.reverse(actius);
        return actius;
    }

    public void afegirUsuari(Usuari nouUsuari) {
        nouUsuari.setId(seguentIdUsuari++);
        usuaris.add(nouUsuari);
    }

    public boolean potEsborrarUsuari(Usuari u) {
        if (u == null) {
            return false;
        }
        for (Lloguer ll : lloguers) {
            if (!ll.isRetornat() && ll.getUsuari() != null && ll.getUsuari().getId() == u.getId()) {
                return false;
            }
        }
        return true;
    }

    public boolean esborrarUsuari(Usuari u) {
        if (!potEsborrarUsuari(u)) {
            return false;
        }
        return usuaris.remove(u);
    }

    public void afegirJoc(Joc nouJoc) {
        nouJoc.setId(seguentIdJoc++);
        jocs.add(nouJoc);
    }

    public boolean potEsborrarJoc(Joc j) {
        if (j == null) {
            return false;
        }
        for (Lloguer ll : lloguers) {
            if (!ll.isRetornat() && ll.getJoc() != null && ll.getJoc().getId() == j.getId()) {
                return false;
            }
        }
        return true;
    }

    public boolean esborrarJoc(Joc j) {
        if (!potEsborrarJoc(j)) {
            return false;
        }
        return jocs.remove(j);
    }

    public int getSeguentNumLloguer() {
        return seguentNumLloguer;
    }

    public boolean registrarLloguer(Usuari usuari, Joc joc, Plataforma plataforma, LocalDate dataInici, LocalDate dataPrevista) {
        if (usuari == null || joc == null || plataforma == null) {
            return false;
        }
        if (!joc.teEstoc(plataforma)) {
            return false;
        }
        joc.descomptarEstoc(plataforma);
        Lloguer lloguer = new Lloguer(seguentNumLloguer++, usuari, joc, plataforma, dataInici, dataPrevista, false);
        lloguers.add(lloguer);
        return true;
    }

    public boolean tornarLloguer(Lloguer lloguer) {
        if (lloguer == null || lloguer.isRetornat()) {
            return false;
        }
        lloguer.setRetornat(true);
        if (lloguer.getJoc() != null && lloguer.getPlataforma() != null) {
            lloguer.getJoc().incrementarEstoc(lloguer.getPlataforma());
        }
        return true;
    }
}
