package com.harshitbhardwaj.tests.ap1;

import com.harshitbhardwaj.solutions.ap1.WordsFrontSolution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WordsFrontTests {
    
   /*
   wordsFront(["a", "b", "c", "d"], 1) → ["a"]
   wordsFront(["a", "b", "c", "d"], 2) → ["a", "b"]
   wordsFront(["a", "b", "c", "d"], 3) → ["a", "b", "c"]
   */

    @Test
    public void wordsFrontTestOne() {
        String[] input = new String[]{"a", "b", "c", "d"};
        String[] expected = new String[]{"a"};
        Assert.assertEquals(WordsFrontSolution.wordsFront(input, 1), expected);
    }

    @Test
    public void wordsFrontTestTwo() {
        String[] input = new String[]{"a", "b", "c", "d"};
        String[] expected = new String[]{"a", "b"};
        Assert.assertEquals(WordsFrontSolution.wordsFront(input, 2), expected);
    }

    @Test
    public void wordsFrontTestThree() {
        String[] input = new String[]{"a", "b", "c", "d"};
        String[] expected = new String[]{"a", "b", "c"};
        Assert.assertEquals(WordsFrontSolution.wordsFront(input, 3), expected);
    }
}