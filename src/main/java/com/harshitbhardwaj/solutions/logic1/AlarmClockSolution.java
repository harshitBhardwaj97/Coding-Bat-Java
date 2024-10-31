package com.harshitbhardwaj.solutions.logic1;

// https://codingbat.com/prob/p160543
public class AlarmClockSolution {

    /*
    Given a day of the week encoded as 0=Sun, 1=Mon, 2=Tue, ...6=Sat, and a boolean indicating
    if we are on vacation, return a string of the form "7:00" indicating when the alarm clock should ring.
    Weekdays, the alarm should be "7:00" and on the weekend it should be "10:00".
    Unless we are on vacation -- then on weekdays it should be "10:00" and weekends it should be "off".
    */
    public static String alarmClock(int day, boolean vacation) {
        boolean isWeekDay = day >= 1 && day <= 5;
        boolean isWeekDayAndNotAVacation = isWeekDay && !vacation;
        boolean isWeekDayAndOnAVacation = isWeekDay && vacation;
        boolean isNotAWeekDayAndNotAVacation = !isWeekDay && !vacation;
        boolean isNotAWeekDayAndOnAVacation = !isWeekDay && vacation;

        if (isWeekDayAndNotAVacation) {
            return "7:00";
        } else if (isNotAWeekDayAndNotAVacation || isWeekDayAndOnAVacation) {
            return "10:00";
        } else {
            return "off";
        }
    }
}