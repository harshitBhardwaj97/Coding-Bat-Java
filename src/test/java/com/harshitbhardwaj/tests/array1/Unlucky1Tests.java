package com.harshitbhardwaj.tests.array1;

import com.harshitbhardwaj.solutions.array1.Unlucky1Solution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Unlucky1Tests {

    /*
    unlucky1([1, 3, 4, 5]) → true
    unlucky1([2, 1, 3, 4, 5]) → true
    unlucky1([1, 1, 1]) → false
    */

    @Test
    public void unlucky1TestOne() {
        Assert.assertEquals(Unlucky1Solution.unlucky1(new int[]{1, 3, 4, 5}), true);
    }

    @Test
    public void unlucky1TestTwo() {
        Assert.assertEquals(Unlucky1Solution.unlucky1(new int[]{2, 1, 3, 4, 5}), true);
    }

    @Test
    public void unlucky1TestThree() {
        Assert.assertEquals(Unlucky1Solution.unlucky1(new int[]{1, 1, 1}), false);
    }
}