public class NumberToWords {

    public static void numberToWords(int number) {
        if (number > 0) {
            int reverse = reverse(number);
            String numbers = "";
            int digits = getDigitCount(number);

            while (reverse > 0) {
                int lastDigit = reverse % 10;

                String digitValue = "Zero";

                if (lastDigit == 1) {
                    digitValue = "One";
                } else if (lastDigit == 2) {
                    digitValue = "Two";
                } else if (lastDigit == 3) {
                    digitValue = "Three";
                } else if (lastDigit == 4) {
                    digitValue = "Four";
                } else if (lastDigit == 5) {
                    digitValue = "Five";
                } else if (lastDigit == 6) {
                    digitValue = "Six";
                } else if (lastDigit == 7) {
                    digitValue = "Seven";
                } else if (lastDigit == 8) {
                    digitValue = "Eight";
                } else if (lastDigit == 9) {
                    digitValue = "Nine";
                }

                numbers += digitValue + " ";
                reverse /= 10;
                digits--;
            }

            if (digits > 0) {
                for (int i = 0; i < digits; i++) {
                    numbers += "Zero ";
                }
            }

            System.out.println(numbers);
        } else if (number == 0) {
            System.out.println("Zero");
        } else {
            System.out.println("Invalid Value");
        }
    }

    public static int reverse(int number) {
        boolean isNegative = number < 0 ? true : false;

        // get ABS of number
        // originally: number = number < 0 ? number * -1 : number;
        number = Math.abs(number);

        int reverse = 0;
        int places = getDigitCount(number) - 1;


        while (number > 0) {
            int place = (int)Math.pow(10, places);

            reverse += place * (number % 10); // add least significant digit to correct place
            number /= 10; // drop least significant digit
            places -= 1;
        }

        return isNegative ? reverse * -1 : reverse;
    }

    public static int getDigitCount(int number) {
        if (number >= 10) {
            return (int) (Math.log10(number)) + 1;
        } else if (number >= 0 && number <= 9){
            return 1;
        } else {
            return -1;
        }
    }
}
