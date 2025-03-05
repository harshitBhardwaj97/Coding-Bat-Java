package com.harshitbhardwaj.solutions.recursion1;

// https://codingbat.com/prob/p163932
public class SumDigitsSolution {

    /*
    Given a non-negative int n, return the sum of its digits recursively (no loops).
    Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6),
    while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
    */
    public static int sumDigits(int n) {
        if (n < 0) {
            throw new IllegalArgumentException();
        } else if (n >= 0 && n <= 9) {
            return n;
        } else {
            return (n % 10) + sumDigits(n / 10);
        }
    }
}