package com.company.Topic_7;

import java.util.ArrayList;

public class ConcurrentModifications
{
    public static void main(String[] args)
    {
        ArrayList<String> students = new ArrayList<String>();

        students.add("Ben");
        students.add("Steve");
        students.add("Tim");
        students.add("Jordan");
        students.add(2, "Matt");

        for (String s : students)
        {
            System.out.println(s);
        }

        for (String s : students)
        {
            if (s.equals("Steve"))
            {
                students.remove(s);
            }
        }
    }
}
