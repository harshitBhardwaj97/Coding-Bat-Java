package com.harshitbhardwaj.solutions.warmup1;

public class MonkeyTroubleSolution {

    // We are in trouble if they are both smiling or if neither of them is smiling
    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        boolean areBothSmiling = aSmile && bSmile;
        boolean noneOfThemSmiling = !aSmile && !bSmile;

        return areBothSmiling || noneOfThemSmiling;
    }

}
 