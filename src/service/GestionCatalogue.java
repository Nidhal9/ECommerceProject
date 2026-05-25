package service;

import model.Produit;

import java.util.*;

public class GestionCatalogue {

    private List<Produit> catalogue = new ArrayList<>();
    private Set<String> references = new HashSet<>();
    private Map<String, Produit> mapProduits = new HashMap<>();

    // Ajouter produit
    public void ajouterProduit(Produit p) {

        if (references.add(p.getReference())) {

            catalogue.add(p);
            mapProduits.put(p.getReference(), p);

            System.out.println("Produit ajouté.");
        } else {
            System.out.println("Produit déjà existant !");
        }
    }

    // Affichage
    public void afficherProduits() {

        for (Produit p : catalogue) {
            System.out.println(p);
        }
    }

    // Recherche
    public Produit rechercherParReference(String ref) {
        return mapProduits.get(ref);
    }

    // Suppression conditionnelle
    public void supprimerProduitCher(double prixLimite) {

        catalogue.removeIf(p -> p.getPrix() > prixLimite);
    }

    // Tri par prix
    public void trierParPrix() {

        catalogue.sort(Comparator.comparingDouble(Produit::getPrix));
    }

    // Tri par nom
    public void trierParNom() {

        catalogue.sort(Comparator.comparing(Produit::getNom));
    }

    // Statistique
    public Produit produitPlusCher() {

        return Collections.max(catalogue,
                Comparator.comparingDouble(Produit::getPrix));
    }

    public int nombreProduits() {
        return catalogue.size();
    }

    public List<Produit> getCatalogue() {
        return catalogue;
    }
}