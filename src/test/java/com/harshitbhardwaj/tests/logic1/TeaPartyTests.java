package com.harshitbhardwaj.tests.logic1;

import com.harshitbhardwaj.solutions.logic1.TeaPartySolution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TeaPartyTests {
    
   /*
   teaParty(6, 8) → 1
   teaParty(3, 8) → 0
   teaParty(20, 6) → 2
   */

    @Test
    public void teaPartyTestOne() {
        Assert.assertEquals(TeaPartySolution.teaParty(6, 8), 1);
    }

    @Test
    public void teaPartyTestTwo() {
        Assert.assertEquals(TeaPartySolution.teaParty(3, 8), 0);
    }

    @Test
    public void teaPartyTestThree() {
        Assert.assertEquals(TeaPartySolution.teaParty(20, 6), 2);
    }
}