package com.harshitbhardwaj.tests.map1;

import com.harshitbhardwaj.solutions.map1.MapAB3Solution;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Map;

public class MapAB3Tests {
    
   /*
   mapAB3({"a": "aaa", "c": "cake"}) → {"a": "aaa", "b": "aaa", "c": "cake"}
   mapAB3({"b": "bbb", "c": "cake"}) → {"a": "bbb", "b": "bbb", "c": "cake"}
   mapAB3({"a": "aaa", "b": "bbb", "c": "cake"}) → {"a": "aaa", "b": "bbb", "c": "cake"}
   */

    @Test
    public void mapAB3TestOne() {
        Map<String, String> input = new java.util.HashMap<>(Map.of("a", "aaa", "c", "cake"));
        Map<String, String> expected = Map.of("a", "aaa", "b", "aaa", "c", "cake");
        Assert.assertEquals(MapAB3Solution.mapAB3(input), expected);
    }

    @Test
    public void mapAB3TestTwo() {
        Map<String, String> input = new java.util.HashMap<>(Map.of("b", "bbb", "c", "cake"));
        Map<String, String> expected = Map.of("a", "bbb", "b", "bbb", "c", "cake");
        Assert.assertEquals(MapAB3Solution.mapAB3(input), expected);
    }

    @Test
    public void mapAB3TestThree() {
        Map<String, String> input = new java.util.HashMap<>
                (Map.of("a", "aaa", "b", "bbb", "c", "cake"));
        Map<String, String> expected = Map.of("a", "aaa", "b", "bbb", "c", "cake");
        Assert.assertEquals(MapAB3Solution.mapAB3(input), expected);
    }
}