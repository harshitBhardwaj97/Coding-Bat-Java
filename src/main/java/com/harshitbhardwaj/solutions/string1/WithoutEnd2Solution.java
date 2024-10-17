package com.harshitbhardwaj.solutions.string1;

// https://codingbat.com/prob/p174254
public class WithoutEnd2Solution {

    /*
    Given a string, return a version without both the first and last char of the string.
    The string may be any length, including 0.
    */
    public static String withoutEnd2(String str) {
        int len = str.length();
        return len >= 2 ? str.substring(1, len - 1) : "";
       /*
        if (len >= 2) {
            return str.substring(1, len - 1);
        } else {
            return "";
        }
       */
    }
}