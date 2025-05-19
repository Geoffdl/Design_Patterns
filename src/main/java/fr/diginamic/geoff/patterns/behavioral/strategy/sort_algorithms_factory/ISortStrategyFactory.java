package fr.diginamic.geoff.patterns.behavioral.strategy.sort_algorithms_factory;

import fr.diginamic.geoff.patterns.behavioral.strategy.ISortStrategy;
import fr.diginamic.geoff.patterns.behavioral.strategy.TypeSort;

/**
 * Factory interface for sort strategies
 */
public interface ISortStrategyFactory
{
    ISortStrategy getStrategy(TypeSort type);
}
