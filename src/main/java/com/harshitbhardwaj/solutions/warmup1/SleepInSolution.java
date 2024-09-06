package com.harshitbhardwaj.solutions.warmup1;

public class SleepInSolution {

    // We sleep in if it is not a weekday or we're on vacation
    public static boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;

    /*
    if(!weekday || vacation){
    return true;
    }
    else {
    return false;
    }
     */

    }
}
