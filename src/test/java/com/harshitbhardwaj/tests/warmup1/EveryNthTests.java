package com.harshitbhardwaj.tests.warmup1;

import com.harshitbhardwaj.solutions.warmup1.EveryNthSolution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EveryNthTests {

     /*
     everyNth("Miracle", 2) → "Mrce"
     everyNth("abcdefg", 2) → "aceg"
     everyNth("abcdefg", 3) → "adg"
     */

    @Test
    public void everyNthTestOne() {
        Assert.assertEquals(EveryNthSolution.everyNth("Miracle", 2), "Mrce");
    }

    @Test
    public void everyNthTestTwo() {
        Assert.assertEquals(EveryNthSolution.everyNth("abcdefg", 2), "aceg");
    }

    @Test
    public void everyNthTestThree() {
        Assert.assertEquals(EveryNthSolution.everyNth("abcdefg", 3), "adg");
    }
}