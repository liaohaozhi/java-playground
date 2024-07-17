package backtracking;

import basic.Util;

import java.util.ArrayList;
import java.util.List;

public class Subsets {

    int n,k;
    List<List<Integer>> output = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        n = nums.length;
        for (k=0; k < n + 1; ++k) {
            backtrack(0, new ArrayList<Integer>(), nums);
        }
        return output;
    }

    public void backtrack(int first, ArrayList<Integer> curr, int[] nums) {
        // if the combination is done
        if (curr.size() == k) {
            output.add(new ArrayList<>(curr));
            return;
        }

        for (int i = first; i < n; i++) {
            //add i to the current combination
            curr.add(nums[i]);
            //use next integers to complete the combination
            backtrack(i+1, curr, nums);
            //backtrack
            curr.remove(curr.size()-1);
        }
    }



    public static void main(String[] args) {
        int[] nums = {1,2,3};
        List<List<Integer>> subsets = new Subsets().subsets(nums);
        Util.print(subsets);
    }
}
