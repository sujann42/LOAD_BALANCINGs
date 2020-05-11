import java.util.HashSet;
import java.util.Set;

public class DistributeCandies {
    public static void main(String[] args) {
        int[] arr1 = {1,1,2,2,3};
        System.out.println(distributeCandies(arr1));
        int[] arr2 = {1,1,2,2,3,3};
        System.out.println(distributeCandies(arr2));
    }
    public static int distributeCandies(int[] candies) {
        Set<Integer> set = new HashSet<>();
        for(Integer cc: candies){
            set.add(cc);
        }
        return Math.min(set.size(), candies.length/2);
    }
}
