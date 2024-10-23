package com.harshitbhardwaj.solutions.string1;

// https://codingbat.com/prob/p172063
public class ExtraFrontSolution {

    /*
    Given a string, return a new string made of 3 copies of the first 2 chars of the original string.
    The string may be any length. If there are fewer than 2 chars, use whatever is there.
    */
    public static String extraFront(String str) {
        int len = str.length();
        String front = len < 2 ? str : str.substring(0, 2);
        return front + front + front;
        /*
        if (len < 2) {
            return str + str + str;
        } else {
            String front = str.substring(0, 2);
            return front + front + front;
        }
        */
    }
}