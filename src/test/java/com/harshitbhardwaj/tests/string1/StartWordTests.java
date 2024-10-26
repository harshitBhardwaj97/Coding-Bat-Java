package com.harshitbhardwaj.tests.string1;

import com.harshitbhardwaj.solutions.string1.StartWordSolution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class StartWordTests {

    /*
    startWord("hippo", "hi") → "hi"
    startWord("hippo", "xip") → "hip"
    startWord("hippo", "i") → "h"
    */

    @Test
    public void startWordTestOne() {
        Assert.assertEquals(StartWordSolution.startWord("hippo", "hi"), "hi");
    }

    @Test
    public void startWordTestTwo() {
        Assert.assertEquals(StartWordSolution.startWord("hippo", "xip"), "hip");
    }

    @Test
    public void startWordTestThree() {
        Assert.assertEquals(StartWordSolution.startWord("hippo", "i"), "h");
    }
}