package com.harshitbhardwaj.tests.ap1;

import com.harshitbhardwaj.solutions.ap1.SumHeightsSolution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SumHeightsTests {
    
   /*
   sumHeights([5, 3, 6, 7, 2], 2, 4) → 6
   sumHeights([5, 3, 6, 7, 2], 0, 1) → 2
   sumHeights([5, 3, 6, 7, 2], 0, 4) → 11
   */

    @Test
    public void sumHeightsTestOne() {
        int[] heights = new int[]{5, 3, 6, 7, 2};
        int start = 2, end = 4;
        Assert.assertEquals(SumHeightsSolution.sumHeights(heights, start, end), 6);
    }

    @Test
    public void sumHeightsTestTwo() {
        int[] heights = new int[]{5, 3, 6, 7, 2};
        int start = 0, end = 1;
        Assert.assertEquals(SumHeightsSolution.sumHeights(heights, start, end), 2);
    }

    @Test
    public void sumHeightsTestThree() {
        int[] heights = new int[]{5, 3, 6, 7, 2};
        int start = 0, end = 4;
        Assert.assertEquals(SumHeightsSolution.sumHeights(heights, start, end), 11);
    }
}