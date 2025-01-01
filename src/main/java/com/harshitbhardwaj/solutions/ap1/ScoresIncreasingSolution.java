package com.harshitbhardwaj.solutions.ap1;

// https://codingbat.com/prob/p146974
public class ScoresIncreasingSolution {

    /*
    Given an array of scores, return true if each score is equal or greater than the one before.
    The array will be length 2 or more.
    */
    public static boolean scoresIncreasing(int[] scores) {
        for (int i = 0; i < scores.length - 1; i++) {
            if (scores[i + 1] < scores[i]) return false;
        }
        return true;
    }
}