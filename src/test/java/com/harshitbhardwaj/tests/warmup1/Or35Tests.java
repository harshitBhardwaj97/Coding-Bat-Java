package com.harshitbhardwaj.tests.warmup1;

import com.harshitbhardwaj.solutions.warmup1.Or35Solution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Or35Tests {

    /*
    or35(3) → true
    or35(10) → true
    or35(8) → false
    */

    @Test
    public void or35TestOne() {
        Assert.assertEquals(Or35Solution.or35(3), true);
    }

    @Test
    public void or35TestTwo() {
        Assert.assertEquals(Or35Solution.or35(10), true);
    }

    @Test
    public void or35TestThree() {
        Assert.assertEquals(Or35Solution.or35(8), false);
    }
}