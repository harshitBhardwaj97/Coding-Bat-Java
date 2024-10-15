package com.harshitbhardwaj.solutions.string1;

// https://codingbat.com/prob/p172267
public class FirstHalfSolution {

    /*
    Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".
    */
    public static String firstHalf(String str) {
        int len = str.length();
        String half = str.substring(0, len / 2);
        return half;
    }
}