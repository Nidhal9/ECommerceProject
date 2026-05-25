package model;

public class ProduitElectronique extends Produit {

    private int garantie;

    public ProduitElectronique(String reference, String nom, double prix, int garantie) {
        super(reference, nom, prix);
        this.garantie = garantie;
    }

    @Override
    public double calculerPrixFinal() {
        return getPrix() + 50;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Garantie: " + garantie + " ans";
    }
}