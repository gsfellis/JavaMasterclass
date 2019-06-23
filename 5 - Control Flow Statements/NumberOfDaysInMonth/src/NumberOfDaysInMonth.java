public class NumberOfDaysInMonth {

    public static boolean isLeapYear(int year) {
        if (year >= 1 && year < 10000) {

            if ((year % 400 == 0) || ((year % 4 == 0) && year % 100 != 0)) {
                return true;
            }
        }

        return false;
    }

    public static int getDaysInMonth(int month, int year) {
        int daysInMonth = 30;

        if ((month < 1 || month > 12) || (year < 1 || year > 9999)) {
            return -1;
        }

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                daysInMonth = 31;
                break;
            case 2:
                daysInMonth = isLeapYear(year) ? 29 : 28;
                break;
        }

        return daysInMonth;
    }
}
