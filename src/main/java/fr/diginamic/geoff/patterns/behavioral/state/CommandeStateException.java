package fr.diginamic.geoff.patterns.behavioral.state;

/**
 * State exception for Commande actions
 */
public class CommandeStateException extends IllegalStateException
{
    public CommandeStateException(String message)
    {
        super(message);
    }
}
