package com.harshitbhardwaj.tests.ap1;

import com.harshitbhardwaj.solutions.ap1.WordsWithoutListSolution;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class WordsWithoutListTests {
    
   /*
   wordsWithoutList(["a", "bb", "b", "ccc"], 1) → ["bb", "ccc"]
   wordsWithoutList(["a", "bb", "b", "ccc"], 3) → ["a", "bb", "b"]
   wordsWithoutList(["a", "bb", "b", "ccc"], 4) → ["a", "bb", "b", "ccc"]
   */

    @Test
    public void wordsWithoutListTestOne() {
        String[] input = new String[]{"a", "bb", "b", "ccc"};
        List<String> expected = List.of("bb", "ccc");
        Assert.assertEquals(WordsWithoutListSolution.wordsWithoutList(input, 1), expected);
    }

    @Test
    public void wordsWithoutListTestTwo() {
        String[] input = new String[]{"a", "bb", "b", "ccc"};
        List<String> expected = List.of("a", "bb", "b");
        Assert.assertEquals(WordsWithoutListSolution.wordsWithoutList(input, 3), expected);
    }

    @Test
    public void wordsWithoutListTestThree() {
        String[] input = new String[]{"a", "bb", "b", "ccc"};
        List<String> expected = List.of("a", "bb", "b", "ccc");
        Assert.assertEquals(WordsWithoutListSolution.wordsWithoutList(input, 4), expected);
    }
}