package com.harshitbhardwaj.tests.logic1;

import com.harshitbhardwaj.solutions.logic1.DateFashionSolution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DateFashionTests {
    
   /*
    dateFashion(5, 10) → 2
    dateFashion(5, 2) → 0
    dateFashion(5, 5) → 1
   */

    @Test
    public void dateFashionTestOne() {
        Assert.assertEquals(DateFashionSolution.dateFashion(5, 10), 2);
    }

    @Test
    public void dateFashionTestTwo() {
        Assert.assertEquals(DateFashionSolution.dateFashion(5, 2), 0);
    }

    @Test
    public void dateFashionTestThree() {
        Assert.assertEquals(DateFashionSolution.dateFashion(5, 5), 1);
    }
}