package com.company.FRQs;

import java.util.ArrayList;

public class RandomStringChooser
{
    private ArrayList<String> words = new ArrayList<>();

    public RandomStringChooser() { }

    public RandomStringChooser(String[] words)
    {
        for (String w : words)
        {
            this.words.add(w);
        }
    }

    public String getNext()
    {
        if (words.size() == 0) return "NONE";

        int index =(int) (Math.random()*words.size());
        return words.remove(index);
    }

    public static void main(String[] args)
    {
        String[] wordArray = {"wheels", "on", "the", "bus"};
        RandomStringChooser stringChooser = new RandomStringChooser(wordArray);
        System.out.println(stringChooser.words);

        for (int i = 0; i < 10; i++)
        {
            System.out.println(stringChooser.getNext());
        }
    }
}
