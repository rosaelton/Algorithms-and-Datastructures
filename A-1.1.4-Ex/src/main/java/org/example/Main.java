package org.example;

public class Main {
    public static void main(String[] args) {
        int a = 34;
        int b = 34;
        int c = 22;
        // if (a > b) then c = 0; // Word then doesn't exist in java.
        // if a > b { c = 0; } // Missing parentheses.
        // if (a > b) c = 0; // Correct.
        // if (a > b) c = 0 else c = 1; // Missing ; after c = 0
    }
}