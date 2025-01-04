package com.harshitbhardwaj.tests.ap1;

import com.harshitbhardwaj.solutions.ap1.WordsWithoutSolution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WordsWithoutTests {
    
   /*
   wordsWithout(["a", "b", "c", "a"], "a") → ["b", "c"]
   wordsWithout(["a", "b", "c", "a"], "b") → ["a", "c", "a"]
   wordsWithout(["a", "b", "c", "a"], "c") → ["a", "b", "a"]
   */

    @Test
    public void wordsWithoutTestOne() {
        String[] input = new String[]{"a", "b", "c", "a"};
        String target = "a";
        String[] expected = new String[]{"b", "c"};
        Assert.assertEquals(WordsWithoutSolution.wordsWithout(input, target), expected);
    }

    @Test
    public void wordsWithoutTestTwo() {
        String[] input = new String[]{"a", "b", "c", "a"};
        String target = "b";
        String[] expected = new String[]{"a", "c", "a"};
        Assert.assertEquals(WordsWithoutSolution.wordsWithout(input, target), expected);
    }

    @Test
    public void wordsWithoutTestThree() {
        String[] input = new String[]{"a", "b", "c", "a"};
        String target = "c";
        String[] expected = new String[]{"a", "b", "a"};
        Assert.assertEquals(WordsWithoutSolution.wordsWithout(input, target), expected);
    }
}