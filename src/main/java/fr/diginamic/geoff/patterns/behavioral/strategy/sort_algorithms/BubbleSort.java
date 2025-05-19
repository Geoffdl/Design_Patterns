package fr.diginamic.geoff.patterns.behavioral.strategy.sort_algorithms;

import fr.diginamic.geoff.patterns.behavioral.strategy.ISortStrategy;

/**
 * Bubble sorting strategy
 * Time complexity: O(n^2) in the worst and average cases, O(n) in the best case (when the input array is already sorted)
 * Space complexity: O(1)
 * Basic idea: Iterate through the array repeatedly, comparing adjacent pairs of elements and swapping them if they are in the wrong order. Repeat until the array is fully sorted.
 * Advantages: Simple implementation, works well for small datasets, requires only constant space, stable sorting algorithm
 * Disadvantages: Inefficient for large datasets, worst-case time complexity of O(n^2), not optimal for partially sorted datasets
 */
public class BubbleSort implements ISortStrategy
{
    @Override
    public void sort(Integer[] args)
    {
        int n = args.length;
        for (int i = 0; i < n - 1; i++)
        {
            for (int j = 0; j < n - i - 1; j++)
            {
                if (args[j] > args[j + 1])
                {
                    int temp = args[j];
                    args[j] = args[j + 1];
                    args[j + 1] = temp;
                }
            }
        }
    }
}
