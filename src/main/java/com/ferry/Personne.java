package com.ferry;

import java.time.LocalDate;
import java.util.Date;

public class Personne {
    private String nom;
    private String prenom ;
    private final LocalDate dateDeNaissance;
    private String adresse;
    private double poids;

    public Personne(String nom, double poids, String adresse, LocalDate dateDeNaissance, String prenom) {
        this.nom = nom;
        this.poids = poids;
        this.adresse = adresse;
        this.dateDeNaissance = dateDeNaissance;
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPoids() {
        return poids;
    }

    public void setPoids(double poids) {
        this.poids = poids;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public LocalDate getDateDeNaissance() {
        return dateDeNaissance;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void voyager() {
        System.out.println("I'm travelling");
    };
}
