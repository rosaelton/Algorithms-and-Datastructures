package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Calling a staticmethod
        int absValue = StaticMethods.abs(-35);
        System.out.println(absValue);
        double absDValue = StaticMethods.abs(-35.34d);
        System.out.println(absDValue);
        boolean maybePrime = StaticMethods.isPrime(11);
        System.out.println(maybePrime);
        System.out.println(StaticMethods.sqrt(10000));
        System.out.println(StaticMethods.hypotenuse(3, 4));
        System.out.println(StaticMethods.harmonic(500));

        // Arguments are passed by value;
        int y = 10;
        StaticMethods.plus5(y);
        System.out.println(y); // Y remains unchanged.

        // But Arrays are aliased.
        int[] a = {15, 13, 11, 14};
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}