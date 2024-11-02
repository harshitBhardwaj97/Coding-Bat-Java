package com.harshitbhardwaj.solutions.logic1;

// https://codingbat.com/prob/p178728
public class TeenSumSolution {

    /*
    Given 2 ints, a and b, return their sum. However, "teen" values in the range 13..19 inclusive, are extra lucky.
    So if either value is a teen, just return 19.
    */
    public static int teenSum(int a, int b) {
        boolean isATeen = isTeen(a);
        boolean isBTeen = isTeen(b);
        return isATeen || isBTeen ? 19 : a + b;
    }

    public static boolean isTeen(int num) {
        return num >= 13 && num <= 19;
    }
}