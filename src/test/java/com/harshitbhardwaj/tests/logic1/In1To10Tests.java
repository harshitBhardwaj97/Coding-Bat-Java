package com.harshitbhardwaj.tests.logic1;

import com.harshitbhardwaj.solutions.logic1.In1To10Solution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class In1To10Tests {
    
   /*
   in1To10(5, false) → true
   in1To10(11, false) → false
   in1To10(11, true) → true
   */

    @Test
    public void in1to10TestOne() {
        Assert.assertEquals(In1To10Solution.in1To10(5, false), true);
    }

    @Test
    public void in1to10TestTwo() {
        Assert.assertEquals(In1To10Solution.in1To10(11, false), false);
    }

    @Test
    public void in1to10TestThree() {
        Assert.assertEquals(In1To10Solution.in1To10(11, true), true);
    }
}