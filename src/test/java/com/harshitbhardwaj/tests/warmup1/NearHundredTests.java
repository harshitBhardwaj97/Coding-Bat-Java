package com.harshitbhardwaj.tests.warmup1;

import com.harshitbhardwaj.solutions.warmup1.NearHundredSolution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NearHundredTests {

     /*
    nearhundred(93) → true
    nearhundred(90) → true
    nearhundred(89) → false
      */

    @Test
    public void nearHundredTestOne() {
        Assert.assertEquals(NearHundredSolution.nearHundred(93), true);
    }

    @Test
    public void nearHundredTestTwo() {
        Assert.assertEquals(NearHundredSolution.nearHundred(90), true);
    }

    @Test
    public void nearHundredTestThree() {
        Assert.assertEquals(NearHundredSolution.nearHundred(89), false);
    }
}
 