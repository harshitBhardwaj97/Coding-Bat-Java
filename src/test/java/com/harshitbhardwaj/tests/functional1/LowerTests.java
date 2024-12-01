package com.harshitbhardwaj.tests.functional1;

import com.harshitbhardwaj.solutions.functional1.LowerSolution;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class LowerTests {

   /*
   lower(["Hello", "Hi"]) → ["hello", "hi"]
   lower(["AAA", "BBB", "ccc"]) → ["aaa", "bbb", "ccc"]
   lower(["KitteN", "ChocolaTE"]) → ["kitten", "chocolate"]
   */

    @Test
    public void lowerTestOne() {
        List<String> input = List.of("Hello", "Hi");
        List<String> expected = List.of("hello", "hi");
        Assert.assertEquals(LowerSolution.lower(input), expected);
    }

    @Test
    public void lowerTestTwo() {
        List<String> input = List.of("AAA", "BBB", "ccc");
        List<String> expected = List.of("aaa", "bbb", "ccc");
        Assert.assertEquals(LowerSolution.lower(input), expected);
    }

    @Test
    public void lowerTestThree() {
        List<String> input = List.of("KitteN", "ChocolaTE");
        List<String> expected = List.of("kitten", "chocolate");
        Assert.assertEquals(LowerSolution.lower(input), expected);
    }
}