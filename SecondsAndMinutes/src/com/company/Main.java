package com.company;

public class Main {

    private static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static void main(String[] args) {
        System.out.println(getDurationString(127, 59));

        System.out.println(getDurationString(7679));

        System.out.println(getDurationString(-5));
        System.out.println(getDurationString(120,75));
    }

    public static String getDurationString(int minutes, int seconds) {
        String durationString = INVALID_VALUE_MESSAGE;

        if (minutes >= 0 && (seconds >= 0 && seconds <= 59)) {

            int finalHours = minutes / 60;
            int finalMinutes = minutes % 60;

            durationString = String.format("%02dh %02dm %02ds", finalHours, finalMinutes, seconds);

//            String hoursString = (finalHours < 10) ? "0" + finalHours + "h " : finalHours + "h ";
//            String minutesString = (finalMinutes < 10) ? "0" + finalMinutes + "m " : finalHours + "m ";
//            String secondsString = (seconds < 10) ? "0" + seconds + "s" : seconds + "s";
//
//            durationString = hoursString + minutesString + secondsString;
        }

        return durationString;
    }

    public static String getDurationString(int seconds) {
        return (seconds >= 0) ? getDurationString((seconds / 60), (seconds % 60)) : INVALID_VALUE_MESSAGE;
    }
}
