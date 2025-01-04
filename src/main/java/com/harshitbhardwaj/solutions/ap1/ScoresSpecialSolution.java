package com.harshitbhardwaj.solutions.ap1;

// https://codingbat.com/prob/p140485
public class ScoresSpecialSolution {

    /*
    Given two arrays, A and B, of non-negative int scores. A "special" score is one which is a multiple of 10,
    such as 40 or 90. Return the sum of largest special score in A and the largest special score in B.
    To practice decomposition, write a separate helper method which finds the largest special score in an array.
    Write your helper method after your scoresSpecial() method in the JavaBat text area.
    */
    public static int scoresSpecial(int[] a, int[] b) {
        return largestSpecialScore(a) + largestSpecialScore(b);
    }

    public static int largestSpecialScore(int[] arr) {
        int max = 0;
        for (int n : arr) {
            if (n % 10 == 0 && n > max) max = n;
        }
        return max;
    }
}