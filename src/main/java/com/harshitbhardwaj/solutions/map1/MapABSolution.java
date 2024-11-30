package com.harshitbhardwaj.solutions.map1;

import java.util.Map;

// https://codingbat.com/prob/p107259
public class MapABSolution {

    /*
    Modify and return the given map as follows: for this problem the map may or may not contain the "a" and "b" keys.
    If both keys are present, append their 2 string values together and store the result under the key "ab".
    */
    public static Map<String, String> mapAB(Map<String, String> map) {
        boolean bothAAnbBKeysArePresent = map.containsKey("a") && map.containsKey("b");
        if (bothAAnbBKeysArePresent) {
            String value = map.get("a") + map.get("b");
            map.put("ab", value);
        }
        return map;
    }
}