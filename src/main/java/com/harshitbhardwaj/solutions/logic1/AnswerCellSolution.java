package com.harshitbhardwaj.solutions.logic1;

// https://codingbat.com/prob/p110973
public class AnswerCellSolution {

    /*
    Your cell phone rings. Return true if you should answer it. Normally you answer, except in the morning
    you only answer if it is your mom calling. In all cases, if you are asleep, you do not answer.
    */
    public static boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        if (isAsleep) {
            return false;
        }
        // We are awake
        else {
            return (!isMorning || (isMorning && isMom));
        }
    }
}