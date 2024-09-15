package com.harshitbhardwaj.solutions.warmup1;

public class HasTeenSolution {

    /*
    We'll say that a number is "teen" if it is in the range 13..19 inclusive.
    Given 3 int values, return true if 1 or more of them are teen.
     */
    public static boolean hasTeen(int a, int b, int c) {
        boolean isATeen = isTeen(a);
        boolean isBTeen = isTeen(b);
        boolean isCTeen = isTeen(c);
        return isATeen || isBTeen || isCTeen;
    }

    public static boolean isTeen(int number) {
        return number >= 13 && number <= 19;
    }
}