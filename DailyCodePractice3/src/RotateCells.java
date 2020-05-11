import java.util.ArrayList;
import java.util.List;

public class RotateCells {
    public static void main(String[] args) {
        int[] a = {1,0,1,0,1,0,1,0};
        System.out.println(cellCompete(a, 8));

    }
    public static List<Integer> cellCompete(int[] states, int days) {
        List<Integer> list = new ArrayList<>();
        for (int k = 0; k < 8; k++) {
            for (int i = states.length; i <= 0; i--) {
                states[i+1] = states[i];
            }
        }

        return list;
    }
}
