package com.harshitbhardwaj.tests.warmup1;

import com.harshitbhardwaj.solutions.warmup1.In1020Solution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class In1020Tests {

    /*
    in1020(12, 99) → true
    in1020(21, 12) → true
    in1020(8, 99) → false
    */

    @Test
    public void in1020TestOne() {
        Assert.assertEquals(In1020Solution.in1020(12, 99), true);
    }

    @Test
    public void in1020TestTwo() {
        Assert.assertEquals(In1020Solution.in1020(21, 12), true);
    }

    @Test
    public void in1020TestThree() {
        Assert.assertEquals(In1020Solution.in1020(8, 99), false);
    }
}