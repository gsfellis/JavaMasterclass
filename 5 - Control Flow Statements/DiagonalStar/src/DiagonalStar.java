public class DiagonalStar {

    public static void printSquareStar(int number) {

        if (number >= 5) {

            // Rows Loop
            for (int row = 1; row <= number; row++) {
                // Columns Loop
                for (int column = 1; column <= number; column++) {
                    char c = ' ';
                    if (row == 1 || row == number) {
                        c = '*';
                    } else if (column == 1 || column == number) {
                        c = '*';
                    } else if (row == column) {
                        c = '*';
                    } else if (column == number - row + 1) {
                        c = '*';
                    }

                    System.out.print(c);

                }

                // move column down
                System.out.println();
            }
        } else {
            System.out.println("Invalid Value");
        }


    }
}
