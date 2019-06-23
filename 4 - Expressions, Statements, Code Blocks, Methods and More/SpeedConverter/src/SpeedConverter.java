public class SpeedConverter {

    public static long toMilesPerHour(double kilometersPerHour) {

        long mph = -1;
        if (kilometersPerHour == 0) {
            mph = 0;
        } else if (kilometersPerHour > 0) {
            mph = Math.round(kilometersPerHour / 1.609);
        }

        return mph;
    }

    public static void printConversion(double kilometersPerHour) {
        long mph = toMilesPerHour(kilometersPerHour);

        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kilometersPerHour + " km/h = " + mph + " mi/h");
        }
    }
}