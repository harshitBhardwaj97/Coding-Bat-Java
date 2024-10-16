package com.harshitbhardwaj.solutions.string1;

// https://codingbat.com/prob/p143825
public class NonStartSolution {

    /*
    Given 2 strings, return their concatenation, except omit the first char of each.
    The strings will be at least length 1.
    */
    public static String nonStart(String a, String b) {
        String result = a.substring(1) + b.substring(1);
        return result;
    }
}