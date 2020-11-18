package com.company.Topic_2;

public class Students
{
    public static void main(String[] args)
    {
        Student student1 = new Student("Daniel", false, 4.0);
        student1.print();

        System.out.println();

        Student student2 = new Student();
        student2.print();
    }
}

class Student
{
    private String name;
    private boolean gender;
    private double gpa;

    public Student() {}

    public Student(String name, boolean gender, double gpa)
    {
        this.name = name;
        this.gender = gender;
        this.gpa = gpa;
    }

    public String getName()
    {
        return name;
    }

    public boolean getGender()
    {
        return gender;
    }

    public double getGPA()
    {
        return gpa;
    }

    public void setString(String name)
    {
        this.name = name;
    }

    public void setGPA(double gpa)
    {
        this.gpa = gpa;
    }

    public String getGenderAsString()
    {
        if (gender)
        {
            return "Female";
        }

        return "Male";
    }

    public void print()
    {
        System.out.println("Name: " + getName() + "\nGender: " + getGenderAsString() + "\nGPA: " + getGPA());
    }
}
