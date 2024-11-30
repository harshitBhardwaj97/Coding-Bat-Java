package com.harshitbhardwaj.tests.map1;

import com.harshitbhardwaj.solutions.map1.Topping2Solution;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Map;

public class Topping2Tests {
    
   /*
   topping2({"ice cream": "cherry"}) → {"yogurt": "cherry", "ice cream": "cherry"}
   topping2({"spinach": "dirt", "ice cream": "cherry"}) → {"yogurt": "cherry", "spinach": "nuts", "ice cream": "cherry"}
   topping2({"yogurt": "salt"}) → {"yogurt": "salt"}
   */

    @Test
    public void topping2TestOne() {
        Map<String, String> input = new java.util.HashMap<>(Map.of("ice cream", "cherry"));
        Map<String, String> expected = Map.of("yogurt", "cherry", "ice cream", "cherry");
        Assert.assertEquals(Topping2Solution.topping2(input), expected);
    }

    @Test
    public void topping2TestTwo() {
        Map<String, String> input = new java.util.HashMap<>
                (Map.of("spinach", "dirt", "ice cream", "cherry"));
        Map<String, String> expected = Map.
                of("yogurt", "cherry", "spinach", "nuts", "ice cream", "cherry");
        Assert.assertEquals(Topping2Solution.topping2(input), expected);
    }

    @Test
    public void topping2TestThree() {
        Map<String, String> input = new java.util.HashMap<>(Map.of("yogurt", "salt"));
        Map<String, String> expected = Map.of("yogurt", "salt");
        Assert.assertEquals(Topping2Solution.topping2(input), expected);
    }
}