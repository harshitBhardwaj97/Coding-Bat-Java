package com.harshitbhardwaj.solutions.logic1;

// https://codingbat.com/prob/p115243
public class FizzString2Solution {

    /*
    Given an int n, return the string form of the number followed by "!". So the int 6 yields "6!".
    Except if the number is divisible by 3 use "Fizz" instead of the number, and if the number is divisible by 5
    use "Buzz", and if divisible by both 3 and 5, use "FizzBuzz".
    */
    public static String fizzString2(int n) {
        boolean isNDivisibleBy3 = n % 3 == 0;
        boolean isNDivisibleBy5 = n % 5 == 0;
        if (isNDivisibleBy3 && isNDivisibleBy5) {
            return "FizzBuzz!";
        } else if (isNDivisibleBy3) {
            return "Fizz!";
        } else if (isNDivisibleBy5) {
            return "Buzz!";
        } else {
            return n + "!";
        }
    }
}