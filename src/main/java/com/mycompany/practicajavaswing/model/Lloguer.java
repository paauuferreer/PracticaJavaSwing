package com.mycompany.practicajavaswing.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Lloguer {
    private int numRegistre;
    private Usuari usuari;
    private Joc joc;
    private Plataforma plataforma;
    private LocalDate dataInici;
    private LocalDate dataPrevista;
    private boolean retornat;

    public Lloguer() {
    }

    public Lloguer(int numRegistre, Usuari usuari, Joc joc, Plataforma plataforma, LocalDate dataInici, LocalDate dataPrevista, boolean retornat) {
        this.numRegistre = numRegistre;
        this.usuari = usuari;
        this.joc = joc;
        this.plataforma = plataforma;
        this.dataInici = dataInici;
        this.dataPrevista = dataPrevista;
        this.retornat = retornat;
    }

    public int getNumRegistre() {
        return numRegistre;
    }

    public void setNumRegistre(int numRegistre) {
        this.numRegistre = numRegistre;
    }

    public String getNumRegistreFormatat() {
        return String.format("%02d", numRegistre);
    }

    public Usuari getUsuari() {
        return usuari;
    }

    public void setUsuari(Usuari usuari) {
        this.usuari = usuari;
    }

    public Joc getJoc() {
        return joc;
    }

    public void setJoc(Joc joc) {
        this.joc = joc;
    }

    public Plataforma getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(Plataforma plataforma) {
        this.plataforma = plataforma;
    }

    public LocalDate getDataInici() {
        return dataInici;
    }

    public void setDataInici(LocalDate dataInici) {
        this.dataInici = dataInici;
    }

    public LocalDate getDataPrevista() {
        return dataPrevista;
    }

    public void setDataPrevista(LocalDate dataPrevista) {
        this.dataPrevista = dataPrevista;
    }

    public boolean isRetornat() {
        return retornat;
    }

    public void setRetornat(boolean retornat) {
        this.retornat = retornat;
    }

    public boolean isForaDeTermini() {
        if (retornat) {
            return false;
        }
        if (dataPrevista == null) {
            return false;
        }
        return LocalDate.now().isAfter(dataPrevista);
    }

    public String getDataIniciFormatada() {
        if (dataInici == null) {
            return "";
        }
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return dataInici.format(df);
    }

    public String getDataPrevistaFormatada() {
        if (dataPrevista == null) {
            return "";
        }
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return dataPrevista.format(df);
    }
}
