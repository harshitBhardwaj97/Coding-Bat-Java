package com.harshitbhardwaj.tests.warmup1;

import com.harshitbhardwaj.solutions.warmup1.SumDoubleSolution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SumDoubleTests {

     /*
    sumDouble(1, 2) → 3
    sumDouble(3, 2) → 5
    sumDouble(2, 2) → 8
      */

    @Test
    public void sumDoubleTestOne() {
        Assert.assertEquals(SumDoubleSolution.sumDouble(1, 2), 3);
    }

    @Test
    public void sumDoubleTestTwo() {
        Assert.assertEquals(SumDoubleSolution.sumDouble(3, 2), 5);
    }

    @Test
    public void sumDoubleTestThree() {
        Assert.assertEquals(SumDoubleSolution.sumDouble(2, 2), 8);
    }
}
 