package com.harshitbhardwaj.solutions.recursion1;

// https://codingbat.com/prob/p158888
public class PowerNSolution {

    /*
    Given base and n that are both 1 or more, compute recursively (no loops)
    the value of base to the n power, so powerN(3, 2) is 9 (3 squared).
    */
    public static int powerN(int base, int n) {
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return base;
        } else {
            return base * (powerN(base, n - 1));
        }
    }
}