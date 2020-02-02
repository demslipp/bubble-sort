package com.company;

public class Incr {
    public static void main ( String[] args ) {
        int buf;
        int n = 0;
        boolean s = false;
        int[] a = new int[] {9,8,7,6,5,4,3,2,1,2,3,4,5,6,7,8,9,8,7,6,5,4,3,2,1,1,2,3,2,1,1,2,3,4,1};

        while(!s) {
            s = true;

            for (int i =0; i<a.length; i++){
                System.out.print(a[i]+", ");
            }

            System.out.println("\n");

            for (int j = 0; j < a.length - 1; j++) {
                for (int i = 0; i < a.length - 1; i++) {
                    if (a[i] > a[i + 1]){
                        buf = a[i];
                        a[i] = a[i + 1];
                        a[i + 1] = buf;
                        s=false;
                        n++;
                    }
                }
            }

            }
        System.out.println(n);
        System.out.print("Result: ");
        for (int i =0; i<a.length; i++){
            System.out.print(a[i]+", ");
        }

    }
}
