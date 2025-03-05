package com.harshitbhardwaj.tests.recursion1;

import com.harshitbhardwaj.solutions.recursion1.SumDigitsSolution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SumDigitsTests {
    
   /*
   sumDigits(126) → 9
   sumDigits(49) → 13
   sumDigits(12) → 3
   */

    @Test
    public void SumDigitsSolutionTestOne() {
        Assert.assertEquals(SumDigitsSolution.sumDigits(126), 9);
    }

    @Test
    public void SumDigitsSolutionTestTwo() {
        Assert.assertEquals(SumDigitsSolution.sumDigits(49), 13);
    }

    @Test
    public void SumDigitsSolutionTestThree() {
        Assert.assertEquals(SumDigitsSolution.sumDigits(12), 3);
    }
}