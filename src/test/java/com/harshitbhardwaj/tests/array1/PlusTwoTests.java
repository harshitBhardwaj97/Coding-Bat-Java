package com.harshitbhardwaj.tests.array1;

import com.harshitbhardwaj.solutions.array1.PlusTwoSolution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PlusTwoTests {

    /*
    plusTwo([1, 2], [3, 4]) → [1, 2, 3, 4]
    plusTwo([4, 4], [2, 2]) → [4, 4, 2, 2]
    plusTwo([9, 2], [3, 4]) → [9, 2, 3, 4]
    */

    @Test
    public void plusTwoTestOne() {
        Assert.assertEquals(PlusTwoSolution.plusTwo(new int[]{1, 2}, new int[]{3, 4})
                , new int[]{1, 2, 3, 4});
    }

    @Test
    public void plusTwoTestTwo() {
        Assert.assertEquals(PlusTwoSolution.plusTwo(new int[]{4, 4}, new int[]{2, 2})
                , new int[]{4, 4, 2, 2});
    }

    @Test
    public void plusTwoTestThree() {
        Assert.assertEquals(PlusTwoSolution.plusTwo(new int[]{9, 2}, new int[]{3, 4})
                , new int[]{9, 2, 3, 4});
    }
}