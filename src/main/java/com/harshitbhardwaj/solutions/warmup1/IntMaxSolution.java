package com.harshitbhardwaj.solutions.warmup1;

// https://codingbat.com/prob/p101887
public class IntMaxSolution {

    /*
    Given three int values, a b c, return the largest.
     */
    public static int intMax(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
        /*
        if (a > b && a > c) {
            return a;
        } else if (b > a && b > c) {
            return b;
        } else {
            return c;
        }
         */
    }
}