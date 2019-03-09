package com.xeroxislabz.gregsprojects;

import java.time.DateTimeException;
import java.time.LocalTime;

 final class TimeConverter {
     static void convertTime(int hr, int min, int sec){

          // Again, we need to make sure that the time is not less than 13 (13 hours) and prevent more time
          // Than needed (for example if user inputs 99 seconds (restricts to only less than 59 seconds)
        try {
            LocalTime userTime = LocalTime.of(hr, min, sec);
            if (userTime.getHour() < 13) { System.out.println("Doesn't need conversion, time is: " + userTime); }
            else {
                System.out.println("Start Time: " + userTime);
                System.out.println("Converted Time: " + userTime.minusHours(12));
            }

            } catch(DateTimeException dte){
                System.out.println("Time format is wrong, recheck");
            }
        }
} // End of TimeConverter class
