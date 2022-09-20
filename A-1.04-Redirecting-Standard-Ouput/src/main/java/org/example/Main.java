package org.example;

public class Main {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        System.out.println((num1 + num2));

        // Redirecting standard output:
        // type java Main.java num1 num2 > file.txt
    }
}