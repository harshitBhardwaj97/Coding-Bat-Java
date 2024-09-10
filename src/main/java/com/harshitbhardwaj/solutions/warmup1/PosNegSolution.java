package com.harshitbhardwaj.solutions.warmup1;

public class PosNegSolution {

    /*
    return true if one is negative and one is positive.
    Except if the parameter "negative" is true, then return true only if both are negative.
     */
    public static boolean posNeg(int a, int b, boolean negative) {
        return negative ? a < 0 && b < 0 : a * b < 0;

        /*if (negative) {
            return a < 0 && b < 0;
        } else {
            return (a < 0 && b > 0) || (a > 0 && b < 0);
            return a * b < 0;
        }*/
    }
}