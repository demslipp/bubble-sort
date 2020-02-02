package com.company;

import java.util.Scanner;

public class Array {
    public static void main (String[] args) {

        System.out.println ("Write size of array: \n");
        Scanner r = new Scanner (System.in);
        int size = r.nextInt ();
        int[] a = new int[size];
        System.out.println ("Write the first number: \n");
        a[0] = r.nextInt ();
        for (int i = 1; i < a.length - 1; ++ i) {
            System.out.println ("Write next number: \n");
            a[i] = r.nextInt ();
        }
        System.out.println ("Write the last number: \n");
        a[size - 1] = r.nextInt ();

        System.out.println ("\n");

        sort(a);


    }

    public static void sort(int[] a){
        int buf;
        int n = 0;
        boolean s = false;
        while (! s) {
            s = true;

            for (int j = 0; j < a.length - 1; j++) {
                for (int i = 0; i < a.length - 1; i++) {
                    if (a[i] > a[i + 1]) {
                        buf = a[i];
                        a[i] = a[i + 1];
                        a[i + 1] = buf;
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
