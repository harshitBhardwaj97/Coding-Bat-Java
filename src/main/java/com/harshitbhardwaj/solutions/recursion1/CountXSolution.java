package com.harshitbhardwaj.solutions.recursion1;

// https://codingbat.com/prob/p170371
public class CountXSolution {

    /*
    Given a string, compute recursively (no loops) the number of lowercase 'x' chars in the string.
    */
    public static int countX(String str) {
        if (str.isEmpty()) {
            return 0;
        } else if (str.equals("x")) {
            return 1;
        } else {
            return (str.charAt(0) == 'x' ? 1 : 0) + countX(str.substring(1));
        }
    }
}