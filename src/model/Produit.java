package model;

public abstract class Produit {

    private String reference;
    private String nom;
    private double prix;

    public Produit(String reference, String nom, double prix) {
        this.reference = reference;
        this.nom = nom;
        this.prix = prix;
    }

    public String getReference() {
        return reference;
    }

    public String getNom() {
        return nom;
    }

    public double getPrix() {
        return prix;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public abstract double calculerPrixFinal();

    @Override
    public String toString() {
        return "Reference: " + reference +
                ", Nom: " + nom +
                ", Prix: " + prix;
    }
}