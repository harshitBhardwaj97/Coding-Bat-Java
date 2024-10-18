package com.harshitbhardwaj.solutions.string1;

// https://codingbat.com/prob/p137729
public class MiddleTwoSolution {

    /*
    Given a string of even length, return a string made of the middle two chars, so the string "string" yields "ri".
    The string length will be at least 2.
    */
    public static String middleTwo(String str) {
        int len = str.length();
        int midIndex = len / 2;
        return str.substring(midIndex - 1, midIndex + 1);
    }
}