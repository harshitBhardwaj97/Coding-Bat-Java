package com.harshitbhardwaj.solutions.logic1;

// https://codingbat.com/prob/p159531
public class CigarPartySolution {

    /*
    When squirrels get together for a party, they like to have cigars. A squirrel party is successful
    when the number of cigars is between 40 and 60, inclusive. Unless it is the weekend, in which case
    there is no upper bound on the number of cigars.
    Return true if the party with the given values is successful, or false otherwise.
    */
    public static boolean cigarParty(int cigars, boolean isWeekend) {
        return (isWeekend && cigars >= 40) || (cigars >= 40 && cigars <= 60);
        /*
        if (!isWeekend) {
            return cigars >= 40 && cigars <= 60;
        } else {
            return cigars >= 40;
        }
        */
    }
}