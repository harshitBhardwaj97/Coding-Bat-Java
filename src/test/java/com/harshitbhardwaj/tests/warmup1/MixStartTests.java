package com.harshitbhardwaj.tests.warmup1;

import com.harshitbhardwaj.solutions.warmup1.MixStartSolution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MixStartTests {

    /*
    mixStart("mix snacks") → true
    mixStart("pix snacks") → true
    mixStart("piz snacks") → false
    */

    @Test
    public void mixStartTestOne() {
        Assert.assertEquals(MixStartSolution.mixStart("mix snacks"), true);
    }

    @Test
    public void mixStartTestTwo() {
        Assert.assertEquals(MixStartSolution.mixStart("pix snacks"), true);
    }

    @Test
    public void mixStartTestThree() {
        Assert.assertEquals(MixStartSolution.mixStart("piz snacks"), false);
    }
}