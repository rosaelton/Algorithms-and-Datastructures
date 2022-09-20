package org.example;

public class Main {
    public static void main(String[] args) {
        int N = 10;
        int P = 10;
        boolean[][] boolMatrix = new boolean[N][P];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < P; j++) {
                boolMatrix[i][j] = ((i + j) % 2 == 0);
                String result = " ";
                if (boolMatrix[i][j]) {
                    result = "*";
                }
                System.out.println(i + ", " + j + ": " + result + ".");
            }
        }


    }
}