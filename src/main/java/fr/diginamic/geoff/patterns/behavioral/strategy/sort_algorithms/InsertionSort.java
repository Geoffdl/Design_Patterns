package fr.diginamic.geoff.patterns.behavioral.strategy.sort_algorithms;

import fr.diginamic.geoff.patterns.behavioral.strategy.ISortStrategy;

/**
 * Insertion sort Strategy
 * Time complexity: O(n^2) in the worst and average cases, O(n) in the best case (when the input array is already sorted)
 * Space complexity: O(1)
 * Basic idea: Build up a sorted subarray from left to right by inserting each new element into its correct position in the subarray. Repeat until the array is fully sorted.
 * Advantages: Simple implementation, works well for small datasets, requires only constant space, efficient for partially sorted datasets, stable sorting algorithm
 * Disadvantages: Inefficient for large datasets, worst-case time complexity of O(n^2)
 */
public class InsertionSort implements ISortStrategy
{
    @Override
    public void sort(Integer[] args)
    {
        for (int k = 1; k < args.length - 1; k++)
        {
            int temp = args[k];
            int j = k - 1;
            while (j >= 0 && temp <= args[j])
            {
                args[j + 1] = args[j];
                j = j - 1;
            }
            args[j + 1] = temp;
        }
    }
}
