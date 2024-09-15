package com.harshitbhardwaj.solutions.warmup1;

public class In1020Solution {

    /*
    Given 2 int values, return true if either of them is in the range 10..20 inclusive.
     */
    public static boolean in1020(int a, int b) {
        boolean isAInTheGivenRange = isTheNumberInTheGivenRange(10, 20, a);
        boolean isBInTheGivenRange = isTheNumberInTheGivenRange(10, 20, b);
        return isAInTheGivenRange || isBInTheGivenRange;
    }

    public static boolean isTheNumberInTheGivenRange(int lower, int upper, int numberToBeChecked) {
        return numberToBeChecked >= lower && numberToBeChecked <= upper;
    }
}