package com.harshitbhardwaj.solutions.logic1;

// https://codingbat.com/prob/p140272
public class InOrderEqualSolution {

    /*
    Given three ints, a b c, return true if they are in strict increasing order, such as 2 5 11, or 5 6 7,
    but not 6 5 7 or 5 5 7. However, with the exception that if "equalOk" is true, equality is allowed,
    such as 5 5 7 or 5 5 5.
    */
    public static boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
        boolean areNumbersInAStrictlyIncreasingOrder = b > a && c > b;
        boolean areNumbersInIncreasingOrderOrEqual = b >= a && c >= b;
        return equalOk ? areNumbersInIncreasingOrderOrEqual : areNumbersInAStrictlyIncreasingOrder;
    }
}