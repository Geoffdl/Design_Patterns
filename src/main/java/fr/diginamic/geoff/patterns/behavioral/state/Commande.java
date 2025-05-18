package fr.diginamic.geoff.patterns.behavioral.state;

import java.util.ArrayList;
import java.util.List;

/**
 * Commande class
 */
public class Commande
{
    private double montant;
    private CommandeEtat etat;
    private List<Produit> produits = new ArrayList<>();
    private String adresseLivraison;
    
    /**
     * Instantiates an empty commande in creation state
     */
    public Commande()
    {
        this.etat = new CommandeCreation(this);
    }
    
    /**
     * Setter for etat
     * @param commandeEtat sets State
     * @visibility package -- only state manager should interact with the state
     */
    void changeState(CommandeEtat commandeEtat)
    {
        this.etat = commandeEtat;
    }
    
    public void ajouterProduit(Produit p)
    {
        this.etat.ajouterProduit(p);
    }
    
    public void payer()
    {
        this.etat.payer();
    }
    
    public void livrer(String adresse)
    {
        this.etat.livrer(adresse);
    }
    
    public void annuler()
    {
        this.etat.annuler();
    }
    
    /**
     * Getter
     * @return montant
     */
    public double getMontant()
    {
        return montant;
    }
    
    /**
     * Setter
     * @param montant sets value
     */
    public void setMontant(double montant)
    {
        this.montant = montant;
    }
    
    /**
     * Getter
     * @return etat
     */
    public CommandeEtat getEtat()
    {
        return etat;
    }
    
    /**
     * Getter
     * @return produits
     */
    public List<Produit> getProduits()
    {
        return produits;
    }
    
    /**
     * Setter
     * @param produits sets value
     */
    public void setProduits(List<Produit> produits)
    {
        this.produits = produits;
    }
    
    /**
     * Getter
     * @return adresseLivraison
     */
    public String getAdresseLivraison()
    {
        return adresseLivraison;
    }
    
    /**
     * Setter
     * @param adresseLivraison sets value
     */
    public void setAdresseLivraison(String adresseLivraison)
    {
        this.adresseLivraison = adresseLivraison;
    }
}
