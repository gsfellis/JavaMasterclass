public class SharedDigit {

    public static boolean hasSharedDigit(int x, int y) {
        if ((x < 10 || x > 99) || (y < 10 || y > 99)) {
            return false;
        }

        while (x > 0) {
            int i = x % 10;
            int tmpY = y;

            while (tmpY > 0) {
                int j = tmpY % 10;

                if (i == j) {
                    return true;
                }

                tmpY /= 10;
            }

            x /= 10;
        }

        return false;
    }
}
