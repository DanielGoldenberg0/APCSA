package com.company.FRQs;

import java.util.ArrayList;
import java.util.List;

public class StringFormatter
{
    public static void main(String[] args)
    {
        ArrayList<Integer> nums = new ArrayList<Integer>();
    }

    public static int totalLetters(List<String> arr)
    {
        int total = 0;

        for (String s : arr)
        {
            total += s.length();
        }

        return total;
    }

    public static int basicGapWidth(List<String> arr, int formattedLen)
    {
        int totalLetters = totalLetters(arr);
        int emptyLetters = formattedLen - totalLetters;
        int gaps = arr.size() - 1;

        return emptyLetters / gaps;
    }

    public static String format(List<String> arr, int formattedLen)
    {
        String result = "";

        int spaces = basicGapWidth(arr, formattedLen);

        for (int i = 0; i < arr.size()-1; i++)
        {
            result += arr.get(i);

            for (int j = 0; j < spaces; j++)
            {
                result += "";
            }
        }

        result += arr.get(arr.size()-1);
        return result;
    }
}
