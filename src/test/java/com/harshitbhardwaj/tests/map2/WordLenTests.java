package com.harshitbhardwaj.tests.map2;

import com.harshitbhardwaj.solutions.map2.WordLenSolution;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Map;

public class WordLenTests {
    
   /*
   wordLen(["a", "bb", "a", "bb"]) → {"bb": 2, "a": 1}
   wordLen(["this", "and", "that", "and"]) → {"that": 4, "and": 3, "this": 4}
   wordLen(["code", "code", "code", "bug"]) → {"code": 4, "bug": 3}
   */

    @Test
    public void WordLenSolutionTestOne() {
        String[] input = new String[]{"a", "bb", "a", "bb"};
        Map<String, Integer> expected = Map.of("a", 1, "bb", 2);
        Assert.assertEquals(WordLenSolution.wordLen(input), expected);
    }

    @Test
    public void WordLenSolutionTestTwo() {
        String[] input = new String[]{"this", "and", "that", "and"};
        Map<String, Integer> expected = Map.of("this", 4, "and", 3, "that", 4);
        Assert.assertEquals(WordLenSolution.wordLen(input), expected);
    }

    @Test
    public void WordLenSolutionTestThree() {
        String[] input = new String[]{"code", "code", "code", "bug"};
        Map<String, Integer> expected = Map.of("code", 4, "bug", 3);
        Assert.assertEquals(WordLenSolution.wordLen(input), expected);
    }
}