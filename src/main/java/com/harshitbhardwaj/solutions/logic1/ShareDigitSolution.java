package com.harshitbhardwaj.solutions.logic1;

// https://codingbat.com/prob/p153748
public class ShareDigitSolution {

    /*
    Given two ints, each in the range 10..99, return true if there is a digit that appears in both numbers,
    such as the 2 in 12 and 23.
    */
    public static boolean shareDigit(int a, int b) {
        int firstDigitOfA = a / 10;
        int firstDigitOfB = b / 10;
        int lastDigitOfA = a % 10;
        int lastDigitOfB = b % 10;

        return firstDigitOfA == firstDigitOfB || firstDigitOfA == lastDigitOfB
                || lastDigitOfA == firstDigitOfB || lastDigitOfA == lastDigitOfB;
    }
}