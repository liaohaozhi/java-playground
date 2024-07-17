package array.easy;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicates {
    static boolean containsDuplicates(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        boolean dup = containsDuplicates(nums);
        System.out.print(dup);
    }
}
