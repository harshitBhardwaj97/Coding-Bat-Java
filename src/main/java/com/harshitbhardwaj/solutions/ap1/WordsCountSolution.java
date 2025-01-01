package com.harshitbhardwaj.solutions.ap1;

// https://codingbat.com/prob/p124620
public class WordsCountSolution {

    /*
    Given an array of strings, return the count of the number of strings with the given length.
    */
    public static int wordsCount(String[] words, int len) {
        int count = 0;
        for (String word : words) {
            if (word.length() == len) count++;
        }
        return count;
    }
}