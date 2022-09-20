package org.example;

public class Main {
    public static void main(String[] args) {
        // What is wrong with this code?
        // int[] a;
        // for (int i = 0; i < 10; i++)
        //     a[i] = i * i;

        // No memory allocations were made for the array.
        // This solves the problem.
        int[] a = new int[10]; // new allocates memory.
        for (int i = 0; i < 10; i++) {
            a[i] = i * i;
            System.out.println(a[i]);
        }
    }
}