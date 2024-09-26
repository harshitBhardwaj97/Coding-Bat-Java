package com.harshitbhardwaj.solutions.warmup1;

// https://codingbat.com/prob/p125339
public class LastDigitSolution {

    /*
    Given two non-negative int values, return true if they have the same last digit, such as with 27 and 57.
     */
    public static boolean lastDigit(int a, int b) {
        int lastDigitOfA = a % 10;
        int lastDigitOfB = b % 10;
        return lastDigitOfA == lastDigitOfB;
    }
}