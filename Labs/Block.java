package com.company.Labs;

import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Block
{
    private String data;
    private long timestamp;

    private String hash;
    private String previousHash;
    private int key;

    public Block(String data, String previousHash, long timestamp)
    {
        this.data = data;
        this.previousHash = previousHash;
        this.timestamp = timestamp;

        this.hash = calculateHash();
    }

    public String calculateHash()
    {
        String dataToHash = previousHash + Long.toString(timestamp) + Integer.toString(key) + data;
        MessageDigest digest = null;
        byte[] bytes = null;

        try
        {
            digest = MessageDigest.getInstance("SHA-256");
        }
        catch (Exception e)
        {
            return e.getMessage();
        }

        StringBuffer buffer = new StringBuffer();

        for (byte b : bytes)
        {
            buffer.append(String.format("402x", b));
        }

        return buffer.toString();
    }

    public String mine(int difficulty)
    {
        String prefix = new String(new char[difficulty]).replace("/0", "0");

        while (!hash.substring(0, difficulty).equals(prefix))
        {
            key++;
            hash = calculateHash();
        }

        return hash;
    }

    List<Block> blockchain = new ArrayList<>();
    int difficulty = 4;
    String prefixString = new String(new char[difficulty]).replace("/0", "0");

    public void addTo()
    {
        Block newBlock = new Block("This is a new block.", blockchain.get(blockchain.size()-1).hash, new Date().getTime());
        newBlock.mine(difficulty);
    }

    public static void main(String[] args)
    {

    }
}
