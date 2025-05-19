package fr.diginamic.geoff.patterns.behavioral.strategy;

import org.junit.jupiter.api.Test;

import java.util.Random;

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
        Integer[] bubbleArray = array.clone();
        bubbleSort.exec(bubbleArray);
        
        // Insertion Sort
        Integer[] insertionArray = array.clone();
        insertionSort.exec(insertionArray);
        
        // Selection Sort
        Integer[] selectionArray = array.clone();
        selectionSort.exec(selectionArray);
    }
}
