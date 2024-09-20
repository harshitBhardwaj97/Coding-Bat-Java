package com.harshitbhardwaj.tests.warmup1;

import com.harshitbhardwaj.solutions.warmup1.StartOzSolution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class StartOzTests {

     /*
     startOz("ozymandias") → "oz"
     startOz("bzoo") → "z"
     startOz("oxx") → "o"
     */

    @Test
    public void startOzTestOne() {
        Assert.assertEquals(StartOzSolution.startOz("ozymandias"), "oz");
    }

    @Test
    public void startOzTestTwo() {
        Assert.assertEquals(StartOzSolution.startOz("bzoo"), "z");
    }

    @Test
    public void startOzTestThree() {
        Assert.assertEquals(StartOzSolution.startOz("oxx"), "o");
    }
}