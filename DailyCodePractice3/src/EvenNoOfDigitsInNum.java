public class EvenNoOfDigitsInNum {
    public static void main(String[] args) {
        int[] arr = {1, 67,12345,22, 555,901,482,1771, 11, 4567};
        System.out.println(findNumbers(arr));
    }

    public static int findNumbers(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int numCount = 0;
        int resultCount = 0;
        for (Integer num : nums) {
            while (num != 0) {
                numCount++;
                num /= 10;

            }

            if (numCount % 2 == 0) {
                resultCount++;
            }
            numCount = 0;
        }

        return resultCount;
    }
}
