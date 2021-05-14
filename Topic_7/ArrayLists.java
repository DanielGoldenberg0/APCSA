package com.company.Topic_7;

import java.util.ArrayList;

public class ArrayLists
{
    public static void main(String[] args)
    {
        // Array
        double[] grades1 = new double[5];
        grades1[0] = 3.7;
        grades1[1] = 2.8;
        grades1[2] = 3.1;
        grades1[3] = 3.7;
        grades1[4] = 4.1;

        // Increase size of array
        double[] grades2 = new double[grades1.length+1];

        for (int i = 0; i < grades1.length; i++)
        {
            grades2[i] = grades2[i];
        }

        grades2[grades2.length-1] = 2.5;

        // ArrayList
        ArrayList<Double> grades3 = new ArrayList<Double>();

        for (int i = 0; i < grades2.length; i++)
        {
            grades3.add(grades2[i]);
        }

        grades3.remove(grades3.size()-1);

        System.out.println(grades3);

        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(1);
        nums.add(1);

        System.out.println(nums.hashCode());
    }
}
