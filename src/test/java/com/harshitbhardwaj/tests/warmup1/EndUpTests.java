package com.harshitbhardwaj.tests.warmup1;

import com.harshitbhardwaj.solutions.warmup1.EndUpSolution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EndUpTests {

     /*
     endUp("Hello") → "HeLLO"
     endUp("hi there") → "hi thERE"
     endUp("hi") → "HI"
     */

    @Test
    public void endUpTestOne() {
        Assert.assertEquals(EndUpSolution.endUp("Hello"), "HeLLO");
    }

    @Test
    public void endUpTestTwo() {
        Assert.assertEquals(EndUpSolution.endUp("hi there"), "hi thERE");
    }

    @Test
    public void endUpTestThree() {
        Assert.assertEquals(EndUpSolution.endUp("hi"), "HI");
    }
}