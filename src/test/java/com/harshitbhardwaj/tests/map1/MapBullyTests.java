package com.harshitbhardwaj.tests.map1;

import com.harshitbhardwaj.solutions.map1.MapBullySolution;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Map;

public class MapBullyTests {
    
   /*
   mapBully({"a": "candy", "b": "dirt"}) → {"a": "", "b": "candy"}
   mapBully({"a": "candy"}) → {"a": "", "b": "candy"}
   mapBully({"a": "candy", "b": "carrot", "c": "meh"}) → {"a": "", "b": "candy", "c": "meh"}
   */

    @Test
    public void mapBullyTestOne() {
        Map<String, String> input = new java.util.HashMap<>(Map.of("a", "candy", "b", "dirt"));
        Map<String, String> expected = Map.of("a", "", "b", "candy");
        Assert.assertEquals(MapBullySolution.mapBully(input), expected);
    }

    @Test
    public void mapBullyTestTwo() {
        Map<String, String> input = new java.util.HashMap<>(Map.of("a", "candy"));
        Map<String, String> expected = Map.of("a", "", "b", "candy");
        Assert.assertEquals(MapBullySolution.mapBully(input), expected);
    }

    @Test
    public void mapBullyTestThree() {
        Map<String, String> input = new java.util.HashMap<>
                (Map.of("a", "candy", "b", "carrot", "c", "meh"));
        Map<String, String> expected = Map.of("a", "", "b", "candy", "c", "meh");
        Assert.assertEquals(MapBullySolution.mapBully(input), expected);
    }
}