package com.harshitbhardwaj.solutions.logic1;

// https://codingbat.com/prob/p137365
public class In1To10Solution {

    /*
    Given a number n, return true if n is in the range 1..10, inclusive. Unless outsideMode is true,
    in which case return true if the number is less or equal to 1, or greater or equal to 10.
    */
    public static boolean in1To10(int n, boolean outsideMode) {
        boolean isIn1To10Range = n >= 1 && n <= 10;
        boolean isOutside1To10Range = n <= 1 || n >= 10;
        return outsideMode ? isOutside1To10Range : isIn1To10Range;
    }
}