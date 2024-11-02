package com.harshitbhardwaj.tests.logic1;

import com.harshitbhardwaj.solutions.logic1.FizzString2Solution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FizzString2Tests {
    
   /*
   fizzString2(1) → "1!"
   fizzString2(2) → "2!"
   fizzString2(3) → "Fizz!"
   */

    @Test
    public void fizzString2TestOne() {
        Assert.assertEquals(FizzString2Solution.fizzString2(1), "1!");
    }

    @Test
    public void fizzString2TestTwo() {
        Assert.assertEquals(FizzString2Solution.fizzString2(2), "2!");
    }

    @Test
    public void fizzString2TestThree() {
        Assert.assertEquals(FizzString2Solution.fizzString2(3), "Fizz!");
    }
}