package model;

import java.util.ArrayList;
import java.util.List;

public abstract class Commande implements Payable {

    protected int numeroCommande;
    protected List<Produit> listeProduits;

    public Commande(int numeroCommande) {
        this.numeroCommande = numeroCommande;
        this.listeProduits = new ArrayList<>();
    }

    public void ajouterProduit(Produit p) {
        listeProduits.add(p);
    }

    public abstract double calculerTotal();

    @Override
    public void payer() {
        System.out.println("Paiement de la commande "
                + numeroCommande + " effectué.");
    }

    public List<Produit> getListeProduits() {
        return listeProduits;
    }
}