package fr.diginamic.geoff.patterns.behavioral.strategy;

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
