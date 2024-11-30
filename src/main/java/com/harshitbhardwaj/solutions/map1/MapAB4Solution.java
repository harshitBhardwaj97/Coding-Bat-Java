package com.harshitbhardwaj.solutions.map1;

import java.util.Map;

// https://codingbat.com/prob/p136950
public class MapAB4Solution {

    /*
    Modify and return the given map as follows: if the keys "a" and "b" have values that have different lengths,
    then set "c" to have the longer value.
    If the values exist and have the same length, change them both to the empty string in the map.
    */
    public static Map<String, String> mapAB4(Map<String, String> map) {
        boolean bothAAndBKeysArePresent = map.containsKey("a") && map.containsKey("b");
        if (bothAAndBKeysArePresent && map.get("a").length() == map.get("b").length()) {
            map.replace("a", "");
            map.replace("b", "");
        }
        if (bothAAndBKeysArePresent && map.get("a").length() != map.get("b").length()) {
            int lengthOfAValue = map.get("a").length();
            int lengthOfBValue = map.get("b").length();
            String largerKey = lengthOfAValue > lengthOfBValue ? "a" : "b";
            map.put("c", map.get(largerKey));
        }
        return map;
    }
}