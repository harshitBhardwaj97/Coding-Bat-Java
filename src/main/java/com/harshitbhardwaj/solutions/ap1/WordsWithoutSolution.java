package com.harshitbhardwaj.solutions.ap1;

// https://codingbat.com/prob/p121236
public class WordsWithoutSolution {

    /*
    Given an array of strings, return a new array without the strings that are equal to the target string.
    One approach is to count the occurrences of the target string, make a new array of the correct length,
    and then copy over the correct strings.
    */
    public static String[] wordsWithout(String[] words, String target) {
        int count = 0;
        for (String word : words) {
            if (!word.equals(target)) count++;
        }

        String[] result = new String[count];
        int i = 0, j = 0;
        while (i < words.length && j < count) {
            if (!words[i].equals(target)) {
                result[j] = words[i];
                j++;
            }
            i++;
        }
        return result;
    }
}