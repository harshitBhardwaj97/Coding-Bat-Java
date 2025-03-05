package com.harshitbhardwaj.tests.map2;

import com.harshitbhardwaj.solutions.map2.PairsSolution;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Map;

public class PairsTests {
    
   /*
   pairs(["code", "bug"]) → {"b": "g", "c": "e"}
   pairs(["man", "moon", "main"]) → {"m": "n"}
   pairs(["man", "moon", "good", "night"]) → {"g": "d", "m": "n", "n": "t"}
   */

    @Test
    public void PairsSolutionTestOne() {
        String[] input = new String[]{"code", "bug"};
        Map<String, String> expected = Map.of("b", "g", "c", "e");
        Map<String, String> result = PairsSolution.pairs(input);
        Assert.assertEquals(result, expected);
    }

    @Test
    public void PairsSolutionTestTwo() {
        String[] input = new String[]{"man", "moon", "main"};
        Map<String, String> expected = Map.of("m", "n");
        Map<String, String> result = PairsSolution.pairs(input);
        Assert.assertEquals(result, expected);
    }

    @Test
    public void PairsSolutionTestThree() {
        String[] input = new String[]{"man", "moon", "good", "night"};
        Map<String, String> expected = Map.of("g", "d", "m", "n", "n", "t");
        Map<String, String> result = PairsSolution.pairs(input);
        Assert.assertEquals(result, expected);
    }
}