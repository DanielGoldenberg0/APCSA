package com.company.Structures;

public class Stack
{
    private String[] backButton;
    private int size;
    private int top;

    public Stack()
    {
        size = 1000;
        backButton = new String[size];
        top = -1;
    }

    public String getURL(int i)
    {
        return backButton[i];
    }

    public boolean isEmpty()
    {
        return top == -1;
    }

    public boolean isFull()
    {
        return top == size - 1;
    }

    public void push(String url)
    {
        if (!isFull())
        {
            top++;
            System.out.println("You are going to" + url);
            backButton[top] = url;
        }
    }

    public String pop()
    {
        if (!isEmpty())
        {
            top--;
            return backButton[top];
        }

        return "Nothing in stack.";
    }
}
