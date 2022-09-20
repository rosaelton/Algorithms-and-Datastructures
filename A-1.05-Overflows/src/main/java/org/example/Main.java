package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(Math.abs(-2147483648));
        int overflow = 2147483647;
        System.out.println(overflow);
        overflow += 1;
        System.out.println(overflow);

        // Inifinities
        double positiveInfinity = Double.POSITIVE_INFINITY;
        double negativeInfinity = Double.NEGATIVE_INFINITY;

        System.out.println(1.0/0.0);
        System.out.println(1/0);
    }
}