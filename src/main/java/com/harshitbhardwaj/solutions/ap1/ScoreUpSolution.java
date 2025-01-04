package com.harshitbhardwaj.solutions.ap1;

// https://codingbat.com/prob/p180365
public class ScoreUpSolution {

    /*
    The "key" array is an array containing the correct answers to an exam, like {"a", "a", "b", "b"}.
    the "answers" array contains a student's answers, with "?" representing a question left blank.
    The two arrays are not empty and are the same length. Return the score for this array of answers,
    giving +4 for each correct answer, -1 for each incorrect answer, and +0 for each blank answer.
    */
    public static int scoreUp(String[] key, String[] answers) {
        int score = 0;
        for (int i = 0; i < key.length; i++) {
            if (key[i].equals(answers[i])) {
                score += 4;
            }

            if (answers[i].equals("?")) {
                continue;
            }

            if (!key[i].equals(answers[i])) {
                score -= 1;
            }
        }
        return score;
    }
}