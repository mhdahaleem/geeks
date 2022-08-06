package org.g4g.maths;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrom(3633));
    }

    private static boolean isPalindrom(int l) {
        int rev = 0;
        int temp = l;
        while (temp != 0) {
            int ld = temp%10;
            rev = rev*10 + ld;
            temp = temp/10;
        }
        return rev == l;
    }
}
