package array.easy;

import basic.Util;

public class RotateArray {
    public static void rotateArray(int[] nums, int k) {
        while (k > 0) {
            int rightMostNum = nums[nums.length-1];
            for (int i = nums.length-1; i > 0; i--) {
                nums[i] = nums[i-1];
            }
            nums[0] = rightMostNum;
            k--;
        }
    }

    public static void main(String[] args) {
        int[] nums = {5, 4, 3, 2, 1};
        rotateArray(nums, 2);
        Util.print(nums);
    }
}
