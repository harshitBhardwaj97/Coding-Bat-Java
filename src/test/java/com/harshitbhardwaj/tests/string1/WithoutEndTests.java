package com.harshitbhardwaj.tests.string1;

import com.harshitbhardwaj.solutions.string1.WithoutEndSolution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WithoutEndTests {

    /*
    withoutEnd("Hello") → "ell"
    withoutEnd("java") → "av"
    withoutEnd("coding") → "odin"
    */

    @Test
    public void withoutEndTestOne() {
        Assert.assertEquals(WithoutEndSolution.withoutEnd("Hello"), "ell");
    }

    @Test
    public void withoutEndTestTwo() {
        Assert.assertEquals(WithoutEndSolution.withoutEnd("java"), "av");
    }

    @Test
    public void withoutEndTestThree() {
        Assert.assertEquals(WithoutEndSolution.withoutEnd("coding"), "odin");
    }
}