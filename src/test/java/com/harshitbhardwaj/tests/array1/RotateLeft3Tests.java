package com.harshitbhardwaj.tests.array1;

import com.harshitbhardwaj.solutions.array1.RotateLeft3Solution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RotateLeft3Tests {

    /*
    rotateLeft3([1, 2, 3]) → [2, 3, 1]
    rotateLeft3([5, 11, 9]) → [11, 9, 5]
    rotateLeft3([7, 0, 0]) → [0, 0, 7]
    */

    @Test
    public void rotateLeft3TestOne() {
        Assert.assertEquals(RotateLeft3Solution.rotateLeft3(new int[]{1, 2, 3})
                , new int[]{2, 3, 1});
    }

    @Test
    public void rotateLeft3TestTwo() {
        Assert.assertEquals(RotateLeft3Solution.rotateLeft3(new int[]{5, 11, 9})
                , new int[]{11, 9, 5});
    }

    @Test
    public void rotateLeft3TestThree() {
        Assert.assertEquals(RotateLeft3Solution.rotateLeft3(new int[]{7, 0, 0})
                , new int[]{0, 0, 7});
    }
}