package com.harshitbhardwaj.tests.logic1;

import com.harshitbhardwaj.solutions.logic1.SpecialElevenSolution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SpecialElevenTests {
    
   /*
   specialEleven(22) → true
   specialEleven(23) → true
   specialEleven(24) → false
   */

    @Test
    public void specialElevenTestOne() {
        Assert.assertEquals(SpecialElevenSolution.specialEleven(22), true);
    }

    @Test
    public void specialElevenTestTwo() {
        Assert.assertEquals(SpecialElevenSolution.specialEleven(23), true);
    }

    @Test
    public void specialElevenTestThree() {
        Assert.assertEquals(SpecialElevenSolution.specialEleven(24), false);
    }
}