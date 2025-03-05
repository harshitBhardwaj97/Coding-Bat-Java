package com.harshitbhardwaj.solutions.recursion1;

// https://codingbat.com/prob/p101409
public class Count7Solution {

    /*
    Given a non-negative int n, return the count of the occurrences of 7 as a digit, so for example 717 yields 2.
    (no loops). Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6),
    while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
    */
    public static int count7(int n) {
        if (n < 0) {
            throw new IllegalArgumentException();
        } else if (n == 0) {
            return 0;
        } else if (n == 7) {
            return 1;
        } else {
            return (n % 10 == 7 ? 1 : 0) + count7(n / 10);
        }
    }
}