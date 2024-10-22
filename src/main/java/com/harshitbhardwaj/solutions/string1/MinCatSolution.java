package com.harshitbhardwaj.solutions.string1;

// https://codingbat.com/prob/p105745
public class MinCatSolution {

    /*
    Given two strings, append them together (known as "concatenation") and return the result.
    However, if the strings are different lengths, omit chars from the longer string,
    so it is the same length as the shorter string.
    So "Hello" and "Hi" yield "loHi". The strings may be any length.
    */
    public static String minCat(String a, String b) {
        int aLen = a.length(), bLen = b.length();
        if (aLen == bLen) {
            return a + b;
        } else if (aLen > bLen) {
            // eg. a = Hello and b = Hi
            int diff = aLen - bLen;
            String front = a.substring(diff); // lo
            return front + b;
        } else {
            // eg. a = java and b = Hello
            int diff = bLen - aLen;
            String back = b.substring(diff);
            return a + back;
        }
    }
}