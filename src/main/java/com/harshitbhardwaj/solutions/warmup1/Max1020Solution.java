package com.harshitbhardwaj.solutions.warmup1;

// https://codingbat.com/prob/p177372
public class Max1020Solution {

    /*
    Given 2 positive int values, return the larger value that is in the range 10..20 inclusive,
    or return 0 if neither is in that range.
     */
    public static int max1020(int a, int b) {
        // There are 4 possible cases
        // Case 1 : Both a and b lie in the range [10,20] -> return Math.max(a,b)
        if (isNumberIn1020Range(a) && isNumberIn1020Range(b)) {
            return Math.max(a, b);
        }

        // Case 2: Only a lies in the range [10,20] -> return a;
        else if (isNumberIn1020Range(a)) {
            return a;
        }

        // Case 3: Only b lies in the range [10,20] -> return b;
        else if (isNumberIn1020Range(b)) {
            return b;
        }

        // Case 4: Neither a nor b lies in the range [10,20] -> return 0;
        else {
            return 0;
        }
    }

    public static boolean isNumberIn1020Range(int num) {
        return num >= 10 && num <= 20;
    }
}