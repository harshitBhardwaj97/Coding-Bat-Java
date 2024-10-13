package com.harshitbhardwaj.solutions.string1;

// https://codingbat.com/prob/p171896
public class HelloNameSolution {

    /*
    Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".
    */
    public static String helloName(String name) {
        return String.format("Hello %s!", name);
        // return "Hello " + name + "!";
    }
}