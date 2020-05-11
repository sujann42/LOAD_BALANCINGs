public class ReverseAVowel {
    public static void main(String[] args) {
        String s = "Hello";
        System.out.println(reverseVowels(s));
    }

    public static String reverseVowels(String s) {
        if (s.isEmpty() || s.isBlank()) {
            return "";
        }
        String s1 = s.toLowerCase();
        String result = "";
        char vowel1 = 0;
        char vowel2 = 0;
        char[] strArr = s.toCharArray();
        for (int i = 0; i < strArr.length; i++) {
            if ((strArr[i] == 'a' || strArr[i] == 'e' || strArr[i] == 'i' || strArr[i] == 'o' || strArr[i] == 'u')) {
                vowel1 = (char) i;
                continue;
            } else {
                result += strArr[i];
            }
        }
        swap(vowel1, vowel2);
        return result;

    }

    public static void swap(char a, char b) {
        char temp = a;
        a = b;
        b = temp;
    }
}
