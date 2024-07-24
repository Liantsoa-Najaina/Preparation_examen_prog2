package com.ferry;

import java.time.Year;

public class Vehicule {
    private final String modele;
    private final String immatriculation;
    private double kilometrage;
    private final double poidsVide;
    private final double longueur;
    private double reserveCarburant;
    private Conducteur conducteur; /* A la construction, un véhicule n’a pas encore de conducteur et un
    véhicule ne peut être conduit que par une personne adulte.
            (+18ans)*/

    public Vehicule(String modele, String immatriculation, double kilometrage, double poidsVide, double longueur, Conducteur conducteur , double reserveCarburant) {
        this.modele = modele;
        this.immatriculation = immatriculation;
        this.kilometrage = 0;
        this.poidsVide = poidsVide;
        this.longueur = longueur;
        this.conducteur = null;
        this.reserveCarburant = reserveCarburant;
    }

    public String getModele() {
        return modele;
    }

    public String getImmatriculation() {
        return immatriculation;
    }

    public double getKilometrage() {
        return kilometrage;
    }

    public double setKilometrage(double distance) {
        this.kilometrage += distance;
        return distance;
    }

    public double getPoidsVide() {
        return poidsVide;
    }

    public double getLongueur() {
        return longueur;
    }

    public double getReserveCarburant() {
        return reserveCarburant;
    }

    public double setReserveCarburant(double quantite) {
        this.reserveCarburant += quantite;
        return quantite;
    }

    public Conducteur getConducteur() {
        return conducteur;
    }

    public void setConducteur(Conducteur conducteur) {
        int currentYear = Year.now().getValue();
        int ageConducteur = ( currentYear - conducteur.getDateDeNaissance().getYear());
        System.out.println((ageConducteur >= 18) ? this.conducteur = conducteur : "Conducteur trop jeune pour conduire");
    }

    public void changerConducteur(Conducteur conducteur) {
        setConducteur(conducteur);
    }

    public double getPoids (double poidsCharge) {
        double poids = poidsVide + reserveCarburant + conducteur.getPoids() + poidsCharge;
        return poids;
    }

    public double AllerAlaPompe (double quantite) {
        return  setReserveCarburant(quantite);
    }

    public double rouler (double distance) throws Exception {
        if (conducteur != null && reserveCarburant != 0) {
            setKilometrage(distance);
        } throw new Exception("Conducteur absent");
    }
}
