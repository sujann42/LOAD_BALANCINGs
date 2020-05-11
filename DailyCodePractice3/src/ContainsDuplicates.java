import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class ContainsDuplicates {
    public static void main(String[] args) {
        int nums[] = {4, 1, 2, 3, 4};
        System.out.println(containsDuplicate(nums));
    }

    public static boolean containsDuplicate(int[] nums) {

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        if(set.size() < nums.length){
            return true;
        }

        return false;

    }
}
