package fr.diginamic.geoff.patterns.behavioral.state;

/**
 * State implementation : create
 */
public class CommandeCreation extends CommandeEtatAbstract
{
    public CommandeCreation(Commande commande)
    {
        super(commande);
    }
    
    /**
     * Adds a product to commande
     * @param p product
     */
    @Override
    public void ajouterProduit(Produit p)
    {
        commande.getProduits().add(p);
    }
    
    /**
     * Sets basket value to the commande, changes state to Paiement
     */
    @Override
    public void payer()
    {
        //sum of the price for all products inside commande's list of products
        double total = commande.getProduits().stream().mapToDouble(Produit::getPrix).sum();
        commande.setMontant(total);
        
        commande.changeState(new CommandePaiement(commande));
    }
    
    /**
     * Sets state to Cancel
     */
    @Override
    public void annuler()
    {
        commande.changeState(new CommandeAnnuler(commande));
    }
}
