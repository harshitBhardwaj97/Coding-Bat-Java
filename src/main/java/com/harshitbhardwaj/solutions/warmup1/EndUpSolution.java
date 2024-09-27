package com.harshitbhardwaj.solutions.warmup1;

// https://codingbat.com/prob/p125268
public class EndUpSolution {

    /*
    Given a string, return a new string where the last 3 chars are now in upper case.
    If the string has less than 3 chars, uppercase whatever is there.
     */
    public static String endUp(String str) {
        int len = str.length();
        // In case, the length of str <=3, then simply return str.toUpperCase()
        if (len <= 3) {
            return str.toUpperCase();
        }

        // For strings having length >3
        else {
            int cutIndex = len - 3;
            String front = str.substring(0, cutIndex);
            String back = str.substring(cutIndex);
            return front + back.toUpperCase();
        }
    }
}