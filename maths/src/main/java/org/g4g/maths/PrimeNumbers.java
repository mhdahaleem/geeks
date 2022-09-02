package org.g4g.maths;

public class PrimeNumbers {

    public static void main(String[] args) {
        System.out.println(isPrimNaive(3533));
    }

    private static boolean isPrimNaive(int n) {
        if (n == 1)
            return false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static boolean isPrimNaiveE1(int n) {
        if (n == 1)
            return false;
        for (int i = 2; i * i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPrimNaiveE2(int n) {
        if (n == 1)
            return false;
        if (n == 2 || n == 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0)
            return false;
        for (int i = 5; i * i < n; i = i + 6) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
