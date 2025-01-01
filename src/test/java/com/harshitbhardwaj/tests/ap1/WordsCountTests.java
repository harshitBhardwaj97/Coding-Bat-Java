package com.harshitbhardwaj.tests.ap1;

import com.harshitbhardwaj.solutions.ap1.WordsCountSolution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WordsCountTests {
    
   /*
   wordsCount(["a", "bb", "b", "ccc"], 1) → 2
   wordsCount(["a", "bb", "b", "ccc"], 3) → 1
   wordsCount(["a", "bb", "b", "ccc"], 4) → 0
   */

    @Test
    public void wordsCountTestOne() {
        String[] input = new String[]{"a", "bb", "b", "ccc"};
        Assert.assertEquals(WordsCountSolution.wordsCount(input, 1), 2);
    }

    @Test
    public void wordsCountTestTwo() {
        String[] input = new String[]{"a", "bb", "b", "ccc"};
        Assert.assertEquals(WordsCountSolution.wordsCount(input, 3), 1);
    }

    @Test
    public void wordsCountTestThree() {
        String[] input = new String[]{"a", "bb", "b", "ccc"};
        Assert.assertEquals(WordsCountSolution.wordsCount(input, 4), 0);
    }
}