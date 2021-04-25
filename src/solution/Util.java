package solution;

import java.util.List;

public class Util {
    public static void print(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
        }
    }

    public static void print(List<List<Integer>> list) {
        for (List<Integer> sublist : list) {
            String str = "";
            for (Integer integer : sublist) {
                str += " "+integer;
            }
            System.out.println(str);
        }
    }
}
