package fr.diginamic.geoff.patterns.behavioral.strategy;

public class NoStrategyException extends RuntimeException
{
    public NoStrategyException(String message)
    {
        super(message);
    }
}
