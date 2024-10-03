package com.harshitbhardwaj.tests.array1;

import com.harshitbhardwaj.solutions.array1.MaxEnd3Solution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MaxEnd3Tests {

    /*
    maxEnd3([1, 2, 3]) → [3, 3, 3]
    maxEnd3([11, 5, 9]) → [11, 11, 11]
    maxEnd3([2, 11, 3]) → [3, 3, 3]
    */

    @Test
    public void maxEnd3TestOne() {
        Assert.assertEquals(MaxEnd3Solution.maxEnd3(new int[]{1, 2, 3}),
                new int[]{3, 3, 3});
    }

    @Test
    public void maxEnd3TestTwo() {
        Assert.assertEquals(MaxEnd3Solution.maxEnd3(new int[]{11, 5, 9}),
                new int[]{11, 11, 11});
    }

    @Test
    public void maxEnd3TestThree() {
        Assert.assertEquals(MaxEnd3Solution.maxEnd3(new int[]{2, 11, 3}),
                new int[]{3, 3, 3});
    }
}