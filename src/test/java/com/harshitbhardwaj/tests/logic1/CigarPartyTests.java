package com.harshitbhardwaj.tests.logic1;

import com.harshitbhardwaj.solutions.logic1.CigarPartySolution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CigarPartyTests {
    
   /*
    cigarParty(30, false) → false
    cigarParty(50, false) → true
    cigarParty(70, true) → true
   */

    @Test
    public void cigarPartyTestOne() {
        Assert.assertEquals(CigarPartySolution.cigarParty(30, false), false);
    }

    @Test
    public void cigarPartyTestTwo() {
        Assert.assertEquals(CigarPartySolution.cigarParty(50, false), true);
    }

    @Test
    public void cigarPartyTestThree() {
        Assert.assertEquals(CigarPartySolution.cigarParty(70, true), true);
    }
}