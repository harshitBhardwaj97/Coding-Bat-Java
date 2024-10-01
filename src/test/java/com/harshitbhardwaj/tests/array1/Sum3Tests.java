package com.harshitbhardwaj.tests.array1;

import com.harshitbhardwaj.solutions.array1.Sum3Solution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Sum3Tests {

    /*
    sum3([1, 2, 3]) → 6
    sum3([5, 11, 2]) → 18
    sum3([7, 0, 0]) → 7
    */

    @Test
    public void sum3TestOne() {
        Assert.assertEquals(Sum3Solution.sum3(new int[]{1, 2, 3}), 6);
    }

    @Test
    public void sum3TestTwo() {
        Assert.assertEquals(Sum3Solution.sum3(new int[]{5, 11, 2}), 18);
    }

    @Test
    public void sum3TestThree() {
        Assert.assertEquals(Sum3Solution.sum3(new int[]{7, 0, 0}), 7);
    }
}