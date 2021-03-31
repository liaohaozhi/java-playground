package solution.array.easy;

public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int unique = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[unique]) {
                unique++;
                nums[unique] = nums[i];
            }
        }
        return unique+1;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        int length = RemoveDuplicates.removeDuplicates(nums);
        for (int i = 0; i < length; i++) {
            System.out.print(nums[i]);
        }
    }
}
