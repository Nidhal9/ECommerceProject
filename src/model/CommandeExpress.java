package model;

public class CommandeExpress extends Commande {

    private static final double FRAIS_LIVRAISON = 20;

    public CommandeExpress(int numeroCommande) {
        super(numeroCommande);
    }

    @Override
    public double calculerTotal() {

        double total = 0;

        for (Produit p : listeProduits) {
            total += p.calculerPrixFinal();
        }

        return total + FRAIS_LIVRAISON;
    }
}