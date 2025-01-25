package com.wipro.datatype;

import java.time.LocalTime;
import java.time.Duration;

public class TimeDifference {
    public static void main(String[] args) {
        // Define start and end times
        LocalTime startTime = LocalTime.of(8, 30); // 8:30 AM
        LocalTime endTime = LocalTime.of(18, 01);  // 6:00 PM

        // Calculate the duration
        Duration duration = Duration.between(startTime, endTime);
        
        System.out.println(duration);
//        PT9H30M

        // Get hours and minutes
        long hours = duration.toHours();
//        9
        long minutes = duration.toMinutes() % 60;
//        570 % 60

        // Display the result
        System.out.println("Time difference: " + hours + " hours and " + minutes + " minutes");
    }
}
