package com.harshitbhardwaj.solutions.warmup1;

public class FrontBackSolution {

    /*
    Given a string, return a new string where the first and last chars have been exchanged.
     */
    public static String frontBack(String str) {
        // Possible lengths of the string -> 0,1 OR 2 OR >2
        int len = str.length();
        String result;

        if (len <= 1) {
            result = str;
        } else if (len == 2) {
            result = new StringBuilder(str).reverse().toString();
        } else {
            char firstChar = str.charAt(0);
            char lastChar = str.charAt(len - 1);
            String middle = str.substring(1, len - 1);
            result = lastChar + middle + firstChar;
        }
        return result;
    }
}