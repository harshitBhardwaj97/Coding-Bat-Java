package com.harshitbhardwaj.tests.warmup1;

import com.harshitbhardwaj.solutions.warmup1.Max1020Solution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Max1020Tests {

    /*
    max1020(11, 19) → 19
    max1020(19, 11) → 19
    max1020(11, 9) → 11
    */

    @Test
    public void max1020TestOne() {
        Assert.assertEquals(Max1020Solution.max1020(11, 19), 19);
    }

    @Test
    public void max1020TestTwo() {
        Assert.assertEquals(Max1020Solution.max1020(19, 11), 19);
    }

    @Test
    public void max1020TestThree() {
        Assert.assertEquals(Max1020Solution.max1020(11, 9), 11);
    }
}