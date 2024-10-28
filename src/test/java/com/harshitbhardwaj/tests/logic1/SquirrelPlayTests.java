package com.harshitbhardwaj.tests.logic1;

import com.harshitbhardwaj.solutions.logic1.SquirrelPlaySolution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SquirrelPlayTests {
    
   /*
    squirrelPlay(70, false) → true
    squirrelPlay(95, false) → false
    squirrelPlay(95, true) → true
   */

    @Test
    public void squirrelPlayTestOne() {
        Assert.assertEquals(SquirrelPlaySolution.squirrelPlay(70, false), true);
    }

    @Test
    public void squirrelPlayTestTwo() {
        Assert.assertEquals(SquirrelPlaySolution.squirrelPlay(95, false), false);
    }

    @Test
    public void squirrelPlayTestThree() {
        Assert.assertEquals(SquirrelPlaySolution.squirrelPlay(95, true), true);
    }
}