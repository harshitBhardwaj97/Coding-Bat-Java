package com.harshitbhardwaj.solutions.warmup1;

public class ParrotTroubleSolution {

    /*
    We are in trouble if the parrot is talking and the hour is before 7 or after 20.
     */
    public static boolean parrotTrouble(boolean talking, int hour) {
        boolean isHourInTheCorrectRange = hour < 7 || hour > 20;
        return talking && isHourInTheCorrectRange;
        /*
        if (talking && (hour < 7 || hour > 20)) {
            return true;
        } else {
            return false;
        }
        */
    }
}