package com.harshitbhardwaj.tests.string1;

import com.harshitbhardwaj.solutions.string1.TwoCharSolution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TwoCharTests {

    /*
    twoChar("java", 0) → "ja"
    twoChar("java", 2) → "va"
    twoChar("java", 3) → "ja"
    */

    @Test
    public void twoCharTestOne() {
        Assert.assertEquals(TwoCharSolution.twoChar("java", 0), "ja");
    }

    @Test
    public void twoCharTestTwo() {
        Assert.assertEquals(TwoCharSolution.twoChar("java", 2), "va");
    }

    @Test
    public void twoCharTestThree() {
        Assert.assertEquals(TwoCharSolution.twoChar("java", 3), "ja");
    }
}