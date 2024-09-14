package com.harshitbhardwaj.tests.warmup1;

import com.harshitbhardwaj.solutions.warmup1.StartHiSolution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class StartHiTests {

     /*
    startHi("hi there") → true
    startHi("hi") → true
    startHi("hello hi") → false
    */

    @Test
    public void startHiTestOne() {
        Assert.assertEquals(StartHiSolution.startHi("hi there"), true);
    }

    @Test
    public void startHiTestTwo() {
        Assert.assertEquals(StartHiSolution.startHi("hi"), true);
    }

    @Test
    public void startHiTestThree() {
        Assert.assertEquals(StartHiSolution.startHi("hello"), false);
    }
}