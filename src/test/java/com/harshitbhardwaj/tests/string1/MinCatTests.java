package com.harshitbhardwaj.tests.string1;

import com.harshitbhardwaj.solutions.string1.MinCatSolution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MinCatTests {

    /*
    minCat("Hello", "Hi") → "loHi"
    minCat("Hello", "java") → "ellojava"
    minCat("java", "Hello") → "javaello"
    */

    @Test
    public void minCatTestOne() {
        Assert.assertEquals(MinCatSolution.minCat("Hello", "Hi"), "loHi");
    }

    @Test
    public void minCatTestTwo() {
        Assert.assertEquals(MinCatSolution.minCat("Hello", "java"), "ellojava");
    }

    @Test
    public void minCatTestThree() {
        Assert.assertEquals(MinCatSolution.minCat("java", "Hello"), "javaello");
    }
}