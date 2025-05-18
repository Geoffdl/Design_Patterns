package fr.diginamic.geoff.patterns.behavioral.strategy;

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
