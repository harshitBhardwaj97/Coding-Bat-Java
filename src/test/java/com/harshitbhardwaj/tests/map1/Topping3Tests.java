package com.harshitbhardwaj.tests.map1;

import com.harshitbhardwaj.solutions.map1.Topping3Solution;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Map;

public class Topping3Tests {
    
   /*
   topping3({"potato": "ketchup"}) → {"potato": "ketchup", "fries": "ketchup"}
   topping3({"potato": "butter"}) → {"potato": "butter", "fries": "butter"}
   topping3({"salad": "oil", "potato": "ketchup"}) → {"spinach": "oil", "salad": "oil", "potato": "ketchup", "fries": "ketchup"}
   */

    @Test
    public void topping3TestOne() {
        Map<String, String> input = new java.util.HashMap<>(Map.of("potato", "ketchup"));
        Map<String, String> expected = Map.of("potato", "ketchup", "fries", "ketchup");
        Assert.assertEquals(Topping3Solution.topping3(input), expected);
    }

    @Test
    public void topping3TestTwo() {
        Map<String, String> input = new java.util.HashMap<>(Map.of("potato", "butter"));
        Map<String, String> expected = Map.of("potato", "butter", "fries", "butter");
        Assert.assertEquals(Topping3Solution.topping3(input), expected);
    }

    @Test
    public void topping3TestThree() {
        Map<String, String> input = new java.util.HashMap<>
                (Map.of("salad", "oil", "potato", "ketchup"));
        Map<String, String> expected = Map.
                of("spinach", "oil", "salad", "oil", "potato",
                        "ketchup", "fries", "ketchup");
        Assert.assertEquals(Topping3Solution.topping3(input), expected);
    }
}