package solution.array.easy;

import solution.Util;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static int[] twosum(int[] nums, int target) {

        //Brute Force: O(n^2) time, O(1) space
        for (int slow = 0; slow < nums.length; slow++) {
            for(int fast = slow+1; fast < nums.length; fast++) {
                if (nums[slow] + nums[fast] == target) {
                    return new int[] {slow, fast};
                }
            }
        }
        return null;
    }

    public static int[] twoSumOnePass(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums = {3,3};
        int[] indexes = twoSumOnePass(nums, 6);
        Util.printNumberArray(indexes);
    }
}
