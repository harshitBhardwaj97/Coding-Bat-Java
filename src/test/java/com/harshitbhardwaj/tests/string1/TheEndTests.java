package com.harshitbhardwaj.tests.string1;

import com.harshitbhardwaj.solutions.string1.TheEndSolution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TheEndTests {

    /*
    theEnd("Hello", true) → "H"
    theEnd("Hello", false) → "o"
    theEnd("oh", true) → "o"
    */
    
    @Test
    public void theEndTestOne() {
        Assert.assertEquals(TheEndSolution.theEnd("Hello", true), "H");
    }

    @Test
    public void theEndTestTwo() {
        Assert.assertEquals(TheEndSolution.theEnd("Hello", false), "o");
    }

    @Test
    public void theEndTestThree() {
        Assert.assertEquals(TheEndSolution.theEnd("oh", true), "o");
    }
}