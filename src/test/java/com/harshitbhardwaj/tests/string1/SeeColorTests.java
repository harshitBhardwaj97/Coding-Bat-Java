package com.harshitbhardwaj.tests.string1;

import com.harshitbhardwaj.solutions.string1.SeeColorSolution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SeeColorTests {

    /*
    seeColor("redxx") → "red"
    seeColor("xxred") → ""
    seeColor("blueTimes") → "blue"
    */

    @Test
    public void seeColorTestOne() {
        Assert.assertEquals(SeeColorSolution.seeColor("redxx"), "red");
    }

    @Test
    public void seeColorTestTwo() {
        Assert.assertEquals(SeeColorSolution.seeColor("xxred"), "");
    }

    @Test
    public void seeColorTestThree() {
        Assert.assertEquals(SeeColorSolution.seeColor("blueTimes"), "blue");
    }
}