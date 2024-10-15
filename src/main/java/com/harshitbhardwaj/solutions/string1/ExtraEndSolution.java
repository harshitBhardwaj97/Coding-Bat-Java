package com.harshitbhardwaj.solutions.string1;

// https://codingbat.com/prob/p108853
public class ExtraEndSolution {

    /*
    Given a string, return a new string made of 3 copies of the last 2 chars of the original string.
    The string length will be at least 2.
    */
    public static String extraEnd(String str) {
        String back = str.substring(str.length() - 2);
        return back + back + back;
    }
}