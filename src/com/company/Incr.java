package com.company;

public class Incr {
    public static void main ( String[] args ) {
        int buf;
        int a[] = new int[] {1, 2, 3,4,5,6,7,8,9,2};

        for (int i =0; i<a.length; i++){
            System.out.println(a[i]);
        }
        System.out.println("\n");
        for (int j =0; j<a.length-1; j++){
            for (int i =0; i<a.length-j-1; i++){
              if (a[i]>a[i+1]) {
               buf = a[i];
               a[i] = a[i+1];
               a[i+1] = buf;
              }
            }
        }
        for (int i =0; i<a.length; i++){
            System.out.println(a[i]);
        }
    }
}
