package com.harshitbhardwaj.solutions.ap1;

// https://codingbat.com/prob/p139150
public class MergeTwoSolution {

    /*
    Start with two arrays of strings, A and B, each with its elements in alphabetical order and without duplicates.
    Return a new array containing the first N elements from the two arrays. The result array should be in
    alphabetical order and without duplicates. A and B will both have a length which is N or more.
    The best "linear" solution makes a single pass over A and B, taking advantage of the fact that they
    are in alphabetical order, copying elements directly to the new array.
    */
    public static String[] mergeTwo(String[] a, String[] b, int n) {
        int i = 0, j = 0, k = 0;
        String[] result = new String[n];
        while (k < n && i < a.length && j < b.length) {
            if (a[i].compareTo(b[j]) < 0) {
                result[k] = a[i];
                i++;
            } else if (a[i].compareTo(b[j]) > 0) {
                result[k] = b[j];
                j++;
            } else {
                result[k] = a[i];
                i++;
                j++;
            }
            k++;
        }
        return result;
    }
}