package org.g4g.maths;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactorials {
    public static void main(String[] args) {
        System.out.println(primeFactorialNaive(25522));
    }

    private static List primeFactorialNaive(int n) {
        List<Integer> result = new ArrayList<>();
        for (int i = 2; i < n; i++) {
            if (PrimeNumbers.isPrimNaiveE2(i)){
                int x =i;
                while (n % x== 0) {
                    result.add(i);
                    x= x*i;
                }
            }
        }
        return result;
    }
}
