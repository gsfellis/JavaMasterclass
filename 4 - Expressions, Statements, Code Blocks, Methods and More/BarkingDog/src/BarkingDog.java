public class BarkingDog {

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {

        boolean shouldWake = false;

        if (hourOfDay >= 0 && hourOfDay <= 23) {

            if (barking && (hourOfDay < 8 || hourOfDay > 22)) {
                shouldWake = true;
            }
        }

        return shouldWake;
    }
}
