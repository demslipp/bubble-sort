package com.company;

import java.util.Random;
import java.util.Scanner;

public class Randomizer {
    public static void main (String[] args) {
        int buf;
        System.out.println ("Write size of array: \n");
        Scanner r = new Scanner (System.in);
        int size = r.nextInt ();
        int[] a = new int[ size ];

        System.out.println ("Write range of array: \n");
        int maxsize = r.nextInt ();
        int minsize = r.nextInt ();

        if (maxsize < minsize) {
            buf = maxsize;
            maxsize = minsize;
            minsize = buf;
        }

        int dif = maxsize - minsize;
        Random rnd = new Random ();
        for (int i = 0; i < a.length; i++) {
            a[ i ] = rnd.nextInt (dif + 1) + minsize;

        }

        System.out.println ("\n");

        Array.sort (a);

    }
}
