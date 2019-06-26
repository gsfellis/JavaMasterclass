import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage() {

        Scanner scanner = new Scanner(System.in);
        boolean firstInput = true;
        int counter = 1;
        int sum = 0;

        while (true) {
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                scanner.nextLine();
                sum += number;

                if (firstInput) {
                    firstInput = false;
                } else {
                    counter++;
                }

            } else {
                long avg = Math.round((double)sum / (double)counter);

                System.out.println("SUM = " + sum + " AVG = " + avg);
                break;
            }
        }

        scanner.close();
    }
}
