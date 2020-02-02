package com.company;

import java.util.Random;
import java.util.Scanner;

public class plus_random {
    public static void main (String[] args) {
        int buf;
        int n = 0;
        boolean s = false;
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

        while (! s) {
            s = true;


            for (int j = 0; j < a.length - 1; j++) {
                for (int i = 0; i < a.length - j - 1; i++) {
                    if (a[ i ] < a[ i + 1 ]) {
                        buf = a[ i ];
                        a[ i ] = a[ i + 1 ];
                        a[ i + 1 ] = buf;
                        s = false;
                        n++;

                        for (int value : a) {
                            System.out.print (value + " ");
                        }

                        System.out.println ("\n");
                    }
                }
            }

        }
        System.out.println ("Shifts: " + n);
        System.out.print ("Result: ");
        for (int value : a) {
            System.out.print (value + " ");
        }

    }
}
