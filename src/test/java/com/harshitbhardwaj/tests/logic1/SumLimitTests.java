package com.harshitbhardwaj.tests.logic1;

import com.harshitbhardwaj.solutions.logic1.SumLimitSolution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SumLimitTests {
    
   /*
   sumLimit(2, 3) → 5
   sumLimit(8, 3) → 8
   sumLimit(8, 1) → 9
   */

    @Test
    public void sumLimitTestOne() {
        Assert.assertEquals(SumLimitSolution.sumLimit(2, 3), 5);
    }

    @Test
    public void sumLimitTestTwo() {
        Assert.assertEquals(SumLimitSolution.sumLimit(8, 3), 8);
    }

    @Test
    public void sumLimitTestThree() {
        Assert.assertEquals(SumLimitSolution.sumLimit(8, 1), 9);
    }
}