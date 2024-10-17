package com.harshitbhardwaj.solutions.string1;

// https://codingbat.com/prob/p162477
public class TheEndSolution {

    /*
    Given a string, return a string length 1 from its front, unless front is false,
    in which case return a string length 1 from its back. The string will be non-empty.
    */
    public static String theEnd(String str, boolean front) {
        int len = str.length();
        return front ? str.substring(0, 1) : str.substring(len - 1);
        /*
        if (front) {
            return str.substring(0, 1); // eg. "H"
        } else {
            return str.substring(str.length() - 1);
        }
        */
    }
}