package com.harshitbhardwaj.solutions.logic1;

// https://codingbat.com/prob/p193613
public class NearTenSolution {

    /*
    Given a non-negative number "num", return true if num is within 2 of a multiple of 10.
    */
    public static boolean nearTen(int num) {
        return (num % 10 >= 0 && num % 10 <= 2) || ((num + 1) % 10 == 0) || ((num + 2) % 10 == 0);
    }
}