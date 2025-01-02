package com.harshitbhardwaj.tests.ap1;

import com.harshitbhardwaj.solutions.ap1.CopyEvensSolution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CopyEvensTests {
    
   /*
   copyEvens([3, 2, 4, 5, 8], 2) → [2, 4]
   copyEvens([3, 2, 4, 5, 8], 3) → [2, 4, 8]
   copyEvens([6, 1, 2, 4, 5, 8], 3) → [6, 2, 4]
   */

    @Test
    public void copyEvensTestOne() {
        int[] input = new int[]{3, 2, 4, 5, 8};
        int[] expected = new int[]{2, 4};
        Assert.assertEquals(CopyEvensSolution.copyEvens(input, 2), expected);
    }

    @Test
    public void copyEvensTestTwo() {
        int[] input = new int[]{3, 2, 4, 5, 8};
        int[] expected = new int[]{2, 4, 8};
        Assert.assertEquals(CopyEvensSolution.copyEvens(input, 3), expected);
    }

    @Test
    public void copyEvensTestThree() {
        int[] input = new int[]{6, 1, 2, 4, 5, 8};
        int[] expected = new int[]{6, 2, 4};
        Assert.assertEquals(CopyEvensSolution.copyEvens(input, 3), expected);
    }
}