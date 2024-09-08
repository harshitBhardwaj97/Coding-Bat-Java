package com.harshitbhardwaj.solutions.warmup1;

public class Makes10Solution {

    /*
    Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.
     */
    public static boolean makes10(int a, int b) {
        int sum = a + b;
        return a == 10 || b == 10 || sum == 10;
    }
}