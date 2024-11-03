package com.harshitbhardwaj.solutions.logic1;

// https://codingbat.com/prob/p113261
public class TwoAsOneSolution {

    /*
    Given three ints, a b c, return true if it is possible to add two of the ints to get the third.
    */
    public static boolean twoAsOne(int a, int b, int c) {
        return (a + b == c) || (b + c == a) || (a + c == b);
    }
}