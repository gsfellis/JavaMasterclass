public class MinutesToYearsDaysCalculator {

    public static void printYearsAndDays(long minutes) {

        if (minutes >= 0) {
            int totalHours = (int) (minutes / 60);
            int totalDays = totalHours / 24;
            int years = totalDays / 365;
            int days = totalDays % 365;

            System.out.println(String.format("%d min = %d y and %d d", (int)minutes, years, days));
        } else {
            System.out.println("Invalid Value");
        }
    }
}
