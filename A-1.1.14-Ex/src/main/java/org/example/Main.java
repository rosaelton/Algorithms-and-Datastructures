package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(lg(2));
    }

    public static int lg(int N) {
        int x = 0;
        for (int n = N; n > 1; n /= 2) x++;
        return x;
    }
}