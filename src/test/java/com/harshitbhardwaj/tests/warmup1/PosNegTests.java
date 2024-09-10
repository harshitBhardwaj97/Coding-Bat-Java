package com.harshitbhardwaj.tests.warmup1;

import com.harshitbhardwaj.solutions.warmup1.PosNegSolution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PosNegTests {

     /*
    posneg(1, -1, false) → true
    posneg(-1, 1, false) → true
    posneg(-4, -5, true) → true
      */

    @Test
    public void posNegTestOne() {
        Assert.assertEquals(PosNegSolution.posNeg(1, -1, false), true);
    }

    @Test
    public void posNegTestTwo() {
        Assert.assertEquals(PosNegSolution.posNeg(-1, 1, false), true);
    }

    @Test
    public void posNegTestThree() {
        Assert.assertEquals(PosNegSolution.posNeg(-4, -5, true), true);
    }
}