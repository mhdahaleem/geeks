package org.g4g.maths;

public class FactorialNumber {
    public static void main(String[] args) {
        System.out.println(factorialLoop(4));
        System.out.println(factorialRecursive(5));
        System.out.println(factorialTrailingZeroNaive(10));
        System.out.println(factorialTrailingZeroEffecient(10));
    }

    private static int factorialTrailingZeroEffecient(int n) {
        int res = 0;
        for (int i =5; i <n; i=i*5) {
            res = res + n/i;
        }
        return res;
    }

    private static int factorialTrailingZeroNaive(int n) {
        int fact = 1;
        int trailingzeros = 0;
        for (int i=2; i<=n; i++){
            fact = i*fact;
        }
        while (fact%10 == 0) {
            fact = fact/10;
            trailingzeros++;
        }
        return trailingzeros;
    }

    private static int factorialRecursive(int i) {
        if (i < 2) {
            return 1;
        }
        return i*factorialRecursive(i-1);
    }

    private static int factorialLoop(int n) {
        int res = 1;
        for (int i =2; i <= n;i++) {
            res = res*i;
        }
        return res;
    }

}
