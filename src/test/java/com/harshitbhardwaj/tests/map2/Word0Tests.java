package com.harshitbhardwaj.tests.map2;

import com.harshitbhardwaj.solutions.map2.Word0Solution;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Map;

public class Word0Tests {
    
   /*
   word0(["a", "b", "a", "b"]) → {"a": 0, "b": 0}
   word0(["a", "b", "a", "c", "b"]) → {"a": 0, "b": 0, "c": 0}
   word0(["c", "b", "a"]) → {"a": 0, "b": 0, "c": 0}
   */

    @Test
    public void Word0SolutionTestOne() {
        String[] input = new String[]{"a", "b", "a", "b"};
        Map<String, Integer> expected = Map.of("a", 0, "b", 0);
        Assert.assertEquals(Word0Solution.word0(input), expected);
    }

    @Test
    public void Word0SolutionTestTwo() {
        String[] input = new String[]{"a", "b", "a", "c", "b"};
        Map<String, Integer> expected = Map.of("a", 0, "b", 0, "c", 0);
        Assert.assertEquals(Word0Solution.word0(input), expected);
    }

    @Test
    public void Word0SolutionTestThree() {
        String[] input = new String[]{"c", "b", "a"};
        Map<String, Integer> expected = Map.of("a", 0, "b", 0, "c", 0);
        Assert.assertEquals(Word0Solution.word0(input), expected);
    }
}