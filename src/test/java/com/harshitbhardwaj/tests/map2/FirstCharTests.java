package com.harshitbhardwaj.tests.map2;

import com.harshitbhardwaj.solutions.map2.FirstCharSolution;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Map;

public class FirstCharTests {

    /*
    firstChar(["salt", "tea", "soda", "toast"]) → {"s": "saltsoda", "t": "teatoast"}
    firstChar(["aa", "bb", "cc", "aAA", "cCC", "d"]) → {"a": "aaaAA", "b": "bb", "c": "cccCC", "d": "d"}
    firstChar([]) → {}
    */
    
    @Test
    public void FirstCharSolutionTestOne() {
        String[] input = new String[]{"salt", "tea", "soda", "toast"};
        Map<String, String> expected = Map.of(
                "s", "saltsoda",
                "t", "teatoast"
        );
        Assert.assertEquals(FirstCharSolution.firstChar(input), expected);
    }

    @Test
    public void FirstCharSolutionTestTwo() {
        String[] input = new String[]{"aa", "bb", "cc", "aAA", "cCC", "d"};
        Map<String, String> expected = Map.of(
                "a", "aaaAA",
                "b", "bb",
                "c", "cccCC",
                "d", "d"
        );
        Assert.assertEquals(FirstCharSolution.firstChar(input), expected);
    }

    @Test
    public void FirstCharSolutionTestThree() {
        String[] input = new String[]{};
        Map<String, String> expected = Map.of();
        Assert.assertEquals(FirstCharSolution.firstChar(input), expected);
    }
}