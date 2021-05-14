package com.company.Topic_7;

import java.util.ArrayList;

public class SortAlgorithms
{
    public static void main(String[] args)
    {
        ArrayList<Integer> li = new ArrayList<>();
        populate(li, 1000000); // 1 million

        double startTime = System.currentTimeMillis();
        System.out.println(li);
        System.out.println(selectionSort(li));
        System.out.println(insertionSort(li));
        double endTime = System.currentTimeMillis();

        System.out.println("This took " + (endTime - startTime) + " miliseconds");
    }

    public static void populate(ArrayList<Integer> al, int n)
    {
        for (int i = 0; i < n; i++)
        {
            al.add((int) (Math.random() * 10) + 1);
        }
    }

    public static ArrayList<Integer> selectionSort(ArrayList<Integer> li)
    {
        for (int i = 0; i < li.size()-1; i++)
        {
            int smallestIndex = i;

            for (int j = i+1; j < li.size(); j++)
            {
                if (li.get(j) < li.get(smallestIndex))
                {
                    smallestIndex = j;
                }
            }

            int temp = li.get(i);
            li.set(i, li.get(smallestIndex));
            li.set(smallestIndex, temp);
        }

        return li;
    }

    public static ArrayList<Integer> insertionSort(ArrayList<Integer> li)
    {
        for (int i = 1; i < li.size(); i++)
        {
            int smallestElement = li.get(i);
            int indexOfComparison = i - 1;

            while (indexOfComparison >= 0 && li.get(indexOfComparison) > smallestElement)
            {
                li.set(indexOfComparison + 1, indexOfComparison);
                indexOfComparison--;
            }

            li.set(indexOfComparison + 1, smallestElement);
        }

        return li;
    }
}
