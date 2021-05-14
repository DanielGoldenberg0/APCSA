package com.company.Topic_6;

public class NumStatsArray
{
    private final double[] nums;

    public NumStatsArray(double[] a)
    {
        this.nums = a;
    }

    public String toString()
    {
        String s = "{";

        for (int i = 0; i < nums.length; i++)
        {
            s += nums[i];

            if (i != nums.length-1)
            {
                s += ", ";
            }
        }

        s += "}";

        return s;
    }

    public double average()
    {
        double sum = 0;

        for (int i = 0; i < nums.length; i++)
        {
            sum += nums[i];
        }

        return sum / nums.length;
    }

    public double range()
    {
        double largest = 0;
        double smallest = 0;

        for (double num : nums)
        {
            if (smallest > num)
            {
                smallest = num;
            }
        }

        for (double num : nums)
        {
            if (largest < num)
            {
                largest = num;
            }
        }

        return largest - smallest;
    }

    public int sortStatus()
    {
        boolean ascending = true;
        boolean descending = true;

        for (int i = 0; i < nums.length - 1; i++)
        {
            if (!(nums[i] > nums[i + 1]))
            {
                ascending = false;
            }
        }

        for (int i = 0; i < nums.length - 1; i++)
        {
            if (!(nums[i] <= nums[i + 1]))
            {
                descending = false;
            }
        }

        if (ascending = true)
        {
            return 1;
        }

        if (descending = true)
        {
            return -1;
        }

        return 0;
    }
}

class StringsStatsArray
{
    private final String[] words;

    public StringsStatsArray(String[] a)
    {
        this.words = a;
    }

    public String toString()
    {
        String s = "{";

        for (int i = 0; i < words.length; i++)
        {
            s += "\"";
            s += words[i] += "\"";

            if (i != words.length-1)
            {
                s += ", ";
            }
        }

        s += "}";

        return s;
    }

    public double averageLength()
    {
        double sum = 0;

        for (int i = 0; i < words.length; i++)
        {
            sum += words[i].length();
        }

        return sum / words.length;
    }

    public int search(String s)
    {
        for (int i = 0; i < words.length; i++)
        {
            if (words[i].equals(s))
            {
                return i;
            }
        }

        return -1;
    }

    public int sortStatus()
    {

        boolean ascending = true;
        boolean descending = true;

        for (int i = 0; i < words.length - 1; i++)
        {
            if (!(words[i].compareTo(words[i + 1]) > 0))
            {
                ascending = false;
            }
        }

        for (int i = 0; i < words.length - 1; i++)
        {
            if (!(words[i].compareTo(words[i + 1]) < 0))
            {
                descending = false;
            }
        }

        if (ascending = true)
        {
            return 1;
        }

        if (descending = true)
        {
            return -1;
        }

        return 0;
    }
}
