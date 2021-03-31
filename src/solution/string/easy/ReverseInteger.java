package solution.string.easy;

public class ReverseInteger {

    public static int ReverseInteger(int x) {
        int reversed = 0;
        while (x != 0) {
            int pop = x % 10;
            x = x/10;
            //taking care overflows
            if (reversed > Integer.MAX_VALUE/10 || (reversed == Integer.MAX_VALUE && pop > 7)) {
                return 0;
            }
            if (reversed < Integer.MIN_VALUE/10 || (reversed == Integer.MIN_VALUE && pop < -8)) {
                return 0;
            }
            reversed = reversed*10 + pop;
        }
        return reversed;
    }
}
