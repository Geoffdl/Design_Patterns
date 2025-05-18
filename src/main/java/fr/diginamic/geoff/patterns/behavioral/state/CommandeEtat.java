package fr.diginamic.geoff.patterns.behavioral.state;

/**
 * Commande state interface
 */
public interface CommandeEtat
{
    /**
     * add a product
     * @param p product
     * @throws CommandeStateException if commande isn't in Creation state
     */
    void ajouterProduit(Produit p);
    
    /**
     * calculates current basket value and sets it to the commande
     * @throws CommandeStateException if commande isn't in Creation state
     */
    void payer();
    
    /**
     * Sets delivery address
     * @param adresse delivery address
     * @throws CommandeStateException if commande isn't in Paiement state
     */
    void livrer(String adresse);
    
    /**
     * Cancel the order
     * @throws CommandeStateException if commande isn't in Creation or Paiement state
     */
    void annuler();
}
