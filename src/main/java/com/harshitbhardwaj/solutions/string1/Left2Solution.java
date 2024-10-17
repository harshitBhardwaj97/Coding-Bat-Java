package com.harshitbhardwaj.solutions.string1;

// https://codingbat.com/prob/p197720
public class Left2Solution {

    /*
    Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end.
    The string length will be at least 2.
    */
    public static String left2(String str) {
        String front2 = str.substring(0, 2);
        String remaining = str.substring(2);
        return remaining + front2;
    }
}