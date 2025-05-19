package fr.diginamic.geoff.patterns.behavioral.strategy;

import fr.diginamic.geoff.patterns.behavioral.strategy.sort_algorithms_factory.SortStrategyFactory;

/**
 * Sorting calculation class, utilises a strategy pattern for the sorting algorithm and a factory pattern to generate the alternatives (bubble, insertion, selection)
 */
public class Tri
{
    private final SortStrategyFactory factory;
    private ISortStrategy sortStrategy;
    
    public Tri()
    {
        this.factory = new SortStrategyFactory();
    }
    
    /**
     * execute the sorting of an array
     * @param arr array of integers
     */
    public void exec(Integer[] arr)
    {
        if (sortStrategy == null)
        {
            throw new NoStrategyException("must set a strategy");
        }
        long startTime = System.currentTimeMillis();
        sortStrategy.sort(arr);
        long endTime = System.currentTimeMillis();
        System.out.println(sortStrategy.getClass().getSimpleName());
        System.out.println("Performance: " + (endTime - startTime) + " ms");
    }
    
    /**
     * Changes strategy for sorting algorithm
     * @param typeSort type of algorithm (bubble, insertion or selection)
     */
    public void changeStrategy(TypeSort typeSort)
    {
        this.sortStrategy = factory.getStrategy(typeSort);
    }
}
