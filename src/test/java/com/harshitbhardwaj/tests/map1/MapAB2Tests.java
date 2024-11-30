package com.harshitbhardwaj.tests.map1;

import com.harshitbhardwaj.solutions.map1.MapAB2Solution;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Map;

public class MapAB2Tests {
    
   /*
   mapAB2({"a": "aaa", "b": "aaa", "c": "cake"}) → {"c": "cake"}
   mapAB2({"a": "aaa", "b": "bbb"}) → {"a": "aaa", "b": "bbb"}
   mapAB2({"a": "aaa", "b": "bbb", "c": "aaa"}) → {"a": "aaa", "b": "bbb", "c": "aaa"}
   */

    @Test
    public void mapAB2TestOne() {
        Map<String, String> input = new java.util.HashMap<>
                (Map.of("a", "aaa", "b", "aaa", "c", "cake"));
        Map<String, String> expected = Map.of("c", "cake");
        Assert.assertEquals(MapAB2Solution.mapAB2(input), expected);
    }

    @Test
    public void mapAB2TestTwo() {
        Map<String, String> input = new java.util.HashMap<>(Map.of("a", "aaa", "b", "bbb"));
        Map<String, String> expected = Map.of("a", "aaa", "b", "bbb");
        Assert.assertEquals(MapAB2Solution.mapAB2(input), expected);
    }

    @Test
    public void mapAB2TestThree() {
        Map<String, String> input = new java.util.HashMap<>
                (Map.of("a", "aaa", "b", "bbb", "c", "aaa"));
        Map<String, String> expected = Map.of("a", "aaa", "b", "bbb", "c", "aaa");
        Assert.assertEquals(MapAB2Solution.mapAB2(input), expected);
    }
}