package com.harshitbhardwaj.solutions.string1;

// https://codingbat.com/prob/p130781
public class Right2Solution {

    /*
    Given a string, return a "rotated right 2" version where the last 2 chars are moved to the start.
    The string length will be at least 2.
    */
    public static String right2(String str) {
        int len = str.length();
        String last2 = str.substring(len - 2);
        String remaining = str.substring(0, len - 2);
        return last2 + remaining;
    }
}