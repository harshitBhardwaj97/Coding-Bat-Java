package com.harshitbhardwaj.tests.array1;

import com.harshitbhardwaj.solutions.array1.Double23Solution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Double23Tests {

    /*
    double23([2, 2]) → true
    double23([3, 3]) → true
    double23([2, 3]) → false
    */

    @Test
    public void double23TestOne() {
        Assert.assertEquals(Double23Solution.double23(new int[]{2, 2}), true);
    }

    @Test
    public void double23TestTwo() {
        Assert.assertEquals(Double23Solution.double23(new int[]{3, 3}), true);
    }

    @Test
    public void double23TestThree() {
        Assert.assertEquals(Double23Solution.double23(new int[]{2, 3}), false);
    }
}