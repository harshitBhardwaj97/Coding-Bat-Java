package com.harshitbhardwaj.tests.array1;

import com.harshitbhardwaj.solutions.array1.BiggerTwoSolution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BiggerTwoTests {

    /*
    biggerTwo([1, 2], [3, 4]) → [3, 4]
    biggerTwo([3, 4], [1, 2]) → [3, 4]
    biggerTwo([1, 1], [1, 2]) → [1, 2]
    */

    @Test
    public void biggerTwoTestOne() {
        Assert.assertEquals(BiggerTwoSolution.biggerTwo(new int[]{1, 2},
                new int[]{3, 4}), new int[]{3, 4});
    }

    @Test
    public void biggerTwoTestTwo() {
        Assert.assertEquals(BiggerTwoSolution.biggerTwo(new int[]{3, 4},
                new int[]{1, 2}), new int[]{3, 4});
    }

    @Test
    public void biggerTwoTestThree() {
        Assert.assertEquals(BiggerTwoSolution.biggerTwo(new int[]{1, 1},
                new int[]{1, 2}), new int[]{1, 2});
    }
}