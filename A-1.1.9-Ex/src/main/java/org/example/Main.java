package org.example;

public class Main {
    public static void main(String[] args) {
        int N = 7;
        // Solution
        String s = "";
        for (int n = N; n > 0; n /= 2){
            s = (n % 2) + s;
        }
        System.out.println(s);
    }
}