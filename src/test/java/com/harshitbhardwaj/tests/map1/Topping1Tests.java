package com.harshitbhardwaj.tests.map1;

import com.harshitbhardwaj.solutions.map1.Topping1Solution;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Map;

public class Topping1Tests {
    
   /*
   topping1({"ice cream": "peanuts"}) → {"bread": "butter", "ice cream": "cherry"}
   topping1({}) → {"bread": "butter"}
   topping1({"pancake": "syrup"}) → {"bread": "butter", "pancake": "syrup"}
   */

    @Test
    public void topping1TestOne() {
        Map<String, String> input = new java.util.HashMap<>(Map.of("ice cream", "peanuts"));
        Map<String, String> expected = Map.of("bread", "butter", "ice cream", "cherry");
        Assert.assertEquals(Topping1Solution.topping1(input), expected);
    }

    @Test
    public void topping1TestTwo() {
        Map<String, String> input = new java.util.HashMap<>();
        Map<String, String> expected = Map.of("bread", "butter");
        Assert.assertEquals(Topping1Solution.topping1(input), expected);
    }

    @Test
    public void topping1TestThree() {
        Map<String, String> input = new java.util.HashMap<>(Map.of("pancake", "syrup"));
        Map<String, String> expected = Map.of("bread", "butter", "pancake", "syrup");
        Assert.assertEquals(Topping1Solution.topping1(input), expected);
    }
}