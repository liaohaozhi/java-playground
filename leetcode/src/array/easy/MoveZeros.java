package array.easy;

import basic.Util;

public class MoveZeros {
    public static void moveZeros(int[] nums) {
        for (int lastNonZeroFoundAt = 0, cur = 0; cur < nums.length; cur++) {
            if (nums[cur] != 0) {
                int temp = nums[lastNonZeroFoundAt];
                nums[lastNonZeroFoundAt] = nums[cur];
                nums[cur] = temp;
                lastNonZeroFoundAt++;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {0,1,2,0,3};
        moveZeros(nums);
        Util.print(nums);
    }
}
