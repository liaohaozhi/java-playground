package solution.dynamicProgramming.easy;

public class MaxSubArray {

    static int kadanesAlgo(int[] nums) {

        //initialize variables using the first element
        int currentSubArray = nums[0];
        int maxSubArray = nums[0];

        //start with the second element
        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];
            //if currentsubarray is negative, throw it away. Otherwise, keep adding to it.
            currentSubArray = Math.max(num, currentSubArray + num);
            maxSubArray = Math.max(maxSubArray, currentSubArray);
        }
        return maxSubArray;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {-2,1,-3,4,-1,2,1,-5,4};
        System.out.print(kadanesAlgo(nums));
    }
}
