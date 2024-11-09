package com.harshitbhardwaj.tests.logic1;

import com.harshitbhardwaj.solutions.logic1.LastDigitSolution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LastDigitTests {
    
   /*
   lastDigit(23, 19, 13) → true
   lastDigit(23, 19, 12) → false
   lastDigit(23, 19, 3) → true
   */

    @Test
    public void lastDigitTestOne() {
        Assert.assertEquals(LastDigitSolution.lastDigit(23, 19, 13), true);
    }

    @Test
    public void lastDigitTestTwo() {
        Assert.assertEquals(LastDigitSolution.lastDigit(23, 19, 12), false);
    }

    @Test
    public void lastDigitTestThree() {
        Assert.assertEquals(LastDigitSolution.lastDigit(23, 19, 3), true);
    }
}