package com.harshitbhardwaj.solutions.map1;

import java.util.Map;

// https://codingbat.com/prob/p197888
public class MapBullySolution {

    /*
    Modify and return the given map as follows: if the key "a" has a value, set the key "b" to have that value,
    and set the key "a" to have the value "".
    Basically "b" is a bully, taking the value and replacing it with the empty string.
    */
    public static Map<String, String> mapBully(Map<String, String> map) {
        if (map.containsKey("a")) {
            map.put("b", map.get("a"));
            map.replace("a", "");
        }
        return map;
    }
}