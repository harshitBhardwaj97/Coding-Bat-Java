package com.harshitbhardwaj.solutions.recursion1;

// https://codingbat.com/prob/p154669
public class FactorialSolution {

    /*
    Given n of 1 or more, return the factorial of n, which is n * (n-1) * (n-2) ... 1.
    Compute the result recursively (without loops).
    */
    public static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException();
        } else if (n <= 1) {
            return n;
        } else {
            return n * factorial(n - 1);
        }
    }
}