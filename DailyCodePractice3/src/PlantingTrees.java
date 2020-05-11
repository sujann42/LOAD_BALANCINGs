import java.util.HashMap;
import java.util.Map;

public class PlantingTrees {
    public static void main(String[] args) {
        int[] arr1 = {1, 0, 0, 0, 1};
        System.out.println(canPlaceFlowers(arr1, 1));
        int[] arr2 = {1, 0, 0, 0, 1};
        System.out.println(canPlaceFlowers(arr2, 2));
        int[] arr3 = {1, 0, 0, 0, 0, 0, 1};
        System.out.println(canPlaceFlowers(arr3, 2));
    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int len = flowerbed.length;
        int count = 0;
        for (int i = 0; i < len; i = i + 2) {
            if (flowerbed[i] == 1) {
                flowerbed[i+2] = 1;
                if (flowerbed[i + 1] != 1) {
                    count++;
                }
            }
        }
        if (count >= n) {
            return true;
        } else {
            return false;
        }
    }
}
