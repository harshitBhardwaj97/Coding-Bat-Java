package com.harshitbhardwaj.tests.string1;

import com.harshitbhardwaj.solutions.string1.NonStartSolution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NonStartTests {

    /*
    nonStart("Hello", "There") → "ellohere"
    nonStart("java", "code") → "avaode"
    nonStart("shotl", "java") → "hotlava"
    */

    @Test
    public void nonStartTestOne() {
        Assert.assertEquals(NonStartSolution.nonStart("Hello", "There"),
                "ellohere");
    }

    @Test
    public void nonStartTestTwo() {
        Assert.assertEquals(NonStartSolution.nonStart("java", "code"),
                "avaode");
    }

    @Test
    public void nonStartTestThree() {
        Assert.assertEquals(NonStartSolution.nonStart("shotl", "java"),
                "hotlava");
    }
}