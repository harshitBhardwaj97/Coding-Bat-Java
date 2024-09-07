package com.harshitbhardwaj.solutions.warmup1;

public class SumDoubleSolution {

    /*
    Given two int values, return their sum.
    Unless the two values are the same, then return double their sum.
     */
    public static int sumDouble(int a, int b) {
        return a == b ? 2 * (a + b) : (a + b);

        /*
        if (a == b) {
            return 2 * (a + b);
        } else {
            return a + b;
        }
        */
    }
}
 