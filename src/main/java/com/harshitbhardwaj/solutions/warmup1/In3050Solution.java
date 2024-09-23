package com.harshitbhardwaj.solutions.warmup1;

// https://codingbat.com/prob/p132134
public class In3050Solution {

    /*
    Given 2 int values, return true if they are both in the range 30..40 inclusive,
     or they are both in the range 40..50 inclusive.
     */
    public static boolean in3050(int a, int b) {
        // Return true if a and b are either in range [30,40] OR [40,50]
        boolean isAIn3040Range = isTheNumberInTheRange(30, 40, a);
        boolean isbIn3040Range = isTheNumberInTheRange(30, 40, b);
        boolean isAIn4050Range = isTheNumberInTheRange(40, 50, a);
        boolean isbIn4050Range = isTheNumberInTheRange(40, 50, b);
        return (isAIn3040Range && isbIn3040Range) || (isAIn4050Range && isbIn4050Range);
    }

    public static boolean isTheNumberInTheRange(int lower, int higher, int num) {
        return num >= lower && num <= higher;
    }
}