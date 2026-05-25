package model;

public class CommandeNormale extends Commande {

    public CommandeNormale(int numeroCommande) {
        super(numeroCommande);
    }

    @Override
    public double calculerTotal() {

        double total = 0;

        for (Produit p : listeProduits) {
            total += p.calculerPrixFinal();
        }

        return total;
    }
}