public class LeapYear {

    public static boolean isLeapYear(int year) {
        if (year >= 1 && year < 10000) {

            if ((year % 400 == 0) || ((year % 4 == 0) && year % 100 != 0)) {
                return true;
            }
        }

        return false;
    }
}
