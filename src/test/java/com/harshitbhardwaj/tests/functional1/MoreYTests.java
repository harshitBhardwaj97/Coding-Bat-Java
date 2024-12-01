package com.harshitbhardwaj.tests.functional1;

import com.harshitbhardwaj.solutions.functional1.MoreYSolution;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class MoreYTests {

   /*
   moreY(["a", "b", "c"]) → ["yay", "yby", "ycy"]
   moreY(["hello", "there"]) → ["yhelloy", "ytherey"]
   moreY(["yay"]) → ["yyayy"]
   */

    @Test
    public void moreYTestOne() {
        List<String> input = List.of("a", "b", "c");
        List<String> expected = List.of("yay", "yby", "ycy");
        Assert.assertEquals(MoreYSolution.moreY(input), expected);
    }

    @Test
    public void moreYTestTwo() {
        List<String> input = List.of("hello", "there");
        List<String> expected = List.of("yhelloy", "ytherey");
        Assert.assertEquals(MoreYSolution.moreY(input), expected);
    }

    @Test
    public void moreYTestThree() {
        List<String> input = List.of("yay");
        List<String> expected = List.of("yyayy");
        Assert.assertEquals(MoreYSolution.moreY(input), expected);
    }
}