package org.g4g.maths;

public class CountingDigitsInNumber {
    public static void main(String[] args) {
        System.out.println(countDigitsTraditional(54559995));
    }

    private static int countDigitsTraditional(int i) {
        int count = 0;
        while (i>0) {
            i=i/10;
            count++;
        }
        return count;
    }
}
