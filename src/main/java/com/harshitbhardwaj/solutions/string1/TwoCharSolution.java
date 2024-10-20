package com.harshitbhardwaj.solutions.string1;

// https://codingbat.com/prob/p144623
public class TwoCharSolution {

    /*
    Given a string and an index, return a string length 2 starting at the given index.
    If the index is too big or too small to define a string length 2, use the first 2 chars.
    The string length will be at least 2.
    */
    public static String twoChar(String str, int index) {
        int len = str.length();
        if (index < 0 || index > len - 2) {
            return str.substring(0, 2);
        }

        // Index lies in the valid range
        else {
            return str.substring(index, index + 2);
        }
    }
}