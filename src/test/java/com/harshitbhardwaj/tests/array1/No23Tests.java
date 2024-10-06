package com.harshitbhardwaj.tests.array1;

import com.harshitbhardwaj.solutions.array1.No23Solution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class No23Tests {

    /*
    no23([4, 5]) → true
    no23([4, 2]) → false
    no23([3, 5]) → false
    */

    @Test
    public void no23TestOne() {
        Assert.assertEquals(No23Solution.no23(new int[]{4, 5}), true);
    }

    @Test
    public void no23TestTwo() {
        Assert.assertEquals(No23Solution.no23(new int[]{4, 2}), false);
    }

    @Test
    public void no23TestThree() {
        Assert.assertEquals(No23Solution.no23(new int[]{3, 5}), false);
    }
}