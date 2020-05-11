public class AbsencePresentAward {
    public static void main(String[] args) {
        String s5 = "LLPPALLL";
        System.out.println(checkRecord(s5));
    }

    public static boolean checkRecord(String s) {
        int absent_Count = 0;
        int cont_LateCount = 0;
        int valueOf_L = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A') {
                absent_Count++;
            }
        }
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == 'L') {
                cont_LateCount++;
            }
            if (cont_LateCount <= 2 && (s.charAt(i + 1) != 'A' || s.charAt(i + 1) != 'P')) {
                cont_LateCount = 0;
            } else {
                break;
            }
        }

        System.out.println("Absent Count: " + absent_Count + "     Late Count: " + cont_LateCount);
        if (absent_Count <= 1 && cont_LateCount <= 2) {
            return true;
        } else {
            return false;
        }

    }
}
