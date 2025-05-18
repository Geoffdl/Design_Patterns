package fr.diginamic.geoff.patterns.behavioral.state;

/**
 * Commande state implementation class - contains default output for each Commande actions
 */
public abstract class CommandeEtatAbstract implements CommandeEtat
{
    Commande commande;
    
    public CommandeEtatAbstract(Commande commande)
    {
        this.commande = commande;
    }
    
    /**
     * add a product
     * @param p product
     * @throws CommandeStateException if commande isn't in Creation state
     */
    @Override
    public void ajouterProduit(Produit p)
    {
        throw new CommandeStateException(
              "Action impossible dans cet état : " + commande.getEtat() + ", uniquement dans l'état CREATION");
    }
    
    /**
     * calculates current basket value and sets it to the commande
     * @throws CommandeStateException if commande isn't in Creation state
     */
    @Override
    public void payer()
    {
        throw new CommandeStateException(
              "Action impossible dans cet état : " + commande.getEtat() + ", uniquement dans l'état CREATION");
    }
    
    /**
     * Sets delivery address
     * @param adresse delivery address
     * @throws CommandeStateException if commande isn't in Paiement state
     */
    @Override
    public void livrer(String adresse)
    {
        throw new CommandeStateException(
              "Action impossible dans cet état : " + commande.getEtat() + ", uniquement dans l'état PAIEMENT");
    }
    
    /**
     * Cancel the order
     * @throws CommandeStateException if commande isn't in Creation or Paiement state
     */
    @Override
    public void annuler()
    {
        throw new CommandeStateException(
              "Action impossible dans cet état : " + commande.getEtat() + ", uniquement dans l'état CREATION et PAIEMENT");
    }
}
