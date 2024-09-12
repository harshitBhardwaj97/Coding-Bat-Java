package com.harshitbhardwaj.tests.warmup1;

import com.harshitbhardwaj.solutions.warmup1.MissingCharSolution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MissingCharTests {

     /*
    missingChar("kitten", 1) → "ktten"
    missingChar("kitten", 0) → "itten"
    missingChar("kitten", 4) → "kittn"
      */

    @Test
    public void missingCharTestOne() {
        Assert.assertEquals(MissingCharSolution.missingChar("kitten", 1), "ktten");
    }

    @Test
    public void missingCharTestTwo() {
        Assert.assertEquals(MissingCharSolution.missingChar("kitten", 0), "itten");
    }

    @Test
    public void missingCharTestThree() {
        Assert.assertEquals(MissingCharSolution.missingChar("kitten", 4), "kittn");
    }
}