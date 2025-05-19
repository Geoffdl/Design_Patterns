package fr.diginamic.geoff.patterns.behavioral.strategy;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertTrue;

class TriTest
{
    @Test
    public void compareTimeDifferenceBetweenSortingAlgorithms()
    {
        
        Tri bubbleSort = new Tri();
        bubbleSort.changeStrategy(TypeSort.BUBBLE);
        
        Tri insertionSort = new Tri();
        insertionSort.changeStrategy(TypeSort.INSERTION);
        
        Tri selectionSort = new Tri();
        selectionSort.changeStrategy(TypeSort.SELECTION);
        
        int n = 20_000;
        Random random = new Random();
        Integer[] array = new Integer[n];
        
        for (int i = 0; i < n; i++)
        {
            array[i] = random.nextInt();
        }
        
        // Bubble Sort
        Integer[] bubbleArray = Arrays.copyOf(array, n);
        bubbleSort.exec(bubbleArray);
        assertTrue(isSorted(bubbleArray));
        // Insertion Sort
        Integer[] insertionArray = Arrays.copyOf(array, n);
        insertionSort.exec(insertionArray);
        assertTrue(isSorted(insertionArray));
        // Selection Sort
        Integer[] selectionArray = Arrays.copyOf(array, n);
        selectionSort.exec(selectionArray);
        assertTrue(isSorted(selectionArray));
    }
    
    private static boolean isSorted(Integer[] array)
    {
        for (int i = 1; i < array.length; i++)
        {
            if (array[i - 1] > array[i])
            {
                return false;
            }
        }
        return true;
    }
}
