package com.company.Labs;

import java.math.BigInteger;
import java.util.ArrayList;

public class RSAEncryption
{
    private int p;
    private int q;
    private int PUBLIC_KEY;
    private int phi;

    private ArrayList<Integer> publicKeys;
    private ArrayList<Integer> privateKeys;

    public RSAEncryption(int prime1, int prime2)
    {
        p = prime1;
        q = prime2;

        PUBLIC_KEY = p * q;
        phi = (p - 1) * (q - 1);
    }

    public static int gcf(int a, int b)
    {
        int gcf = 1;

        if (a % b == 0)
        {
            gcf = b;
        }
        else
        {
            gcf = gcf(b, a % b);
        }

        return gcf;
    }

    public ArrayList<Integer> possiblePublicKeys()
    {
        publicKeys = new ArrayList<Integer>();

        for (int i = 2; i < phi; i++)
        {
            int factor = gcf(phi, i);

            if (factor == 1)
            {
                publicKeys.add(i);
            }
        }

        return publicKeys;
    }

//    public static BigInteger encrypt(int msg, int publicKey)
//    {
//        return BigInteger.valueOf(msg);
//    }

    public static void main(String[] args)
    {
        RSAEncryption text = new RSAEncryption(5, 11);
        System.out.println("Public key modules: " + text.publicKeys);
        System.out.println("Possible public key modules: " + text.possiblePublicKeys());
    }
}