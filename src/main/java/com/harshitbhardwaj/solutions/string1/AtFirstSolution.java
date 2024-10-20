package com.harshitbhardwaj.solutions.string1;

// https://codingbat.com/prob/p139076
public class AtFirstSolution {

    /*
    Given a string, return a string length 2 made of its first 2 chars.
    If the string length is less than 2, use '@' for the missing chars.
    */
    public static String atFirst(String str) {
        int len = str.length();
        // Empty String
        if (len < 1) {
            return "@@";
        } else if (len == 1) {
            return str + "@";
        } else {
            return str.substring(0, 2);
        }
    }
}