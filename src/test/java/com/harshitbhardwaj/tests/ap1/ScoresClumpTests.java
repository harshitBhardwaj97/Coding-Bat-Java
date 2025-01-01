package com.harshitbhardwaj.tests.ap1;

import com.harshitbhardwaj.solutions.ap1.ScoresClumpSolution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ScoresClumpTests {
    
   /*
   scoresClump([3, 4, 5]) → true
   scoresClump([3, 4, 6]) → false
   scoresClump([1, 3, 5, 5]) → true
   */

    @Test
    public void scoresClumpTestOne() {
        Assert.assertEquals(ScoresClumpSolution.scoresClump(new int[]{3, 4, 5}), true);
    }

    @Test
    public void scoresClumpTestTwo() {
        Assert.assertEquals(ScoresClumpSolution.scoresClump(new int[]{3, 4, 6}), false);
    }

    @Test
    public void scoresClumpTestThree() {
        Assert.assertEquals(ScoresClumpSolution.scoresClump(new int[]{1, 3, 5, 5}), true);
    }
}