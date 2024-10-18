package com.harshitbhardwaj.solutions.string1;

// https://codingbat.com/prob/p174148
public class NTwiceSolution {

    /*
    Given a string and an int n, return a string made of the first and last n chars from the string.
    The string length will be at least n.
    */
    public static String nTwice(String str, int n) {
        int len = str.length();
        String front = str.substring(0, n);
        String end = str.substring(len - n);
        return front + end;
    }
}