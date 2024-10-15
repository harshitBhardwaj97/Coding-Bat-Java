package com.harshitbhardwaj.solutions.string1;

// https://codingbat.com/prob/p163411
public class FirstTwoSolution {

    /*
    Given a string, return the string made of its first two chars, so the String "Hello" yields "He".
    If the string is shorter than length 2, return whatever there is, so "X" yields "X",
    and the empty string "" yields the empty string "".
    */
    public static String firstTwo(String str) {
        int len = str.length();
        if (len <= 2) {
            return str;
        } else {
            String front = str.substring(0, 2);
            return front;
        }
    }
}