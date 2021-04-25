package solution.array.medium;

import solution.Util;

import java.util.*;

public class ThreeSum {

    static List<List<Integer>> bruteForce(int[] nums) {
        List<List<Integer>> results = new LinkedList<>();
        Set<String> keySet = new HashSet<>();
        if (nums.length < 3) {
            return results;
        }
        for (int i = 0; i < nums.length-2; i++) {
            for (int j = i+1; j < nums.length-1; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> array = Arrays.asList(nums[i], nums[j], nums[k]);
                        Collections.sort(array); //O(logN)
                        String key = "" + array.get(0)+ array.get(1) + array.get(2);
                        if (!keySet.contains(key)) {
                            results.add(array);
                            keySet.add(key);
                        }
                    }
                }
            }
        }

        return results;
    }

    public static List<List<Integer>> twoPointers(int[] nums) {
        List<List<Integer>> results = new LinkedList<>();
        if (nums.length < 3) {
            return results;
        }

        //sort first O(logN)
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            int sum = 0 - nums[i];
            //remove duplicates
            if (i > 0 && nums[i] == nums[i-1]) {
                continue;
            }
            int left = i+1, right = nums.length-1;
            while (left < right) {
                if (nums[left] + nums[right] < sum)
                    left++;
                else if (nums[left] + nums[right] > sum)
                    right--;
                else {
                    if (right == nums.length -1 || nums[right] != nums[right+1]) {
                        results.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    }
                    left++;
                    right--;
                }
            }
        }

        return results;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {-1,0,1,2,-1,-4};
//        List<List<Integer>> results = bruteForce(nums);
        List<List<Integer>> results = twoPointers(nums);
        Util.print(results);
    }
}
