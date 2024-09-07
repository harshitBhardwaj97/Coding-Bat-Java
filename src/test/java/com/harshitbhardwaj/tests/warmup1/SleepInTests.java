package com.harshitbhardwaj.tests.warmup1;

import com.harshitbhardwaj.solutions.warmup1.SleepInSolution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SleepInTests {

    /*
    sleepIn(false, false) → true
    sleepIn(true, false) → false
    sleepIn(false, true) → true
     */

    @Test
    public void sleepInTestOne() {
        Assert.assertEquals(SleepInSolution.sleepIn(false, false), true);
    }

    @Test
    public void sleepInTestTwo() {
        Assert.assertEquals(SleepInSolution.sleepIn(true, false), false);
    }

    @Test
    public void sleepInTestThree() {
        Assert.assertEquals(SleepInSolution.sleepIn(false, true), true);
    }
}