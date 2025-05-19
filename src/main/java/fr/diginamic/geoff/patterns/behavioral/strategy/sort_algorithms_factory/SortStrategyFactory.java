package fr.diginamic.geoff.patterns.behavioral.strategy.sort_algorithms_factory;

import fr.diginamic.geoff.patterns.behavioral.strategy.ISortStrategy;
import fr.diginamic.geoff.patterns.behavioral.strategy.TypeSort;
import fr.diginamic.geoff.patterns.behavioral.strategy.sort_algorithms.BubbleSort;
import fr.diginamic.geoff.patterns.behavioral.strategy.sort_algorithms.InsertionSort;
import fr.diginamic.geoff.patterns.behavioral.strategy.sort_algorithms.SelectionSort;

/**
 * Factory impl for sort strategies
 */
public class SortStrategyFactory implements ISortStrategyFactory
{
    @Override
    public ISortStrategy getStrategy(TypeSort type)
    {
        return switch (type)
        {
            case BUBBLE -> new BubbleSort();
            case INSERTION -> new InsertionSort();
            case SELECTION -> new SelectionSort();
        };
    }
}
