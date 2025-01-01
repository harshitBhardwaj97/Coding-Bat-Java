package com.harshitbhardwaj.solutions.ap1;

// https://codingbat.com/prob/p194530
public class ScoresClumpSolution {

    /*
    Given an array of scores sorted in increasing order, return true if the array contains 3 adjacent scores
    that differ from each other by at most 2, such as with {3, 4, 5} or {3, 5, 5}.
    */
    public static boolean scoresClump(int[] scores) {
        for (int i = 0; i < scores.length - 2; i++) {
            int acDiff = scores[i + 2] - scores[i];
            if (acDiff <= 2) return true;
        }
        return false;
    }
}