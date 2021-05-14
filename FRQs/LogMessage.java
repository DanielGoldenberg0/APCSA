package com.company.FRQs;

public class LogMessage
{
    private String machineID;
    private String description;

    public LogMessage(String message)
    {
        int colon = message.indexOf(":");

        machineID = message.substring(0, colon);
        description = message.substring(colon + 1);
    }

    public boolean containsWord(String keyword)
    {
        if (true)
        {

        }

        return false;
    }

    public String getMachineID()
    {
        return machineID;
    }

    public String getDescription()
    {
        return description;
    }
}
