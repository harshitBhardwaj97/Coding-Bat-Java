package com.harshitbhardwaj.tests.logic1;

import com.harshitbhardwaj.solutions.logic1.WithoutDoublesSolution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WithoutDoublesTests {
    
   /*
   withoutDoubles(2, 3, true) → 5
   withoutDoubles(3, 3, true) → 7
   withoutDoubles(3, 3, false) → 6
   */

    @Test
    public void withoutDoublesTestOne() {
        Assert.assertEquals(WithoutDoublesSolution.withoutDoubles(2, 3, true), 5);
    }

    @Test
    public void withoutDoublesTestTwo() {
        Assert.assertEquals(WithoutDoublesSolution.withoutDoubles(3, 3, true), 7);
    }

    @Test
    public void withoutDoublesTestThree() {
        Assert.assertEquals(WithoutDoublesSolution.withoutDoubles(3, 3, false), 6);
    }
}