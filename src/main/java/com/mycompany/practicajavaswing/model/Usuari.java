package com.mycompany.practicajavaswing.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Usuari {
    private int id;
    private String nom;
    private String llinatge1;
    private String llinatge2;
    private String dni;
    private String telefon;
    private LocalDate dataRegistre;

    public Usuari() {
    }

    public Usuari(int id, String nom, String llinatge1, String llinatge2, String dni, String telefon, LocalDate dataRegistre) {
        this.id = id;
        this.nom = nom;
        this.llinatge1 = llinatge1;
        this.llinatge2 = llinatge2;
        this.dni = dni;
        this.telefon = telefon;
        this.dataRegistre = dataRegistre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getLlinatge1() {
        return llinatge1;
    }

    public void setLlinatge1(String llinatge1) {
        this.llinatge1 = llinatge1;
    }

    public String getLlinatge2() {
        return llinatge2;
    }

    public void setLlinatge2(String llinatge2) {
        this.llinatge2 = llinatge2;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public LocalDate getDataRegistre() {
        return dataRegistre;
    }

    public void setDataRegistre(LocalDate dataRegistre) {
        this.dataRegistre = dataRegistre;
    }

    public String getNomComplet() {
        StringBuilder sb = new StringBuilder();
        if (nom != null && !nom.isEmpty()) {
            sb.append(nom);
        }
        if (llinatge1 != null && !llinatge1.isEmpty()) {
            if (sb.length() > 0) sb.append(" ");
            sb.append(llinatge1);
        }
        if (llinatge2 != null && !llinatge2.isEmpty()) {
            if (sb.length() > 0) sb.append(" ");
            sb.append(llinatge2);
        }
        return sb.toString();
    }

    public String getDataRegistreFormatada() {
        if (dataRegistre == null) {
            return "";
        }
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return dataRegistre.format(df);
    }

    @Override
    public String toString() {
        return getNomComplet();
    }
}
