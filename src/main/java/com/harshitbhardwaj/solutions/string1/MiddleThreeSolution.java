package com.harshitbhardwaj.solutions.string1;

// https://codingbat.com/prob/p115863
public class MiddleThreeSolution {

    /*
    Given a string of odd length, return the string length 3 from its middle, so "Candy" yields "and".
    The string length will be at least 3.
     */
    public static String middleThree(String str) {
        int len = str.length();
        int midIndex = len / 2;
        int startIndex = midIndex - 1;
        int endIndex = startIndex + 3;
        return str.substring(startIndex, endIndex);
    }
}