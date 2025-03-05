package com.harshitbhardwaj.tests.map2;

import com.harshitbhardwaj.solutions.map2.WordAppendSolution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WordAppendTests {
    
   /*
   wordAppend(["a", "b", "a"]) → "a"
   wordAppend(["a", "b", "a", "c", "a", "d", "a"]) → "aa"
   wordAppend(["a", "", "a"]) → "a"
   */

    @Test
    public void WordAppendSolutionTestOne() {
        String[] input = new String[]{"a", "b", "a"};
        Assert.assertEquals(WordAppendSolution.wordAppend(input), "a");
    }

    @Test
    public void WordAppendSolutionTestTwo() {
        String[] input = new String[]{"a", "b", "a", "c", "a", "d", "a"};
        Assert.assertEquals(WordAppendSolution.wordAppend(input), "aa");
    }

    @Test
    public void WordAppendSolutionTestThree() {
        String[] input = new String[]{"a", "", "a"};
        Assert.assertEquals(WordAppendSolution.wordAppend(input), "a");
    }
}