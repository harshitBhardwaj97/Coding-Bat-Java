package com.harshitbhardwaj.tests.functional1;

import com.harshitbhardwaj.solutions.functional1.AddStarSolution;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class AddStarTests {
    
   /*
   addStar(["a", "bb", "ccc"]) → ["a*", "bb*", "ccc*"]
   addStar(["hello", "there"]) → ["hello*", "there*"]
   addStar(["*"]) → ["**"]
   */

    @Test
    public void addStarTestOne() {
        List<String> input = List.of("a", "bb", "ccc");
        List<String> expected = List.of("a*", "bb*", "ccc*");
        Assert.assertEquals(AddStarSolution.addStar(input), expected);
    }

    @Test
    public void addStarTestTwo() {
        List<String> input = List.of("hello", "there");
        List<String> expected = List.of("hello*", "there*");
        Assert.assertEquals(AddStarSolution.addStar(input), expected);
    }

    @Test
    public void addStarTestThree() {
        List<String> input = List.of("*");
        List<String> expected = List.of("**");
        Assert.assertEquals(AddStarSolution.addStar(input), expected);
    }
}