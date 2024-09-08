package com.harshitbhardwaj.tests.warmup1;

import com.harshitbhardwaj.solutions.warmup1.Makes10Solution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Makes10Tests {

     /*
    makes10(9, 10) → true
    makes10(9, 9) → false
    makes10(1, 9) → true
      */

    @Test
    public void makes10TestOne() {
        Assert.assertEquals(Makes10Solution.makes10(9, 10), true);
    }

    @Test
    public void makes10TestTwo() {
        Assert.assertEquals(Makes10Solution.makes10(9, 9), false);
    }

    @Test
    public void makes10TestThree() {
        Assert.assertEquals(Makes10Solution.makes10(1, 9), true);
    }
}
 