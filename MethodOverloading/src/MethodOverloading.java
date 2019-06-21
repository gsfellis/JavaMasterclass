public class MethodOverloading {

    public static void main(String[] args) {
        System.out.println(calcFeetAndInchesToCentimeters(3, 7));

        System.out.println(calcFeetAndInchesToCentimeters(43));

    }


    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet >= 0 && (inches >= 0 && inches <= 12)) {
            double totalInches = feet * 12 + inches;

            return totalInches * 2.54;
        }

        return -1;

    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches >= 0) {
            return inches * 2.54;
        }

        return -1;

    }
}
