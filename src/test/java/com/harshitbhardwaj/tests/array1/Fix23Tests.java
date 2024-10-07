package com.harshitbhardwaj.tests.array1;

import com.harshitbhardwaj.solutions.array1.Fix23Solution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Fix23Tests {

    /*
    fix23([1, 2, 3]) → [1, 2, 0]
    fix23([2, 3, 5]) → [2, 0, 5]
    fix23([1, 2, 1]) → [1, 2, 1]
    */

    @Test
    public void fix23TestOne() {
        Assert.assertEquals(Fix23Solution.fix23(new int[]{1, 2, 3}),
                new int[]{1, 2, 0});
    }

    @Test
    public void fix23TestTwo() {
        Assert.assertEquals(Fix23Solution.fix23(new int[]{2, 3, 5}),
                new int[]{2, 0, 5});
    }

    @Test
    public void fix23TestThree() {
        Assert.assertEquals(Fix23Solution.fix23(new int[]{1, 2, 1}),
                new int[]{1, 2, 1});
    }
}