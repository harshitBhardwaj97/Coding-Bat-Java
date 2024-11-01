package com.harshitbhardwaj.solutions.logic1;

// https://codingbat.com/prob/p118290
public class More20Solution {

    /*
    Return true if the given non-negative number is 1 or 2 more than a multiple of 20.
    */
    public static boolean more20(int n) {
        return n % 20 == 1 || n % 20 == 2;
        /*
        return (n - 1) % 20 == 0 || (n - 2) % 20 == 0;
        */
    }
}