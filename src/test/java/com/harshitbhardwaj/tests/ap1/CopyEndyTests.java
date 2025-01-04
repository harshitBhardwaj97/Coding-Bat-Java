package com.harshitbhardwaj.tests.ap1;

import com.harshitbhardwaj.solutions.ap1.CopyEndySolution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CopyEndyTests {
    
   /*
   copyEndy([9, 11, 90, 22, 6], 2) → [9, 90]
   copyEndy([9, 11, 90, 22, 6], 3) → [9, 90, 6]
   copyEndy([12, 1, 1, 13, 0, 20], 2) → [1, 1]
   */

    @Test
    public void copyEndyTestOne() {
        int[] input = new int[]{9, 11, 90, 22, 6};
        int[] expected = new int[]{9, 90};
        Assert.assertEquals(CopyEndySolution.copyEndy(input, 2), expected);
    }

    @Test
    public void copyEndyTestTwo() {
        int[] input = new int[]{9, 11, 90, 22, 6};
        int[] expected = new int[]{9, 90, 6};
        Assert.assertEquals(CopyEndySolution.copyEndy(input, 3), expected);
    }

    @Test
    public void copyEndyTestThree() {
        int[] input = new int[]{12, 1, 1, 13, 0, 20};
        int[] expected = new int[]{1, 1};
        Assert.assertEquals(CopyEndySolution.copyEndy(input, 2), expected);
    }
}