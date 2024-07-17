package string.easy;

public class StrStr {
    static int strStr(String haystack, String needle) {
        if ((haystack.length() == 0 && needle.length() == 0) || (haystack.length() >0 && needle.length() == 0)) {
            return 0;
        }
        else if (haystack.length() == 0 || haystack.length() < needle.length()) {
            return -1;
        }
        for (int i = 0 ; i < haystack.length(); i++) {
            //found the first match
            if (haystack.charAt(i) == needle.charAt(0)) {
                boolean found = true;
                for (int j = 1; j < needle.length(); j++) {
                    if (i+j >= haystack.length() || haystack.charAt(i+j) != needle.charAt(j)) {
                        found = false;
                        break;
                    }
                }
                if (found) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int i = strStr("mississippi", "issipi");
        System.out.println(i);
    }
}
