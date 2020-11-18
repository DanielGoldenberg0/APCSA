package com.company.Topic_6;

public class Arrays
{
    public static void main(String[] args)
    {
        String[] foods = {"Pizza", "Potatoes", "Burger", "Salad", "Fries"};
        double[] prices = {11.99, 2.99, 6.99, 4.99, 3.99};
        int[] quantities = new int[5];
        quantities[0] = 2;
        quantities[1] = 12;
        quantities[2] = 5;
        quantities[3] = 3;
        quantities[4] = 5;

        for (int i = 0; i < foods.length; i++)
        {
            System.out.println(quantities[i] + " " + foods[i] + " " + prices[i]);
        }

        for (String f : foods)
        {
            System.out.println(f);
        }

        for (double p : prices)
        {
            System.out.println(p);
        }

        for (int q : quantities)
        {
            System.out.println(q);
        }
    }
}
