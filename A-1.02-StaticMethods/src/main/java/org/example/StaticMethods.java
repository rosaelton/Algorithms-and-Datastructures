package org.example;

public class StaticMethods {

    public static int abs(int x) {
        if (x < 0) return -x;
        return x;
    }

    // Overloading for doubles
    public static double abs(double x) {
        if (x < 0) return -x;
        return x;
    }

    public static boolean isPrime(int x) {
        if (x < 2) return false;
        for (int i = 2; i*i < x; i++) {
            if (x % i == 0) return false;
        }
        return true;
    }

    public static double sqrt(double c) {
        if (c < 0.0) return Double.NaN;
        double err = 1e-15;
        double t = c;
        while (abs(t - c/t) > err * t) {
            t = (c/t + t) / 2.0;
        }
        return t;
    }

    public static double hypotenuse(double a, double b) {
        return sqrt(a*a + b*b);
    }

    public static double harmonic(int x) {
        double sum = 0;
        for (int i = 0; i <= x; i++) {
            sum += 1.0 / x;
        }
        return sum;
    }

    public static void plus5(int x) {
        x += 5;
    }
}
