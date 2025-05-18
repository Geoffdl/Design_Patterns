package fr.diginamic.geoff.patterns.behavioral.strategy;

public class Tri
{
    ISortStrategyFactory factory = new SortStrategyFactory();
    
    public void exec(int typeTri, Integer[] arr)
    {
        switch (typeTri)
        {
            case 1:
                factory.getSortStrategy(TypeSort.BUBBLE).sort(arr);
            case 2:
                factory.getSortStrategy(TypeSort.INSERTION).sort(arr);
            case 3:
                factory.getSortStrategy(TypeSort.SELECTION).sort(arr);
        }
    }
}
