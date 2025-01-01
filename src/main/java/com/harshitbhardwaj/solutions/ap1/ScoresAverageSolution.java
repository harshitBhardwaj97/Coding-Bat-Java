package com.harshitbhardwaj.solutions.ap1;

// https://codingbat.com/prob/p123837
public class ScoresAverageSolution {

    /*
    Given an array of scores, compute the int average of the first half and the second half,
    and return whichever is larger. We'll say that the second half begins at index length/2.
    The array length will be at least 2.
    */
    public static int scoresAverage(int[] scores) {
        int len = scores.length;
        int firstHalfStartIndex = 0;
        int firstHalfEndIndex = (len / 2) - 1;
        int secondHalfStartIndex = (len / 2);
        int secondHalfEndIndex = len - 1;
        
        int firstHalfAverage = average(scores, firstHalfStartIndex, firstHalfEndIndex);
        int secondHalfAverage = average(scores, secondHalfStartIndex, secondHalfEndIndex);
        return Math.max(firstHalfAverage, secondHalfAverage);
    }

    public static int average(int[] scores, int start, int end) {
        int sum = 0, windowSize = end - start + 1;
        for (int i = start; i <= end; i++) {
            sum += scores[i];
        }
        return sum / windowSize;
    }
}