package com.harshitbhardwaj.solutions.logic1;

// https://codingbat.com/prob/p115384
public class MaxMod5Solution {

    /*
    Given two int values, return whichever value is larger. However if the two values have the same
    remainder when divided by 5, then the return the smaller value.
    However, in all cases, if the two values are the same, return 0.
    */
    public static int maxMod5(int a, int b) {
        if (a == b) return 0;
        int aMod5 = a % 5, bMod5 = b % 5;
        return aMod5 == bMod5 ? Math.min(a, b) : Math.max(a, b);
    }
}