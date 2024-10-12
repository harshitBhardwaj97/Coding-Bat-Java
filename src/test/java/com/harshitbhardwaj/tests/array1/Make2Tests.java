package com.harshitbhardwaj.tests.array1;

import com.harshitbhardwaj.solutions.array1.Make2Solution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Make2Tests {

    /*
    make2([4, 5], [1, 2, 3]) → [4, 5]
    make2([4], [1, 2, 3]) → [4, 1]
    make2([], [1, 2]) → [1, 2]
    */

    @Test
    public void make2TestOne() {
        Assert.assertEquals(Make2Solution.make2(new int[]{4, 5}, new int[]{1, 2, 3}),
                new int[]{4, 5});
    }

    @Test
    public void make2TestTwo() {
        Assert.assertEquals(Make2Solution.make2(new int[]{4}, new int[]{1, 2, 3}),
                new int[]{4, 1});
    }

    @Test
    public void make2TestThree() {
        Assert.assertEquals(Make2Solution.make2(new int[]{}, new int[]{1, 2}),
                new int[]{1, 2});
    }
}