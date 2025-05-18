package fr.diginamic.geoff.patterns.behavioral.state;

/**
 * Commande state implementation : pay
 */
public class CommandePaiement extends CommandeEtatAbstract
{
    public CommandePaiement(Commande commande)
    {
        super(commande);
    }
    
    /**
     * Sets commande delivery adresse and changes state to Delivery
     * @param adresse delivery address
     */
    @Override
    public void livrer(String adresse)
    {
        commande.setAdresseLivraison(adresse);
        commande.changeState(new CommandeLivraison(commande));
    }
    
    /**
     * Sets commande state to cancel
     */
    @Override
    public void annuler()
    {
        commande.changeState(new CommandeAnnuler(commande));
    }
}
