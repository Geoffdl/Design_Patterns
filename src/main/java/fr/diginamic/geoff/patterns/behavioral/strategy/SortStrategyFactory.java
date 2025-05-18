package fr.diginamic.geoff.patterns.behavioral.strategy;

public class SortStrategyFactory implements ISortStrategyFactory
{
    @Override
    public ISortStrategy getSortStrategy(TypeSort type)
    {
        switch (type)
        {
            case BUBBLE:
                return new BubbleSort();
            case INSERTION:
                return new InsertionSort();
            case SELECTION:
                return new SelectionSort();
        }
        
        throw new RuntimeException("not a valid sort type");
    }
}
