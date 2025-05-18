package fr.diginamic.geoff.patterns.behavioral.strategy;

public interface ISortStrategyFactory
{
    ISortStrategy getSortStrategy(TypeSort type);
}
