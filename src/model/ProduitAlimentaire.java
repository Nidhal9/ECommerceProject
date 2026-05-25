package model;

public class ProduitAlimentaire extends Produit {

    private String dateExpiration;

    public ProduitAlimentaire(String reference, String nom,
                              double prix, String dateExpiration) {
        super(reference, nom, prix);
        this.dateExpiration = dateExpiration;
    }

    @Override
    public double calculerPrixFinal() {
        return getPrix();
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Expiration: " + dateExpiration;
    }
}