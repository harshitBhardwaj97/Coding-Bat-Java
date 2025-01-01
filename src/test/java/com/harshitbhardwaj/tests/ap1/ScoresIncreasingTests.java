package com.harshitbhardwaj.tests.ap1;

import com.harshitbhardwaj.solutions.ap1.ScoresIncreasingSolution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ScoresIncreasingTests {
    
   /*
   scoresIncreasing([1, 3, 4]) → true
   scoresIncreasing([1, 3, 2]) → false
   scoresIncreasing([1, 1, 4]) → true
   */

    @Test
    public void scoresIncreasingTestOne() {
        Assert.assertEquals(ScoresIncreasingSolution.scoresIncreasing(new int[]{1, 3, 4}), true);
    }

    @Test
    public void scoresIncreasingTestTwo() {
        Assert.assertEquals(ScoresIncreasingSolution.scoresIncreasing(new int[]{1, 3, 2}), false);
    }

    @Test
    public void scoresIncreasingTestThree() {
        Assert.assertEquals(ScoresIncreasingSolution.scoresIncreasing(new int[]{1, 1, 4}), true);
    }
}