package com.harshitbhardwaj.tests.string1;

import com.harshitbhardwaj.solutions.string1.FirstHalfSolution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstHalfTests {

    /*
    firstHalf("WooHoo") → "Woo"
    firstHalf("HelloThere") → "Hello"
    firstHalf("abcdef") → "abc"
    */

    @Test
    public void firstHalfTestOne() {
        Assert.assertEquals(FirstHalfSolution.firstHalf("WooHoo"), "Woo");
    }

    @Test
    public void firstHalfTestTwo() {
        Assert.assertEquals(FirstHalfSolution.firstHalf("HelloThere"), "Hello");
    }

    @Test
    public void firstHalfTestThree() {
        Assert.assertEquals(FirstHalfSolution.firstHalf("abcdef"), "abc");
    }
}