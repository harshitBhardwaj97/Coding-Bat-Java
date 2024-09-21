package com.harshitbhardwaj.solutions.warmup1;

public class Close10Solution {

    /*
    Given 2 int values, return whichever value is nearest to the value 10,
    or return 0 in the event of a tie.
     */
    public static int close10(int a, int b) {
        int aDiff = Math.abs(a - 10);
        int bDiff = Math.abs(b - 10);

        // Event of Tie
        if (aDiff == bDiff) return 0;

        return aDiff < bDiff ? a : b;
    }
}
 