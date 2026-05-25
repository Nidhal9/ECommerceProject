import model.*;
import service.GestionCatalogue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {

        GestionCatalogue catalogue = new GestionCatalogue();

        // Produits
        Produit p1 = new ProduitElectronique(
                "E01", "PC Portable", 2500, 2);

        Produit p2 = new ProduitAlimentaire(
                "A01", "Chocolat", 10,
                "12/10/2026");

        Produit p3 = new ProduitElectronique(
                "E02", "Smartphone", 1800, 1);

        // Ajouter catalogue
        catalogue.ajouterProduit(p1);
        catalogue.ajouterProduit(p2);
        catalogue.ajouterProduit(p3);

        System.out.println("\n--- Catalogue ---");
        catalogue.afficherProduits();

        // Clients
        Client c1 = new Client(1, "Ali");
        Client c2 = new Client(2, "Sarra");

        // Commandes
        Commande cmd1 = new CommandeNormale(1001);
        cmd1.ajouterProduit(p1);
        cmd1.ajouterProduit(p2);

        Commande cmd2 = new CommandeExpress(1002);
        cmd2.ajouterProduit(p3);

        c1.ajouterCommande(cmd1);
        c2.ajouterCommande(cmd2);

        // Totaux
        System.out.println("\nTotal commande 1: "
                + cmd1.calculerTotal());

        System.out.println("Total commande 2: "
                + cmd2.calculerTotal());

        // Paiement
        cmd1.payer();
        cmd2.payer();

        // File d’attente
        Queue<Commande> fileAttente = new LinkedList<>();

        fileAttente.add(cmd1);
        fileAttente.add(cmd2);

        System.out.println("\n--- File commandes ---");

        while (!fileAttente.isEmpty()) {

            Commande c = fileAttente.poll();

            System.out.println(
                    "Commande traitée : "
                            + c.calculerTotal());
        }

        // Tri
        System.out.println("\n--- Tri par prix ---");

        catalogue.trierParPrix();

        catalogue.afficherProduits();

        // Statistiques
        System.out.println("\nNombre produits: "
                + catalogue.nombreProduits());

        System.out.println("Produit plus cher: "
                + catalogue.produitPlusCher());

        // Recherche
        System.out.println("\nRecherche E01:");
        System.out.println(
                catalogue.rechercherParReference("E01"));
    }
}