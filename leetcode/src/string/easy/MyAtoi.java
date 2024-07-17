package string.easy;

public class MyAtoi {
    static int myatoi(String s) {
        int i = 0;
        char sign = '+';
        for (char c : s.toCharArray()) {
            if (c != ' ') {
                if (c == '-') {
                    sign = '-';
                }
                else if (c >= '0' && c <= '9') {
                    int cNumber = c - '0';
                    if (i > Integer.MAX_VALUE/10 || (i == Integer.MAX_VALUE/10 && cNumber > Integer.MAX_VALUE%10)) {
                        if (sign == '-') {
                            return Integer.MIN_VALUE;
                        }
                        else {
                            return Integer.MAX_VALUE;
                        }
                    }
                    i = i*10 + cNumber;
                }
            }
        }
        if (sign == '-') {
            return i*-1;
        }
        return i;
    }

    public static void main(String[] args) {
        String s = "words and 987";
        System.out.println(myatoi(s));
    }
}
