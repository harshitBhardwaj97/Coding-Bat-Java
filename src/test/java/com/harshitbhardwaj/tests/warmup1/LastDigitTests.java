package com.harshitbhardwaj.tests.warmup1;

import com.harshitbhardwaj.solutions.warmup1.LastDigitSolution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LastDigitTests {

    /*
    lastDigit(7, 17) → true
    lastDigit(6, 17) → false
    lastDigit(3, 113) → true
    */

    @Test
    public void lastDigitTestOne() {
        Assert.assertEquals(LastDigitSolution.lastDigit(7, 17), true);
    }

    @Test
    public void lastDigitTestTwo() {
        Assert.assertEquals(LastDigitSolution.lastDigit(6, 17), false);
    }

    @Test
    public void lastDigitTestThree() {
        Assert.assertEquals(LastDigitSolution.lastDigit(3, 113), true);
    }
}