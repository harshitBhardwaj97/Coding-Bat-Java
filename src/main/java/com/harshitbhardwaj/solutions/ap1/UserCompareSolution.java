package com.harshitbhardwaj.solutions.ap1;

// https://codingbat.com/prob/p143482
public class UserCompareSolution {

    /*
    We have data for two users, A and B, each with a String name and an int id. The goal is to order
    the users such as for sorting. Return -1 if A comes before B, 1 if A comes after B, and 0 if they are the same.
    Order first by the string names, and then by the id numbers if the names are the same.
    Note: with Strings str1.compareTo(str2) returns an int value which is negative/0/positive to indicate
    how str1 is ordered to str2 (the value is not limited to -1/0/1).
    (On the AP, there would be two User objects, but here the code simply takes the two strings and two ints directly.
    The code logic is the same.)
    */
    public static int userCompare(String aName, int aId, String bName, int bId) {
        int namesComparison = aName.compareTo(bName);

        // Names are not same, hence ordering based on names
        if (namesComparison != 0) {
            return namesComparison < 0 ? -1 : 1;
        }

        // Both names and ids of users are same
        if (aId == bId) {
            return 0;
        }

        // Names are same, need to order based on ids
        return aId < bId ? -1 : 1;
    }
}