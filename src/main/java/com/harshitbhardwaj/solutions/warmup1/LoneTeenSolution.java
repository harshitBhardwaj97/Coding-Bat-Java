package com.harshitbhardwaj.solutions.warmup1;

public class LoneTeenSolution {

    /*
    We'll say that a number is "teen" if it is in the range 13..19 inclusive.
    Given 2 int values, return true if one or the other is teen, but not both.
     */
    public static boolean loneTeen(int a, int b) {
        // Return true if 'a' is teen and 'b' is not a teen OR vice versa
        boolean isATeen = isTeen(a);
        boolean isBTeen = isTeen(b);
        // return (isATeen && !isBTeen) || (!isATeen && isBTeen);
        return isATeen ^ isBTeen;
    }

    public static boolean isTeen(int number) {
        return number >= 13 && number <= 19;
    }
}