public class TeenNumberChecker {

    public static boolean hasTeen(int x, int y, int z) {
        int[] array = new int[] {x, y, z};

        for (int i = 0; i < array.length; i++) {
            if (isTeen(array[i])) {
                return true;
            }
        }

        return false;
    }

    public static boolean isTeen(int x) {
         return (x >= 13 && x <= 19);
    }
}
