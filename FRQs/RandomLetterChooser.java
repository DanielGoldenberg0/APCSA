package com.company.FRQs;

public class RandomLetterChooser extends RandomStringChooser
{
    public RandomLetterChooser(String s)
    {
        super(getSingleLetters(s));
    }

    public static String[] getSingleLetters(String s)
    {
        String[] arr = new String[s.length()];

        for (int i = 0; i < s.length(); i++)
        {
            arr[i] = s.substring(i, i + 1);
        }

        return arr;
    }

    public static void main(String[] args)
    {
        RandomLetterChooser letterChooser = new RandomLetterChooser("Trump");

        for (int i = 0; i < 10; i++)
        {
            System.out.println(letterChooser.getNext());
        }
    }
}
