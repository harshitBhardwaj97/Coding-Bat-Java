package com.harshitbhardwaj.tests.logic1;

import com.harshitbhardwaj.solutions.logic1.TwoAsOneSolution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TwoAsOneTests {
    
   /*
   twoAsOne(1, 2, 3) → true
   twoAsOne(3, 1, 2) → true
   twoAsOne(3, 2, 2) → false
   */

    @Test
    public void twoAsOneTestOne() {
        Assert.assertEquals(TwoAsOneSolution.twoAsOne(1, 2, 3), true);
    }

    @Test
    public void twoAsOneTestTwo() {
        Assert.assertEquals(TwoAsOneSolution.twoAsOne(3, 1, 2), true);
    }

    @Test
    public void twoAsOneTestThree() {
        Assert.assertEquals(TwoAsOneSolution.twoAsOne(3, 2, 2), false);
    }
}