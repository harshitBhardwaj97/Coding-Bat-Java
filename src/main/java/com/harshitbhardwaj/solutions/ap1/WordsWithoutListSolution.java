package com.harshitbhardwaj.solutions.ap1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// https://codingbat.com/prob/p183407
public class WordsWithoutListSolution {

    /*
    Given an array of strings, return a new List (e.g. an ArrayList) where all the strings of the given
    length are omitted. See wordsWithout() below which is more difficult because it uses arrays.
    */
    public static List<String> wordsWithoutList(String[] words, int len) {
        /* Approach - 1
        List<String> result = new ArrayList<>();
        for (String word : words) {
            if (word.length() != len) result.add(word);
        }
        return result;
        */

        /*
        Approach - 2
        */
        return Arrays.stream(words).filter(word -> word.length() != len).collect(Collectors.toList());
    }
}