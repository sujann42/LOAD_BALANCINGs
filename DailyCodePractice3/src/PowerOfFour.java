public class PowerOfFour {
    public static void main(String[] args) {
        System.out.println(isPowerOfFour(64));
    }

    public static boolean isPowerOfFour(int num) {
        while (num > 1) {
            if (num % 4 == 0) {
                num /= 4;
            }
            else {
                return false;
            }
        }
        if (num == 1) {
            return true;
        } else {
            return false;
        }
    }
}
