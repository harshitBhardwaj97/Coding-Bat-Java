package com.harshitbhardwaj.tests.array1;

import com.harshitbhardwaj.solutions.array1.Has23Solution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Has23Tests {

    /*
    has23([2, 5]) → true
    has23([4, 3]) → true
    has23([4, 5]) → false
    */

    @Test
    public void has23TestOne() {
        Assert.assertEquals(Has23Solution.has23(new int[]{2, 5}), true);
    }

    @Test
    public void has23TestTwo() {
        Assert.assertEquals(Has23Solution.has23(new int[]{4, 3}), true);
    }

    @Test
    public void has23TestThree() {
        Assert.assertEquals(Has23Solution.has23(new int[]{4, 5}), false);
    }
}