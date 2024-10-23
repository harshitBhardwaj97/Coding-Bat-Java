package com.harshitbhardwaj.solutions.string1;

// https://codingbat.com/prob/p142247
public class Without2Solution {

    /*
    Given a string, if a length 2 substring appears at both its beginning and end, return a string
    without the substring at the beginning, so "HelloHe" yields "lloHe".
    The substring may overlap with itself, so "Hi" yields "". Otherwise, return the original string unchanged.
    */
    public static String without2(String str) {
        int len = str.length();
        if (len < 2) {
            return str;
        } else {
            boolean firstTwoAndLastTwoCharsMatch = str.substring(0, 2).equals(str.substring(len - 2));
            return firstTwoAndLastTwoCharsMatch ? str.substring(2) : str;
        }
    }
}