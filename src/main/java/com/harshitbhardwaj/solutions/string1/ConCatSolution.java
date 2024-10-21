package com.harshitbhardwaj.solutions.string1;

// https://codingbat.com/prob/p132118
public class ConCatSolution {

    /*
    Given two strings, append them together (known as "concatenation") and return the result.
    However, if the concatenation creates a double-char, then omit one of the chars,
    so "abc" and "cat" yields "abcat".
    */
    public static String conCat(String a, String b) {
        int aLen = a.length(), bLen = b.length();
        // Check for the overlapping case
        if (aLen > 0 && bLen > 0) {
            boolean doesOverlappingHappen = a.substring(aLen - 1).equals(b.substring(0, 1));
            return doesOverlappingHappen ? a + b.substring(1) : a + b;
        }
        return a + b;
    }
}