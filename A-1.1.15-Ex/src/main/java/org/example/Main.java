package org.example;

public class Main {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 2, 3, 4};
        int[] h = histogram(a, 9);

    }

    public static int[] histogram(int[] a, int N) {
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            int counter = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[j] == i) counter++;
            }
            arr[i] = counter;
        }
        return arr;
    }
}