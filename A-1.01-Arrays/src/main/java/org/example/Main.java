package org.example;

public class Main {
    public static void main(String[] args) {
        // Long form
        double[] a; // Declaration
        a = new double[10]; // Creation
        for (int i = 0; i < a.length; i++) {
            a[i] = (double) i + 0.23; // Init
        }

        // Short form
        double[] b = new double[10];
        for (int i = 0; i < b.length; i++) {
            b[i] = (double) i + 0.23; // Init
        }

        // Initializing declaration
        int[] c = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < c.length; i++) {
        }

        // Arrays are assigned by reference.
        int[] d = c;
        // System.out.println(c[0]); // 0
        d[0] = 1000;
        // System.out.println(c[0]); // 1000

        // Two dimensional arrays.
        int[][] e = new int[10][10];
        // What is the content of created arrays without initializing values?
         for (int i = 0; i < e.length; i++) {
            for (int j = 0; j < e[0].length; j++) {
                // System.out.println(e[i][j]); // All zeroes.
            }
        }

        for (int i = 0; i < e.length; i++) {
            for (int j = 0; j < e[0].length; j++) {
                e[i][j] = i + j;
                // System.out.println(e[i][j]);
            }
        }

        // Finding the max value of an array.
        int[] f = {3, 6, 7, 0, 1, 3, 4, 900, 2, 3, -1, 901};
        int max = f[0];
        for (int i = 1; i < f.length; i++) {
            if (f[i] > max) max = f[i];
        }

        // Average of array f values:
        int sum = 0;
        int n = f.length;
        for (int i = 0; i < n; i++) {
            sum += f[i];
        }
        double avg = (((double) sum) / n);

        // Copy to another array
        n = f.length;
        int[] g = new int[n];
        for (int i = 0; i < n; i++) {
            g[i] = f[i];
        }

        // Reverse elements within an array
        int[] h = {3, 6, 7, 0, 1, 3, 4, 900, 2, 3, -1, 901, 13};
        for (int i = 0; i < h.length/2; i++) {
            int tmp = h[i];
            h[i] = h[h.length - 1 - i];
            h[h.length - 1 - i] = tmp;
        }

        // Matrix multiplication
        int[][] m = new int[5][5];
        int[][] p = new int[5][5];
        int[][] q = new int[5][5];
        int N = m.length;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                // Calculate dot product of row i and column j;
                for (int k = 0; k < N; k++) {
                    q[i][j] = m[i][k] * p[k][j];
                }
            }
        }
    }
}