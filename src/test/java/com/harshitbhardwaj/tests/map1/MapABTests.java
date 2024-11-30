package com.harshitbhardwaj.tests.map1;

import com.harshitbhardwaj.solutions.map1.MapABSolution;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Map;

public class MapABTests {
    
   /*
   mapAB({"a": "Hi", "b": "There"}) → {"a": "Hi", "ab": "HiThere", "b": "There"}
   mapAB({"a": "Hi"}) → {"a": "Hi"}
   mapAB({"b": "There"}) → {"b": "There"}
   */

    @Test
    public void mapABTestOne() {
        Map<String, String> input = new java.util.HashMap<>(Map.of("a", "Hi", "b", "There"));
        Map<String, String> expected = Map.of("a", "Hi", "ab", "HiThere", "b", "There");
        Assert.assertEquals(MapABSolution.mapAB(input), expected);
    }

    @Test
    public void mapABTestTwo() {
        Map<String, String> input = new java.util.HashMap<>(Map.of("a", "Hi"));
        Map<String, String> expected = Map.of("a", "Hi");
        Assert.assertEquals(MapABSolution.mapAB(input), expected);
    }

    @Test
    public void mapABTestThree() {
        Map<String, String> input = new java.util.HashMap<>(Map.of("b", "There"));
        Map<String, String> expected = Map.of("b", "There");
        Assert.assertEquals(MapABSolution.mapAB(input), expected);
    }
}