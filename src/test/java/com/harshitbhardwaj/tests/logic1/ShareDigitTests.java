package com.harshitbhardwaj.tests.logic1;

import com.harshitbhardwaj.solutions.logic1.ShareDigitSolution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ShareDigitTests {
    
   /*
   shareDigit(12, 23) → true
   shareDigit(12, 43) → false
   shareDigit(12, 44) → false
   */

    @Test
    public void shareDigitTestOne() {
        Assert.assertEquals(ShareDigitSolution.shareDigit(12, 23), true);
    }

    @Test
    public void shareDigitTestTwo() {
        Assert.assertEquals(ShareDigitSolution.shareDigit(12, 43), false);
    }

    @Test
    public void shareDigitTestThree() {
        Assert.assertEquals(ShareDigitSolution.shareDigit(12, 44), false);
    }
}