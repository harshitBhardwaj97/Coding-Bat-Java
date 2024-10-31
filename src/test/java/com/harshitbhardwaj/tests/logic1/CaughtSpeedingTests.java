package com.harshitbhardwaj.tests.logic1;

import com.harshitbhardwaj.solutions.logic1.CaughtSpeedingSolution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CaughtSpeedingTests {
    
   /*
   caughtSpeeding(60, false) → 0
   caughtSpeeding(65, false) → 1
   caughtSpeeding(65, true) → 0
   */

    @Test
    public void caughtSpeedingTestOne() {
        Assert.assertEquals(CaughtSpeedingSolution.caughtSpeeding(60, false), 0);
    }

    @Test
    public void caughtSpeedingTestTwo() {
        Assert.assertEquals(CaughtSpeedingSolution.caughtSpeeding(65, false), 1);
    }

    @Test
    public void caughtSpeedingTestThree() {
        Assert.assertEquals(CaughtSpeedingSolution.caughtSpeeding(65, true), 0);
    }
}