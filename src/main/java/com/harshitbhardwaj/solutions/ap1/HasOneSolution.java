package com.harshitbhardwaj.solutions.ap1;

// https://codingbat.com/prob/p191212
public class HasOneSolution {

    /*
    Given a positive int n, return true if it contains a 1 digit.
    */
    public static boolean hasOne(int n) {
        /*
        Approach - 1
        return String.valueOf(n).indexOf("1") != -1;
        */

        /*
        Approach - 2
        */
        while (n > 0) {
            int rem = n % 10;
            if (rem == 1) {
                return true;
            }
            n /= 10;
        }
        return false;
    }
}