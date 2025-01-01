package com.harshitbhardwaj.solutions.ap1;

// https://codingbat.com/prob/p183837
public class WordsFrontSolution {

    /*
    Given an array of strings, return a new array containing the first N strings. N will be in the range 1..length.
    */
    public static String[] wordsFront(String[] words, int n) {
        String[] result = new String[n];
        for (int i = 0; i < n; i++) {
            result[i] = words[i];
        }
        return result;
    }
}