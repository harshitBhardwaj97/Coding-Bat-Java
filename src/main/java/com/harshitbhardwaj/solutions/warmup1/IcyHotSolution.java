package com.harshitbhardwaj.solutions.warmup1;

public class IcyHotSolution {

    /*
    Given two temperatures, return true if one is less than 0 and the other is greater than 100.
     */
    public static boolean icyHot(int temp1, int temp2) {
        // Either temp1<0 and temp2>100 OR temp1>100 and temp2<0
        return (temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0);
    }
}