import java.util.Arrays;
import java.util.Collections;

public class ArraysProb {

    public static void main(String[] args) {
        int[] arr = {-7,-3,2,3,11};
        int[] arr1 = {4,1,0,3,10};
        printArray(arr1);
        Arrays.sort(arr1);
        printArray(arr1);
        getDblArray(arr1);
    }

    public static void getDblArray(int[] A) {
        //int[] newArr = new int[A.length];
        for (int i=0; i<A.length; i++) {
            if(A[i] < 0){
                A[i] = A[i]*(-1);
            }
        }
        Arrays.sort(A);
        //int[] newArr = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            int square = A[i] * A[i];
            A[i] = square;
        }
        printArray(A);
    }

    public static void printArray(int[] arr) {
        for (Integer ii : arr) {
            System.out.print(ii + " ");
        }
        System.out.println();
    }
}
