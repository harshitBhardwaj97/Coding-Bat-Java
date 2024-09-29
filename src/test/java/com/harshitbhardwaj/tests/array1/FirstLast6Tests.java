package com.harshitbhardwaj.tests.array1;

import com.harshitbhardwaj.solutions.array1.FirstLast6Solution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstLast6Tests {

    /*
    firstLast6([1, 2, 6]) → true
    firstLast6([6, 1, 2, 3]) → true
    firstLast6([13, 6, 1, 2, 3]) → false
    */

    @Test
    public void firstLast6TestOne() {
        Assert.assertEquals(FirstLast6Solution.firstLast6(new int[]{1, 2, 6}), true);
    }

    @Test
    public void firstLast6TestTwo() {
        Assert.assertEquals(FirstLast6Solution.firstLast6(new int[]{6, 1, 2, 3}), true);
    }

    @Test
    public void firstLast6TestThree() {
        Assert.assertEquals(FirstLast6Solution.firstLast6(new int[]{13, 6, 1, 2, 3}), false);
    }
}