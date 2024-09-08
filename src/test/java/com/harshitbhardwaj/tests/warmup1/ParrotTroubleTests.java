package com.harshitbhardwaj.tests.warmup1;

import com.harshitbhardwaj.solutions.warmup1.ParrotTroubleSolution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ParrotTroubleTests {

     /*
    parrotTrouble(true, 6) → true
    parrotTrouble(true, 7) → false
    parrotTrouble(false, 6) → false
      */

    @Test
    public void parrotTroubleTestOne() {
        Assert.assertEquals(ParrotTroubleSolution.parrotTrouble(true, 6), true);
    }

    @Test
    public void parrotTroubleTestTwo() {
        Assert.assertEquals(ParrotTroubleSolution.parrotTrouble(true, 7), false);
    }

    @Test
    public void parrotTroubleTestThree() {
        Assert.assertEquals(ParrotTroubleSolution.parrotTrouble(false, 6), false);
    }
}
 