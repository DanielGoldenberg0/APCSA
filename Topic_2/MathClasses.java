package com.company.Topic_2;

import java.util.Scanner;
import java.lang.Math;

public class MathClasses
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter x: ");
        double x = input.nextDouble();

        System.out.print("Enter y: ");
        double y = input.nextDouble();

        Point p1 = new Point(0, 0);
        Point p2 = new Point(x, y);

        System.out.println("The distance is " + p2.getDistance(p1));
    }
}

class Point
{
    private double x;
    private double y;

    public Point(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public double getX()
    {
        return x;
    }

    public double getY()
    {
        return y;
    }

    public double getSlope(Point p)
    {
        return (p.getY() - y) / (p.getX() - x);
    }

    public double getDistance(Point p)
    {
        double deltaX = p.getX() - x;
        double deltaY = p.getY() - y;

        return Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));
    }
}
