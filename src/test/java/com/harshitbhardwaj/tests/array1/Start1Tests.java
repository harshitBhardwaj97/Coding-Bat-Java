package com.harshitbhardwaj.tests.array1;

import com.harshitbhardwaj.solutions.array1.Start1Solution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Start1Tests {

    /*
    start1([1, 2, 3], [1, 3]) → 2
    start1([7, 2, 3], [1]) → 1
    start1([1, 2], []) → 1
    */

    @Test
    public void start1TestOne() {
        Assert.assertEquals(Start1Solution.start1(new int[]{1, 2, 3}, new int[]{1, 3}), 2);
    }

    @Test
    public void start1TestTwo() {
        Assert.assertEquals(Start1Solution.start1(new int[]{7, 2, 3}, new int[]{1}), 1);
    }

    @Test
    public void start1TestThree() {
        Assert.assertEquals(Start1Solution.start1(new int[]{1, 2}, new int[]{}), 1);
    }
}