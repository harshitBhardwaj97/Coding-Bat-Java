package com.harshitbhardwaj.solutions.string1;

// https://codingbat.com/prob/p184030
public class MakeOutWordSolution {

    /*
    Given an "out" string length 4, such as "<<>>", and a word, return a new string where the word
    is in the middle of the out string, e.g. "<<word>>".
    */
    public static String makeOutWord(String out, String word) {
        String front = out.substring(0, 2); // eg. <<
        String back = out.substring(2); // eg. >>
        return String.format("%s%s%s", front, word, back);
        // return front + word + back;
    }
}