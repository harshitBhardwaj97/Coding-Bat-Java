package com.harshitbhardwaj.tests.string1;

import com.harshitbhardwaj.solutions.string1.ComboStringSolution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ComboStringTests {

    /*
    comboString("Hello", "hi") → "hiHellohi"
    comboString("hi", "Hello") → "hiHellohi"
    comboString("aaa", "b") → "baaab"
    */

    @Test
    public void comboStringTestOne() {
        Assert.assertEquals(ComboStringSolution.comboString("Hello", "hi"),
                "hiHellohi");
    }

    @Test
    public void comboStringTestTwo() {
        Assert.assertEquals(ComboStringSolution.comboString("hi", "Hello"),
                "hiHellohi");
    }

    @Test
    public void comboStringTestThree() {
        Assert.assertEquals(ComboStringSolution.comboString("aaa", "b"),
                "baaab");
    }
}