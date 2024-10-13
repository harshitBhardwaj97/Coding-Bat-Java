package com.harshitbhardwaj.tests.string1;

import com.harshitbhardwaj.solutions.string1.HelloNameSolution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HelloNameTests {

    /*
    helloName("Bob") → "Hello Bob!"
    helloName("Alice") → "Hello Alice!"
    helloName("X") → "Hello X!"
    */

    @Test
    public void helloNameTestOne() {
        Assert.assertEquals(HelloNameSolution.helloName("Bob"), "Hello Bob!");
    }

    @Test
    public void helloNameTestTwo() {
        Assert.assertEquals(HelloNameSolution.helloName("Alice"), "Hello Alice!");
    }

    @Test
    public void helloNameTestThree() {
        Assert.assertEquals(HelloNameSolution.helloName("X"), "Hello X!");
    }
}