package com.company.Structures;

public class Queue
{
    private int[] IPs;
    private int size;
    private int front;
    private int back;

    public Queue()
    {
        IPs = new int[500];
        front = -1;
        back = 0;
    }

    public void enqueue(int ip)
    {
        IPs[back] = ip;
        back++;
    }

    public int dequeue()
    {
        front++;
        return IPs[front];
    }
}
