package com.harshitbhardwaj.solutions.string1;

// https://codingbat.com/prob/p196652
public class FrontAgainSolution {

    /*
    Given a string, return true if the first 2 chars in the string also appear
    at the end of the string, such as with "edited".
    */
    public static boolean frontAgain(String str) {
        int len = str.length();
        if (len < 2) {
            return false;
        } else {
            String front = str.substring(0, 2);
            String back = str.substring(len - 2);
            return front.equals(back);
        }
    }
}