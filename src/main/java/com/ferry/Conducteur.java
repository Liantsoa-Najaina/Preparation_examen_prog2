package com.ferry;

import java.time.LocalDate;
import java.util.Date;

public class Conducteur extends Personne {
    private String numeroPermis;

    public Conducteur(String nom, double poids, String adresse, LocalDate dateDeNaissance, String prenom, String numeroPermis) {
        super(nom, poids, adresse, dateDeNaissance, prenom);
        this.numeroPermis = numeroPermis;
    }

    public String getNumeroPermis() {
        return numeroPermis;
    }

    public void setNumeroPermis(String numeroPermis) {
        this.numeroPermis = numeroPermis;
    }
}
