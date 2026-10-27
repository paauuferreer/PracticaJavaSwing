package com.mycompany.practicajavaswing.model;

import java.util.EnumMap;
import java.util.Map;

public class Joc {
    private int id;
    private String titol;
    private String genere;
    private Map<Plataforma, Integer> estocPerPlataforma;

    public Joc() {
        this.estocPerPlataforma = new EnumMap<>(Plataforma.class);
    }

    public Joc(int id, String titol, String genere) {
        this.id = id;
        this.titol = titol;
        this.genere = genere;
        this.estocPerPlataforma = new EnumMap<>(Plataforma.class);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitol() {
        return titol;
    }

    public void setTitol(String titol) {
        this.titol = titol;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    public int getEstoc(Plataforma plataforma) {
        return estocPerPlataforma.getOrDefault(plataforma, 0);
    }

    public void setEstoc(Plataforma plataforma, int quantitat) {
        estocPerPlataforma.put(plataforma, quantitat);
    }

    public boolean teEstoc(Plataforma plataforma) {
        return getEstoc(plataforma) > 0;
    }

    public boolean descomptarEstoc(Plataforma plataforma) {
        int actual = getEstoc(plataforma);
        if (actual > 0) {
            estocPerPlataforma.put(plataforma, actual - 1);
            return true;
        }
        return false;
    }

    public void incrementarEstoc(Plataforma plataforma) {
        int actual = getEstoc(plataforma);
        estocPerPlataforma.put(plataforma, actual + 1);
    }

    public Map<Plataforma, Integer> getEstocPerPlataforma() {
        return estocPerPlataforma;
    }

    @Override
    public String toString() {
        return titol;
    }
}
