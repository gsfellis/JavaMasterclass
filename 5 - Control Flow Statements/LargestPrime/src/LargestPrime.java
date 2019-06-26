public class LargestPrime {

    public static int getLargestPrime(int number) {
        if (number > 1) {
            int i;
            int numberCopy = number;

            for (i = 2; i <= numberCopy; i++) {
                if (numberCopy % i == 0) {
                    numberCopy /= i;
                    i--;
                }
            }

            return i;
        }

        return -1;
    }
}
