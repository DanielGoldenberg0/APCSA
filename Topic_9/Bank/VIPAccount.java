package com.company.Topic_9.Bank;

class VIPAccount extends Account
{
    private int points;

    public VIPAccount()
    {
        super();
        points = 1;
    }

    public VIPAccount(int i, double a, int p)
    {
        super(i, a);
        points = p;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int p) {
        points = p;
    }

    public boolean checkPoints(int cutoff)
    {
        if (this.points > cutoff)
        {
            return true;
        }

        return false;
    }

    public String toString()
    {
        return super.toString() + " with VIP Points of : " + points;
    }
}
