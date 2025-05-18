package fr.diginamic.geoff.patterns.behavioral.state;

/**
 * Commande state implementation : cancel
 */
public class CommandeAnnuler extends CommandeEtatAbstract
{
    public CommandeAnnuler(Commande commande)
    {
        super(commande);
    }
    
    @Override
    public void annuler()
    {
        throw new CommandeStateException("La commande a déjà été annulée");
    }
}
