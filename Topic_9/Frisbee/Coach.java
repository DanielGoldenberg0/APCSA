package com.company.Topic_9.Frisbee;

public class Coach extends Person
{
    private String role;

    public Coach(String first, String last, String role)
    {
        super(first, last);
        this.role = role;
    }

    public String toString()
    {
        return super.toString() +
                "\n   Role: " + role;
    }
}
