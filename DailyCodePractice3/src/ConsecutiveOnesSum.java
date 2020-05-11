public class ConsecutiveOnesSum {
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 1, 1, 0, 1, 1, 1};
        int[] arr1 = {0};
        printArray(arr);
        System.out.println();
        System.out.println(getSum(arr1));
    }

    public static int getSum(int[] nums) {
        if(nums.length == 1){
            return nums[0]==1? 1: 0;
        }
        int sum = 0;
        int result = 0;
        for (Integer ii : nums) {
            if (ii != 0) {
                sum += ii; //1+1
                if (sum > result) {
                    result = sum;
                }
            } else {
                sum = 0;
            }
        }
        return result;
    }

    public static void printArray(int[] arr) {
        for (Integer ii : arr) {
            System.out.print(ii + " ");
        }
    }
}
