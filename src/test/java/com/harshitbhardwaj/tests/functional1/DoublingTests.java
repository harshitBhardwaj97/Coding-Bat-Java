package com.harshitbhardwaj.tests.functional1;

import com.harshitbhardwaj.solutions.functional1.DoublingSolution;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class DoublingTests {

   /*
   doubling([1, 2, 3]) → [2, 4, 6]
   doubling([6, 8, 6, 8, -1]) → [12, 16, 12, 16, -2]
   doubling([]) → []
   */

    @Test
    public void doublingTestOne() {
        List<Integer> input = List.of(1, 2, 3);
        List<Integer> expected = List.of(2, 4, 6);
        Assert.assertEquals(DoublingSolution.doubling(input), expected);
    }

    @Test
    public void doublingTestTwo() {
        List<Integer> input = List.of(6, 8, 6, 8, -1);
        List<Integer> expected = List.of(12, 16, 12, 16, -2);
        Assert.assertEquals(DoublingSolution.doubling(input), expected);
    }

    @Test
    public void doublingTestThree() {
        List<Integer> input = List.of();
        List<Integer> expected = List.of();
        Assert.assertEquals(DoublingSolution.doubling(input), expected);
    }
}