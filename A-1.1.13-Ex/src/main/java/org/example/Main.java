package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2}, {3, 4}};
        printMatrix(matrix);
        matrix = transpose(matrix);
        printMatrix(matrix);
    }

    public static void printMatrix(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.println(m[i][j]);
            }
        }
    }
    public static int[][] transpose(int[][] a) {
        int[][] b = new int[a[0].length][a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
               b[j][i] = a[i][j];
            }
        }
        return b;
    }
}