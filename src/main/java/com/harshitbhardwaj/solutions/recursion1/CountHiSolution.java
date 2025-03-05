package com.harshitbhardwaj.solutions.recursion1;

// https://codingbat.com/prob/p184029
public class CountHiSolution {

    /*
    Given a string, compute recursively (no loops) the number of times lowercase "hi" appears in the string.
    */
    public static int countHi(String str) {
        if (str.isEmpty()) {
            return 0;
        } else if (str.equals("hi")) {
            return 1;
        } else {
            return (str.startsWith("hi") ? 1 : 0) + countHi(str.substring(1));
        }
    }
}