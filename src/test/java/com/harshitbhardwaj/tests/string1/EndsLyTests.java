package com.harshitbhardwaj.tests.string1;

import com.harshitbhardwaj.solutions.string1.EndsLySolution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EndsLyTests {

    /*
    endsLy("oddly") → true
    endsLy("y") → false
    endsLy("oddy") → false
    */

    @Test
    public void endsLyTestOne() {
        Assert.assertEquals(EndsLySolution.endsLy("oddly"), true);
    }

    @Test
    public void endsLyTestTwo() {
        Assert.assertEquals(EndsLySolution.endsLy("y"), false);
    }

    @Test
    public void endsLyTestThree() {
        Assert.assertEquals(EndsLySolution.endsLy("oddy"), false);
    }
}