package com.harshitbhardwaj.tests.logic1;

import com.harshitbhardwaj.solutions.logic1.SortaSumSolution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SortaSumTests {
    
   /*
   sortaSum(3, 4) → 7
   sortaSum(9, 4) → 20
   sortaSum(10, 11) → 21
   */

    @Test
    public void sortaSumTestOne() {
        Assert.assertEquals(SortaSumSolution.sortaSum(3, 4), 7);
    }

    @Test
    public void sortaSumTestTwo() {
        Assert.assertEquals(SortaSumSolution.sortaSum(9, 4), 20);
    }

    @Test
    public void sortaSumTestThree() {
        Assert.assertEquals(SortaSumSolution.sortaSum(10, 11), 21);
    }
}