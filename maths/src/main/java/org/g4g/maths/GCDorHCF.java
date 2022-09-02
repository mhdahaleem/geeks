package org.g4g.maths;

public class GCDorHCF {
    public static void main(String[] args) {
        System.out.println(gcd(10, 15));
        System.out.println(gcdEucilieanAlgorithm(10, 15));
    }

    private static int gcdEucilieanAlgorithm(int a, int b) {
        if(b==0)
            return a;
        return gcd(b, a%b);
    }

    public static int gcd(int a, int b) {
        int res = Math.min(a, b);
        while (res != 1) {
            if (b % res == 0 && a % res == 0) {
                break;
            }
            res = res - 1;
        }
        return res;
    }

    public static int lcm(int a, int b) {
        int res = Math.max(a, b);
        while (true) {
            if (b % res == 0 && a % res == 0) {
                break;
            }
            res = res - 1;
        }
        return res;
    }

    public static int lcmEffective(int a, int b) {

        return (a*b)/gcd(a,b);
    }
}
