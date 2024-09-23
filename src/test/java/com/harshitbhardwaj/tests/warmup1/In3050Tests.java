package com.harshitbhardwaj.tests.warmup1;

import com.harshitbhardwaj.solutions.warmup1.In3050Solution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class In3050Tests {

    /*
    in3050(30, 31) → true
    in3050(30, 41) → false
    in3050(40, 50) → true
    */

    @Test
    public void in3050TestOne() {
        Assert.assertEquals(In3050Solution.in3050(30, 31), true);
    }

    @Test
    public void in3050TestTwo() {
        Assert.assertEquals(In3050Solution.in3050(30, 41), false);
    }

    @Test
    public void in3050TestThree() {
        Assert.assertEquals(In3050Solution.in3050(40, 50), true);
    }
}