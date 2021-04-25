package solution.string.medium;

public class LongestSubstringWithoutRepeatingC {

    //sliding window
    static int lengthOfLongestSubstring(String s) {
        int[] chars = new int[128];

        int left = 0, right = 0, res = 0;

        while (right < s.length()) {
            char r = s.charAt(right);
            chars[r]++;
            while (chars[r] > 1) {
                char l = s.charAt(left);
                chars[l]--;
                left++;
            }

            res = Math.max(res, right-left+1);
            right++;
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }
}
