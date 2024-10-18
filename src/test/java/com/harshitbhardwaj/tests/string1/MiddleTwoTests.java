package com.harshitbhardwaj.tests.string1;

import com.harshitbhardwaj.solutions.string1.MiddleTwoSolution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MiddleTwoTests {

    /*
    middleTwo("string") → "ri"
    middleTwo("code") → "od"
    middleTwo("Practice") → "ct"
    */

    @Test
    public void middleTwoTestOne() {
        Assert.assertEquals(MiddleTwoSolution.middleTwo("string"), "ri");
    }

    @Test
    public void middleTwoTestTwo() {
        Assert.assertEquals(MiddleTwoSolution.middleTwo("code"), "od");
    }

    @Test
    public void middleTwoTestThree() {
        Assert.assertEquals(MiddleTwoSolution.middleTwo("Practice"), "ct");
    }
}