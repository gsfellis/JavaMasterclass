public class NumberPalindrome {

    public static boolean isPalindrome(int number) {

        // get ABS of number
        // originally: number = number < 0 ? number * -1 : number;
        number = Math.abs(number);

        int orig = number;
        int reverse = 0;
        int places = (int)(Math.log10(number)); // Places - 1

        while (number > 0) {
            int place = (int)Math.pow(10, places);

            reverse += place * (number % 10); // add least significant digit to correct place
            number /= 10; // drop least significant digit
            places -= 1;
        }

        return (orig == reverse);
    }
}
