package com.harshitbhardwaj.solutions.warmup1;

public class NearHundredSolution {

    /*
    Given an int n, return true if it is within 10 of 100 or 200.
     */
    public static boolean nearHundred(int n) {
        int diffWithHundred = Math.abs(n - 100);
        int diffWithTwoHundred = Math.abs(n - 200);

        boolean isWithin10RangeForHundred = diffWithHundred <= 10;
        boolean isWithin10RangeForTwoHundred = diffWithTwoHundred <= 10;

        return isWithin10RangeForHundred || isWithin10RangeForTwoHundred;
    }
}