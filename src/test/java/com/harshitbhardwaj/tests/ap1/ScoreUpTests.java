package com.harshitbhardwaj.tests.ap1;

import com.harshitbhardwaj.solutions.ap1.ScoreUpSolution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ScoreUpTests {
    
   /*
   scoreUp(["a", "a", "b", "b"], ["a", "c", "b", "c"]) → 6
   scoreUp(["a", "a", "b", "b"], ["a", "a", "b", "c"]) → 11
   scoreUp(["a", "a", "b", "b"], ["a", "a", "b", "b"]) → 16
   */

    @Test
    public void scoreUpTestOne() {
        String[] key = new String[]{"a", "a", "b", "b"};
        String[] answers = new String[]{"a", "c", "b", "c"};
        Assert.assertEquals(ScoreUpSolution.scoreUp(key, answers), 6);
    }

    @Test
    public void scoreUpTestTwo() {
        String[] key = new String[]{"a", "a", "b", "b"};
        String[] answers = new String[]{"a", "a", "b", "c"};
        Assert.assertEquals(ScoreUpSolution.scoreUp(key, answers), 11);
    }

    @Test
    public void scoreUpTestThree() {
        String[] key = new String[]{"a", "a", "b", "b"};
        String[] answers = new String[]{"a", "a", "b", "b"};
        Assert.assertEquals(ScoreUpSolution.scoreUp(key, answers), 16);
    }
}