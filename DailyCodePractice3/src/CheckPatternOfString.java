import java.util.HashMap;
import java.util.Map;

public class CheckPatternOfString {

    public static void main(String[] args) {
        String str = "dog cat cat dog";
        String pattern = "abba";
        System.out.println(wordPattern(pattern, str));
    }

    public static boolean wordPattern(String pattern, String str) {
        Map<Character, String> mapp = new HashMap<>();
        String[] strArr = str.split(" ");
        boolean result = false;
        for (int i = 0; i < pattern.length(); i++) {
            if (!mapp.isEmpty()) {

                String value = mapp.get(str.charAt(i));
            } else {
                mapp.put(pattern.charAt(i), strArr[i]);
            }

        }

        return result;
    }
}
