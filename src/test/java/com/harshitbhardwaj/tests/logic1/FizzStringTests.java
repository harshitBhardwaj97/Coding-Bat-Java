package com.harshitbhardwaj.tests.logic1;

import com.harshitbhardwaj.solutions.logic1.FizzStringSolution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FizzStringTests {
    
   /*
   fizzString("fig") → "Fizz"
   fizzString("dib") → "Buzz"
   fizzString("fib") → "FizzBuzz"
   */

    @Test
    public void fizzStringTestOne() {
        Assert.assertEquals(FizzStringSolution.fizzString("fig"), "Fizz");
    }

    @Test
    public void fizzStringTestTwo() {
        Assert.assertEquals(FizzStringSolution.fizzString("dib"), "Buzz");
    }

    @Test
    public void fizzStringTestThree() {
        Assert.assertEquals(FizzStringSolution.fizzString("fib"), "FizzBuzz");
    }
}