package com.harshitbhardwaj.tests.ap1;

import com.harshitbhardwaj.solutions.ap1.BigHeightsSolution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BigHeightsTests {
    
   /*
   bigHeights([5, 3, 6, 7, 2], 2, 4) → 1
   bigHeights([5, 3, 6, 7, 2], 0, 1) → 0
   bigHeights([5, 3, 6, 7, 2], 0, 4) → 1
   */

    @Test
    public void bigHeightsTestOne() {
        int[] heights = new int[]{5, 3, 6, 7, 2};
        int start = 2, end = 4;
        Assert.assertEquals(BigHeightsSolution.bigHeights(heights, start, end), 1);
    }

    @Test
    public void bigHeightsTestTwo() {
        int[] heights = new int[]{5, 3, 6, 7, 2};
        int start = 0, end = 1;
        Assert.assertEquals(BigHeightsSolution.bigHeights(heights, start, end), 0);
    }

    @Test
    public void bigHeightsTestThree() {
        int[] heights = new int[]{5, 3, 6, 7, 2};
        int start = 0, end = 4;
        Assert.assertEquals(BigHeightsSolution.bigHeights(heights, start, end), 1);
    }
}