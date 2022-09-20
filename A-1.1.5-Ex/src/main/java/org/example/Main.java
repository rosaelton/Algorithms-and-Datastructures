package org.example;

public class Main {
    public static void main(String[] args) {
        double x = 0.234d;
        double y = 0.123d;
        if (0 < x && 0 < y && x < 1 && y < 1) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}