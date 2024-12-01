package com.harshitbhardwaj.tests.functional1;

import com.harshitbhardwaj.solutions.functional1.NoXSolution;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class NoXTests {

   /*
   noX(["ax", "bb", "cx"]) → ["a", "bb", "c"]
   noX(["xxax", "xbxbx", "xxcx"]) → ["a", "bb", "c"]
   noX(["x"]) → [""]
   */

    @Test
    public void noXTestOne() {
        List<String> input = List.of("ax", "bb", "cx");
        List<String> expected = List.of("a", "bb", "c");
        Assert.assertEquals(NoXSolution.noX(input), expected);
    }

    @Test
    public void noXTestTwo() {
        List<String> input = List.of("xxax", "xbxbx", "xxcx");
        List<String> expected = List.of("a", "bb", "c");
        Assert.assertEquals(NoXSolution.noX(input), expected);
    }

    @Test
    public void noXTestThree() {
        List<String> input = List.of("x");
        List<String> expected = List.of("");
        Assert.assertEquals(NoXSolution.noX(input), expected);
    }
}