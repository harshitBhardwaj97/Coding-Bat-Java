package com.harshitbhardwaj.tests.string1;

import com.harshitbhardwaj.solutions.string1.ConCatSolution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ConCatTests {

    /*
    conCat("abc", "cat") → "abcat"
    conCat("dog", "cat") → "dogcat"
    conCat("abc", "") → "abc"
    */

    @Test
    public void concatTestOne() {
        Assert.assertEquals(ConCatSolution.conCat("abc", "cat"), "abcat");
    }

    @Test
    public void concatTestTwo() {
        Assert.assertEquals(ConCatSolution.conCat("dog", "cat"), "dogcat");
    }

    @Test
    public void concatTestThree() {
        Assert.assertEquals(ConCatSolution.conCat("abc", ""), "abc");
    }
}