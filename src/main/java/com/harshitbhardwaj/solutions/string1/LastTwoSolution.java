package com.harshitbhardwaj.solutions.string1;

// https://codingbat.com/prob/p194786
public class LastTwoSolution {

    /*
    Given a string of any length, return a new string where the last 2 chars,
    if present, are swapped, so "coding" yields "codign".
    */
    public static String lastTwo(String str) {
        int len = str.length();
        if (len < 2) {
            return str;
        } else if (len == 2) {
            return new StringBuilder(str).reverse().toString();
        } else {
            String front = str.substring(0, len - 2);
            String back = new StringBuilder(str.substring(len - 2)).reverse().toString();
            return front + back;
        }
    }
}