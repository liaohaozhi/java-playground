package string.easy;

public class ValidPalindrome {

    static boolean test(String s) {
        char[] array = new char[s.length()];
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (isAlph(c)) {
                array[j++] = Character.toLowerCase(c);
            }
        }
        j--;
        int start = 0;
        int end = j;
        boolean result = true;
        while (start++ < j && end-- > 0) {
            if (array[start] != array[end]) {
                result = false;
                break;
            }
        }

        return result;
    }

    static boolean isAlph(char c) {
        return (c>='a' && c<='z') || (c>='A' && c<='Z') || (c>='0' && c<= '9');
    }


    public static void main(String[] args) {
        String s = "race a car";
        System.out.print(test(s));
    }
}
