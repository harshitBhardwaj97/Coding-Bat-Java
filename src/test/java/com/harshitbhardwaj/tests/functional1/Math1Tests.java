package com.harshitbhardwaj.tests.functional1;

import com.harshitbhardwaj.solutions.functional1.Math1Solution;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Math1Tests {

   /*
   math1([1, 2, 3]) → [20, 30, 40]
   math1([6, 8, 6, 8, 1]) → [70, 90, 70, 90, 20]
   math1([10]) → [110]
   */

    @Test
    public void math1TestOne() {
        List<Integer> input = List.of(1, 2, 3);
        List<Integer> expected = List.of(20, 30, 40);
        Assert.assertEquals(Math1Solution.math1(input), expected);
    }

    @Test
    public void math1TestTwo() {
        List<Integer> input = List.of(6, 8, 6, 8, 1);
        List<Integer> expected = List.of(70, 90, 70, 90, 20);
        Assert.assertEquals(Math1Solution.math1(input), expected);
    }

    @Test
    public void math1TestThree() {
        List<Integer> input = List.of(10);
        List<Integer> expected = List.of(110);
        Assert.assertEquals(Math1Solution.math1(input), expected);
    }
}