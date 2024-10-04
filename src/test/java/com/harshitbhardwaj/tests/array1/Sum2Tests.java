package com.harshitbhardwaj.tests.array1;

import com.harshitbhardwaj.solutions.array1.Sum2Solution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Sum2Tests {

    /*
    sum2([1, 2, 3]) → 3
    sum2([1, 1]) → 2
    sum2([1, 1, 1, 1]) → 2
    */

    @Test
    public void sum2TestOne() {
        Assert.assertEquals(Sum2Solution.sum2(new int[]{1, 2, 3}), 3);
    }

    @Test
    public void sum2TestTwo() {
        Assert.assertEquals(Sum2Solution.sum2(new int[]{1, 1}), 2);
    }

    @Test
    public void sum2TestThree() {
        Assert.assertEquals(Sum2Solution.sum2(new int[]{1, 1, 1, 1}), 2);
    }
}