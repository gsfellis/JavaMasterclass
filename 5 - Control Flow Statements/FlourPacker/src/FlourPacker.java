public class FlourPacker {

    public static boolean canPack(int bigCount, int smallCount, int goal) {

        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        int BIGCOUNTVALUE = 5;
        int bigTotal = (bigCount * BIGCOUNTVALUE);

        if (bigTotal + smallCount < goal) {
            return false;
        } else {
            for (int i = bigCount; i >= 0; i--) {
                for (int j = smallCount; j >= 0; j--) {
                    bigTotal = i * BIGCOUNTVALUE;

                    if (bigTotal + j == goal) {
                        return true;
                    }
                }
            }

            return false;
        }
    }
}
