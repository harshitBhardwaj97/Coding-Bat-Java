package com.harshitbhardwaj.solutions.logic1;

// https://codingbat.com/prob/p169213
public class LastDigitSolution {

    /*
    Given three ints, a b c, return true if two or more of them have the same rightmost digit.
    The ints are non-negative.
    */
    public static boolean lastDigit(int a, int b, int c) {
        int lastDigitOfA = a % 10;
        int lastDigitOfB = b % 10;
        int lastDigitOfC = c % 10;
        return (lastDigitOfA == lastDigitOfB || lastDigitOfA == lastDigitOfC || lastDigitOfB == lastDigitOfC);
    }
}