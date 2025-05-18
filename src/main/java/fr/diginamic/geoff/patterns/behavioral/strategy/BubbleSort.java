package fr.diginamic.geoff.patterns.behavioral.strategy;

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
