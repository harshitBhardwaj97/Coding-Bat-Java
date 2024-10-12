package com.harshitbhardwaj.tests.array1;

import com.harshitbhardwaj.solutions.array1.Front11Solution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Front11Tests {

    /*
    front11([1, 2, 3], [7, 9, 8]) → [1, 7]
    front11([1], [2]) → [1, 2]
    front11([1, 7], []) → [1]
    */

    @Test
    public void front11TestOne() {
        Assert.assertEquals(Front11Solution.front11(new int[]{1, 2, 3}, new int[]{7, 9, 8}),
                new int[]{1, 7});
    }

    @Test
    public void front11TestTwo() {
        Assert.assertEquals(Front11Solution.front11(new int[]{1}, new int[]{2}),
                new int[]{1, 2});
    }

    @Test
    public void front11TestThree() {
        Assert.assertEquals(Front11Solution.front11(new int[]{1, 7}, new int[]{}),
                new int[]{1});
    }
}