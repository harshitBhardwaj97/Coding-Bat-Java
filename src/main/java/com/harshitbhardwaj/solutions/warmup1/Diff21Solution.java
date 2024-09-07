package com.harshitbhardwaj.solutions.warmup1;

public class Diff21Solution {

    /*
    Given an int n, return the absolute difference between n and 21,
    except return double the absolute difference if n is over 21.
     */
    public static int diff21(int n) {
        return n > 21 ? 2 * Math.abs(n - 21) : Math.abs(n - 21);

        /*
        if (n > 21) {
            return 2 * Math.abs(n - 21);
        } else {
            return Math.abs(n - 21);
        }
        */
    }
}