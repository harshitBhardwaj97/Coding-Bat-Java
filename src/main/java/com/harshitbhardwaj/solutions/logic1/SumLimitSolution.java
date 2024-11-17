package com.harshitbhardwaj.solutions.logic1;

// https://codingbat.com/prob/p118077
public class SumLimitSolution {

    /*
    Given 2 non-negative ints, a and b, return their sum, so long as the sum has the same number of digits as a.
    If the sum has more digits than a, just return a without b.
    */
    public static int sumLimit(int a, int b) {
        int sum = a + b;
        int numberOfDigitsOfSum = getNumberOfDigitsUsingStringValue(sum);
        int numberOfDigitsOfA = getNumberOfDigitsUsingStringValue(a);
        return numberOfDigitsOfSum > numberOfDigitsOfA ? a : sum;
    }

    public static int getNumberOfDigitsUsingLoop(int n) {
        if (n < 0) n = -n;
        if (n == 0) return 1;
        int numberOfDigits = 0;
        while (n > 0) {
            n /= 10;
            numberOfDigits++;
        }
        return numberOfDigits;
    }

    public static int getNumberOfDigitsUsingLog(int n) {
        if (n < 0) n = -n;
        if (n == 0) return 1;
        return (int) Math.log10(n) + 1;
    }

    public static int getNumberOfDigitsUsingStringValue(int n) {
        if (n < 0) n = -n;
        if (n == 0) return 1;
        return String.valueOf(n).length();
    }
}