package com.harshitbhardwaj.solutions.logic1;

// https://codingbat.com/prob/p137742
public class Love6Solution {

    /*
    The number 6 is a truly great number. Given two int values, a and b, return true if either one is 6.
    Or if their sum or difference is 6.
    */
    public static boolean love6(int a, int b) {
        int sum = a + b;
        int absDiff = Math.abs(a - b);
        return a == 6 || b == 6 || sum == 6 || absDiff == 6;
    }
}