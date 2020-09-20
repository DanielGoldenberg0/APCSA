package com.company;

import java.util.Scanner;

public class Strings
{
    public static void main(String[] args)
    {
        String name1 = "Daniel";
        String name2;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a name: ");
        name2 = input.nextLine();

        // Correct
        System.out.println(name1.equals(name2));

        // Incorrect
        System.out.println(name1 == name2);

        String text = "TikTok said it was \"disappointed\" in the order and disagreed with the commerce department, saying it had already committed to \"unprecedented levels of additional transparency\" in light of the Trump administration's concerns.\n" +
                "\"We will continue to challenge the unjust executive order, which was enacted without due process and threatens to deprive the American people and small businesses across the US of a significant platform for both a voice and livelihoods.\"\n" +
                "The ban order from the Department of Commerce follows President Trump's executive orders signed in August. It gave US businesses 45 days to stop working with either Chinese company.\n" +
                "If a planned partnership between US tech firm Oracle and TikTok owner ByteDance is agreed and approved by President Trump, the app will not be banned.\n" +
                "It is not yet clear whether Mr Trump will approve the deal, but he is expected to review it before the Sunday deadline.";

        System.out.println(text);

        int index = text.indexOf("If");
        String text2 = text.substring(index, 700);
        System.out.println("Substringed text: " + text2);

        int indexHalf = text.length() / 2;
        System.out.println("Half of the text is " + indexHalf);

        String rep = "Trump";
        String dem = "Biden";

        System.out.println("Is Trump mentioned: " + text.indexOf(rep));
        System.out.println("Is Biden mentioned: " + text.indexOf(dem));
    }
}
