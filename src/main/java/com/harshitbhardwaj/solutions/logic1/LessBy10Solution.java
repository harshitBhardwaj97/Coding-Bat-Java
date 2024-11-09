package com.harshitbhardwaj.solutions.logic1;

// https://codingbat.com/prob/p179196
public class LessBy10Solution {

    /*
    Given three ints, a b c, return true if one of them is 10 or more less than one of the others.
    */
    public static boolean lessBy10(int a, int b, int c) {
        int abDiff = Math.abs(a - b);
        int bcDiff = Math.abs(b - c);
        int acDiff = Math.abs(a - c);
        return (abDiff >= 10 || bcDiff >= 10 || acDiff >= 10);
    }
}