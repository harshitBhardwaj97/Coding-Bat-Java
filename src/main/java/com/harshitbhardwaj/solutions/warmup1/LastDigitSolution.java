package com.harshitbhardwaj.solutions.warmup1;

public class LastDigitSolution {
    public static boolean lastDigit(int a, int b) {
        int lastDigitOfA = a % 10;
        int lastDigitOfB = b % 10;
        return lastDigitOfA == lastDigitOfB;
    }
}