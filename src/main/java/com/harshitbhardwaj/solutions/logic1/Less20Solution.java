package com.harshitbhardwaj.solutions.logic1;

// https://codingbat.com/prob/p133158
public class Less20Solution {

    /*
    Return true if the given non-negative number is 1 or 2 less than a multiple of 20.
    So for example 38 and 39 return true, but 40 returns false.
    */
    public static boolean less20(int n) {
        return (n + 1) % 20 == 0 || (n + 2) % 20 == 0;
    }
}