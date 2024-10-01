package com.harshitbhardwaj.tests.array1;

import com.harshitbhardwaj.solutions.array1.MakePiSolution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MakePiTests {

    /*
    makePi() → [3, 1, 4]
    */

    @Test
    public void makePiTestOne() {
        Assert.assertEquals(MakePiSolution.makePi(), new int[]{3, 1, 4});
    }

    @Test
    public void makePiTestTwo() {
        Assert.assertEquals(MakePiSolution.makePi(), new int[]{3, 1, 4});
    }

    @Test
    public void makePiTestThree() {
        Assert.assertEquals(MakePiSolution.makePi(), new int[]{3, 1, 4});
    }
}