package com.company.Topic_7;

import java.util.ArrayList;

public class SearchAlgorithms
{
    public static void main(String[] args)
    {
        ArrayList<Integer> li = new ArrayList<>();
        populateInOrder(li, 10000000);

        double startTime = System.currentTimeMillis();
        System.out.println(binarySearch(li, 842));
        double endTime = System.currentTimeMillis();

        System.out.println("This took " + (endTime - startTime) + " miliseconds");
    }

    public static int getRandom(int min, int max)
    {
        int rand = (int) (Math.random() * (max - min) + min);

        return rand;
    }

    public static void populate(ArrayList<Integer> al, int n)
    {
        for (int i = 0; i < n; i++)
        {
            al.add((int) (Math.random() * 10000) + 1);
        }
    }

    public static void populateInOrder(ArrayList<Integer> al, int num)
    {
        num += 1;
        for (int i = 0; i < num; i++)
        {
            al.add(i);
        }
    }

    public static int linearSearch(ArrayList<Integer> li, int num)
    {
        for (int i = 0; i < li.size(); i++)
        {
            if (li.get(i) == num)
            {
                return i;
            }
        }

        return -1;
    }

    public static int binarySearch(ArrayList<Integer> li, int num)
    {
        int leftIndex = 0;
        int rightIndex = li.size()-1;

        while (leftIndex <= rightIndex)
        {
            int middleIndex = leftIndex + (rightIndex - leftIndex) / 2;

            if (li.get(middleIndex) == num)
            {
                return middleIndex;
            }
            else if (num > li.get(middleIndex))
            {
                leftIndex = middleIndex + 1;
            }
            else if (num < li.get(middleIndex))
            {
                rightIndex = middleIndex + 1;
            }
            else
            {
                rightIndex = middleIndex - 1;
            }
        }

        return -1;
    }
}
