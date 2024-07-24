package com.ferry;

import java.time.LocalDate;
import java.util.Date;

public class Voyageur extends Personne {
    private Date dateDeVoyage;

    public Voyageur(String nom, double poids, String adresse, LocalDate dateDeNaissance, String prenom, Date dateDeVoyage) {
        super(nom, poids, adresse, dateDeNaissance, prenom);
        this.dateDeVoyage = dateDeVoyage;
    }

    public Date getDateDeVoyage() {
        return dateDeVoyage;
    }

    public void setDateDeVoyage(Date dateDeVoyage) {
        this.dateDeVoyage = dateDeVoyage;
    }
}
