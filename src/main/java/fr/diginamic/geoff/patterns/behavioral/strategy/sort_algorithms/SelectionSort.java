package fr.diginamic.geoff.patterns.behavioral.strategy.sort_algorithms;

import fr.diginamic.geoff.patterns.behavioral.strategy.ISortStrategy;

/**
 * SelectionSort strategy
 * Time complexity: O(n^2) in all cases (worst, average, and best)
 * Space complexity: O(1)
 * Basic idea: Find the minimum element in the unsorted portion of the array and swap it with the first unsorted element. Repeat until the array is fully sorted.
 * Advantages: Simple implementation, works well for small datasets, requires only constant space, in-place sorting algorithm
 * Disadvantages: Inefficient for large datasets, worst-case time complexity of O(n^2), not optimal for partially sorted datasets, not a stable sorting algorithm
 */
public class SelectionSort implements ISortStrategy
{
    @Override
    public void sort(Integer[] args)
    {
        for (int i = 0; i < args.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < args.length; j++)
            {
                if (args[j] < args[index])
                {
                    index = j;//searching for lowest index
                }
            }
            int smallerNumber = args[index];
            args[index] = args[i];
            args[i] = smallerNumber;
        }
    }
}
