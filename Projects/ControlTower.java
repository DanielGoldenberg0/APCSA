package com.company.Assignments;

import java.util.Scanner;
import java.lang.Math;

public class ControlTower
{
    public static void main(String[] args)
    {
        System.out.println("Enter the details of the second airplane (call-sign, distance, bearing and altitude):");

        Scanner input = new Scanner(System.in);

        String callSign = input.nextLine().toUpperCase();
        double distance = input.nextDouble();
        int direction = input.nextInt();
        int altitude = input.nextInt();

        Airplane plane1 = new Airplane();
        Airplane plane2 = new Airplane(callSign, distance, direction, altitude);

        int altDifference = Math.abs(plane1.getAlt() - plane2.getAlt());

        System.out.println();

        System.out.println("Initial Positions:");
        System.out.println("\"Airplane 1\": " + plane1.toString());
        System.out.println("\"Airplane 2\": " + plane2.toString());
        System.out.println("The distance between the planes is " + plane1.distTo(plane2) + " miles.");
        System.out.println("The difference in height between the planes is " + altDifference + " feet.");

        plane1.gainAlt();
        plane1.gainAlt();
        plane1.gainAlt();
        plane1.gainAlt();
        plane1.move(10.5, 50);

        plane2.loseAlt();
        plane2.loseAlt();
        plane2.move(8, 125);

        altDifference = Math.abs(plane1.getAlt() - plane2.getAlt());

        System.out.println();

        System.out.println("New Positions:");
        System.out.println("\"Airplane 1\": " + plane1.toString());
        System.out.println("\"Airplane 2\": " + plane2.toString());
        System.out.println("The distance between the planes iss " + plane1.distTo(plane2) + " miles.");
        System.out.println("The difference in height between the planes is " + altDifference + " feet.");
    }
}

class Airplane
{
    private String callSign;
    private double distance;
    private int direction;
    private int altitude;

    public Airplane(String callSign, double distance, int direction, int altitude)
    {
        this.callSign = callSign;
        this.distance = distance;
        this.direction = direction;
        this.altitude = altitude;
    }

    public Airplane()
    {
        this("AAA01", 1, 0, 0);
    }

    public void gainAlt()
    {
        altitude += 1000;
    }

    public void loseAlt()
    {
        altitude -= 1000;

        if (altitude < 0)
        {
            altitude = 0;
        }
    }

    public int getAlt()
    {
        return altitude;
    }

    public void move(double dist, int dir)
    {
        double r1 = distance;
        double r2 = dist;
        double u1 = Math.toRadians(direction);
        double u2 = Math.toRadians(dir);

        distance = Math.sqrt(r1 * r1 + r2 * r2 + 2 * r1 * r2 * Math.cos(u2-u1));
        double angle = Math.atan2(r1 * Math.sin(u1) + r2 * Math.sin(u2), r1 * Math.cos(u1) + r2 * Math.cos(u2));
        direction = Math.floorMod((int) Math.round(Math.toDegrees(angle)), 360);
    }

    public String toString()
    {
        String s = callSign + " - ";
        s += (double) Math.round(100 * distance) / 100;
        s += " miles away at bearing ";

        if (direction < 100)
        {
            s += "0";
        }

        s += "0";
        s += direction + "\u00b0, altitude " + altitude + " feet";

        return s;
    }

    public double distTo(Airplane other)
    {
        double r1 = this.distance;
        double r2 = other.distance;
        double u1 = Math.toRadians(this.direction);
        double u2 = Math.toRadians(other.direction);

        double between = Math.sqrt(r1 * r1 + r2 * r2 - 2 * r1 * r2 * Math.cos(u2 - u1));

        return (double) Math.round(100 * between) / 100;
    }
}
