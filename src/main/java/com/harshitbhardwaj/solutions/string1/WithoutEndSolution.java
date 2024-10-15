package com.harshitbhardwaj.solutions.string1;

// https://codingbat.com/prob/p130896
public class WithoutEndSolution {

    /*
    Given a string, return a version without the first and last char, so "Hello" yields "ell".
    The string length will be at least 2.
    */
    public static String withoutEnd(String str) {
        int len = str.length();
        String result = str.substring(1, len - 1);
        return result;
    }
}