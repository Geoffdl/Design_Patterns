package fr.diginamic.geoff.patterns.behavioral.state;

/**
 * Commande state implementation : deliver
 */
public class CommandeLivraison extends CommandeEtatAbstract
{
    public CommandeLivraison(Commande commande)
    {
        super(commande);
    }
    
    @Override
    public void annuler()
    {
        throw new CommandeStateException(
              "Annulation impossible, la commande est déja en cours de livraison vers le: " + commande.getAdresseLivraison());
    }
}
