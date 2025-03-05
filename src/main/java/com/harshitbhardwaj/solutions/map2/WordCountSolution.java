package com.harshitbhardwaj.solutions.map2;

import java.util.HashMap;
import java.util.Map;

// https://codingbat.com/prob/p117630
public class WordCountSolution {

    /*
    The classic word-count algorithm: given an array of strings, return a Map<String, Integer> with a key for each
    different string, with the value the number of times that string appears in the array.
    */
    public static Map<String, Integer> wordCount(String[] strings) {
        Map<String, Integer> result = new HashMap<>();
        for (String string : strings) {
            if (string != null && !result.containsKey(string)) {
                result.put(string, 1);
            } else {
                int currentCount = result.get(string);
                result.replace(string, ++currentCount);
            }
        }
        return result;
    }
}