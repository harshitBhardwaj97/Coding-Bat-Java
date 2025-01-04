package com.harshitbhardwaj.tests.ap1;

import com.harshitbhardwaj.solutions.ap1.SumHeights2Solution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SumHeights2Tests {
    
   /*
   sumHeights2([5, 3, 6, 7, 2], 2, 4) → 7
   sumHeights2([5, 3, 6, 7, 2], 0, 1) → 2
   sumHeights2([5, 3, 6, 7, 2], 0, 4) → 15
   */

    @Test
    public void sumHeights2TestOne() {
        int[] heights = new int[]{5, 3, 6, 7, 2};
        int start = 2, end = 4;
        Assert.assertEquals(SumHeights2Solution.sumHeights2(heights, start, end), 7);
    }

    @Test
    public void sumHeights2TestTwo() {
        int[] heights = new int[]{5, 3, 6, 7, 2};
        int start = 0, end = 1;
        Assert.assertEquals(SumHeights2Solution.sumHeights2(heights, start, end), 2);
    }

    @Test
    public void sumHeights2TestThree() {
        int[] heights = new int[]{5, 3, 6, 7, 2};
        int start = 0, end = 4;
        Assert.assertEquals(SumHeights2Solution.sumHeights2(heights, start, end), 15);
    }
}