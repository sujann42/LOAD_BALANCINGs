public class DiffBetnDuplicatesIndx {
    public static void main(String[] args) {

        /*int[] nums2 = {1, 0, 1, 1};
        System.out.println(containsNearbyDuplicate(nums2, 1));
        int[] nums3 = {1, 2, 3, 1, 2, 3};
        System.out.println(containsNearbyDuplicate(nums3, 2));
        int[] nums4 = {99, 99};
        System.out.println(containsNearbyDuplicate(nums4, 2));
        int[] nums5 = {0, 1, 2, 3, 4, 0, 0, 7, 8, 9, 10, 11, 12, 0};
        System.out.println(containsNearbyDuplicate(nums5, 1));*/
        int[] nums1 = {1, 2, 3, 1};
        containsNearbyDuplicate(nums1, 3);
        //System.out.println(containsNearbyDuplicate(nums1, 3));
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        boolean result = false;
        int comp = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            int newNum = nums[i];
            for (int j = 1; j < nums.length; j++) {
                if(newNum == nums[j]){
                    System.out.println(nums[j]);
                }
            }
        }
        return result;
    }
}
