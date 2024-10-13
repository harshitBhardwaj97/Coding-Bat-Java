package com.harshitbhardwaj.tests.string1;

import com.harshitbhardwaj.solutions.string1.MakeAbbaSolution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MakeAbbaTests {

    /*
    makeAbba("Hi", "Bye") → "HiByeByeHi"
    makeAbba("Yo", "Alice") → "YoAliceAliceYo"
    makeAbba("What", "Up") → "WhatUpUpWhat"
    */

    @Test
    public void makeAbbaTestOne() {
        Assert.assertEquals(MakeAbbaSolution.makeAbba("Hi", "Bye"), "HiByeByeHi");
    }

    @Test
    public void makeAbbaTestTwo() {
        Assert.assertEquals(MakeAbbaSolution.makeAbba("Yo", "Alice"), "YoAliceAliceYo");
    }

    @Test
    public void makeAbbaTestThree() {
        Assert.assertEquals(MakeAbbaSolution.makeAbba("What", "Up"), "WhatUpUpWhat");
    }
}