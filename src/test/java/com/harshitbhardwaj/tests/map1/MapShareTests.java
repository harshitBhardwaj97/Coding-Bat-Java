package com.harshitbhardwaj.tests.map1;

import com.harshitbhardwaj.solutions.map1.MapShareSolution;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Map;

public class MapShareTests {
    
   /*
   mapShare({"a": "aaa", "b": "bbb", "c": "ccc"}) → {"a": "aaa", "b": "aaa"}
   mapShare({"b": "xyz", "c": "ccc"}) → {"b": "xyz"}
   mapShare({"a": "aaa", "c": "meh", "d": "hi"}) → {"a": "aaa", "b": "aaa", "d": "hi"}
   */

    @Test
    public void mapShareTestOne() {
        Map<String, String> input = new java.util.HashMap<>
                (Map.of("a", "aaa", "b", "bbb", "c", "ccc"));
        Map<String, String> expected = Map.of("a", "aaa", "b", "aaa");
        Assert.assertEquals(MapShareSolution.mapShare(input), expected);
    }

    @Test
    public void mapShareTestTwo() {
        Map<String, String> input = new java.util.HashMap<>(Map.of("b", "xyz", "c", "ccc"));
        Map<String, String> expected = Map.of("b", "xyz");
        Assert.assertEquals(MapShareSolution.mapShare(input), expected);
    }

    @Test
    public void mapShareTestThree() {
        Map<String, String> input = new java.util.HashMap<>
                (Map.of("a", "aaa", "c", "meh", "d", "hi"));
        Map<String, String> expected = Map.of("a", "aaa", "b", "aaa", "d", "hi");
        Assert.assertEquals(MapShareSolution.mapShare(input), expected);
    }
}