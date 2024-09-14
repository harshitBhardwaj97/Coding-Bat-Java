package com.harshitbhardwaj.tests.warmup1;

import com.harshitbhardwaj.solutions.warmup1.IcyHotSolution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IcyHotTests {

     /*
     icyHot(120, -1) → true
     icyHot(-1, 120) → true
     icyHot(2, 120) → false
     */

    @Test
    public void icyHotTestOne() {
        Assert.assertEquals(IcyHotSolution.icyHot(120, -1), true);
    }

    @Test
    public void icyHotTestTwo() {
        Assert.assertEquals(IcyHotSolution.icyHot(-1, 120), true);
    }

    @Test
    public void icyHotTestThree() {
        Assert.assertEquals(IcyHotSolution.icyHot(2, 120), false);
    }
}