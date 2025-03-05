package com.harshitbhardwaj.tests.map2;

import com.harshitbhardwaj.solutions.map2.WordCountSolution;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Map;

public class WordCountTests {
    
   /*
   wordCount(["a", "b", "a", "c", "b"]) → {"a": 2, "b": 2, "c": 1}
   wordCount(["c", "b", "a"]) → {"a": 1, "b": 1, "c": 1}
   wordCount(["c", "c", "c", "c"]) → {"c": 4}
   */

    @Test
    public void WordCountSolutionTestOne() {
        String[] input = new String[]{"a", "b", "a", "c", "b"};
        Map<String, Integer> expected = Map.of("a", 2, "b", 2, "c", 1);
        Assert.assertEquals(WordCountSolution.wordCount(input), expected);
    }

    @Test
    public void WordCountSolutionTestTwo() {
        String[] input = new String[]{"c", "b", "a"};
        Map<String, Integer> expected = Map.of("a", 1, "b", 1, "c", 1);
        Assert.assertEquals(WordCountSolution.wordCount(input), expected);
    }

    @Test
    public void WordCountSolutionTestThree() {
        String[] input = new String[]{"c", "c", "c", "c"};
        Map<String, Integer> expected = Map.of("c", 4);
        Assert.assertEquals(WordCountSolution.wordCount(input), expected);
    }
}