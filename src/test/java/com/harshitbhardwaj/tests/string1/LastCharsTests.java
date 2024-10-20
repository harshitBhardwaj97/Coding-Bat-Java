package com.harshitbhardwaj.tests.string1;

import com.harshitbhardwaj.solutions.string1.LastCharsSolution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LastCharsTests {

    /*
    lastChars("last", "chars") → "ls"
    lastChars("yo", "java") → "ya"
    lastChars("hi", "") → "h@"
    */

    @Test
    public void lastCharsTestOne() {
        Assert.assertEquals(LastCharsSolution.lastChars("last", "chars"), "ls");
    }

    @Test
    public void lastCharsTestTwo() {
        Assert.assertEquals(LastCharsSolution.lastChars("yo", "java"), "ya");
    }

    @Test
    public void lastCharsTestThree() {
        Assert.assertEquals(LastCharsSolution.lastChars("hi", ""), "h@");
    }
}