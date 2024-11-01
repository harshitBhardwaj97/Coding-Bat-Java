package com.harshitbhardwaj.solutions.logic1;

// https://codingbat.com/prob/p159612
public class Old35Solution {

    /*
    Return true if the given non-negative number is a multiple of 3 or 5, but not both.
    */
    public static boolean old35(int n) {
        boolean nIsDivisibleBy3OR5 = n % 3 == 0 || n % 5 == 0;
        boolean nIsDivisibleByBoth3And5 = n % 15 == 0;
        return nIsDivisibleBy3OR5 && !nIsDivisibleByBoth3And5;
    }
}