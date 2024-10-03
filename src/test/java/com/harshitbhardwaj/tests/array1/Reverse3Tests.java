package com.harshitbhardwaj.tests.array1;

import com.harshitbhardwaj.solutions.array1.Reverse3Solution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Reverse3Tests {

    /*
    reverse3([1, 2, 3]) → [3, 2, 1]
    reverse3([5, 11, 9]) → [9, 11, 5]
    reverse3([7, 0, 0]) → [0, 0, 7]
    */

    @Test
    public void reverse3TestOne() {
        Assert.assertEquals(Reverse3Solution.reverse3(new int[]{1, 2, 3}),
                new int[]{3, 2, 1});
    }

    @Test
    public void reverse3TestTwo() {
        Assert.assertEquals(Reverse3Solution.reverse3(new int[]{5, 11, 9}),
                new int[]{9, 11, 5});
    }

    @Test
    public void reverse3TestThree() {
        Assert.assertEquals(Reverse3Solution.reverse3(new int[]{7, 0, 0}),
                new int[]{0, 0, 7});
    }
}