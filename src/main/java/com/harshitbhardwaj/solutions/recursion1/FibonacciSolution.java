package com.harshitbhardwaj.solutions.recursion1;

import java.util.HashMap;
import java.util.Map;

// https://codingbat.com/prob/p120015
public class FibonacciSolution {

    /*
    The fibonacci sequence is a famous bit of mathematics, and it happens to have a recursive definition. The first
    two values in the sequence are 0 and 1 (essentially 2 base cases). Each subsequent value is the sum of the
    previous two values, so the whole sequence is: 0, 1, 1, 2, 3, 5, 8, 13, 21 and so on.
    Define a recursive fibonacci(n) method that returns the nth fibonacci number,
    with n=0 representing the start of the sequence.
    */
    public static int fibonacci(int n) {
        Map<Integer, Integer> memo = new HashMap<>();
        if (n < 0) {
            throw new IllegalArgumentException();
        }
        if (n <= 1) {
            return n;
        }
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        int result = fibonacci(n - 1) + fibonacci(n - 2);
        memo.put(n, result);
        return result;
    }
}