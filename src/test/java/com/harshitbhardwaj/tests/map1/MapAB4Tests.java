package com.harshitbhardwaj.tests.map1;

import com.harshitbhardwaj.solutions.map1.MapAB4Solution;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Map;

public class MapAB4Tests {
    
   /*
   mapAB4({"a": "aaa", "b": "bb", "c": "cake"}) → {"a": "aaa", "b": "bb", "c": "aaa"}
   mapAB4({"a": "aa", "b": "bbb", "c": "cake"}) → {"a": "aa", "b": "bbb", "c": "bbb"}
   mapAB4({"a": "aa", "b": "bbb"}) → {"a": "aa", "b": "bbb", "c": "bbb"}
   */

    @Test
    public void mapAB4TestOne() {
        Map<String, String> input = new java.util.HashMap<>
                (Map.of("a", "aaa", "b", "bb", "c", "cake"));
        Map<String, String> expected = Map.of("a", "aaa", "b", "bb", "c", "aaa");
        Assert.assertEquals(MapAB4Solution.mapAB4(input), expected);
    }

    @Test
    public void mapAB4TestTwo() {
        Map<String, String> input = new java.util.HashMap<>
                (Map.of("a", "aa", "b", "bbb", "c", "cake"));
        Map<String, String> expected = Map.of("a", "aa", "b", "bbb", "c", "bbb");
        Assert.assertEquals(MapAB4Solution.mapAB4(input), expected);
    }

    @Test
    public void mapAB4TestThree() {
        Map<String, String> input = new java.util.HashMap<>
                (Map.of("a", "aa", "b", "bbb"));
        Map<String, String> expected = Map.of("a", "aa", "b", "bbb", "c", "bbb");
        Assert.assertEquals(MapAB4Solution.mapAB4(input), expected);
    }
}