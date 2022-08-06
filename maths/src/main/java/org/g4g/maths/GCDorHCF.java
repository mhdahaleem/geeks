package org.g4g.maths;

public class GCDorHCF {
    public static void main(String[] args) {
        System.out.println(gcd(10,15));
    }

    public static int gcd(int a, int b) {
        int res=Math.min(a,b);
        while (res != 1)  {
            if (b%res == 0 && a%res==0) {
                break;
            }
            res = res - 1;
        }
        return res;
    }
}
