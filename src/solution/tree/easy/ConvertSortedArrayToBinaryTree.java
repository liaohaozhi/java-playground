package solution.tree.easy;

import solution.tree.TreeNode;

public class ConvertSortedArrayToBinaryTree {
    static TreeNode convert(int[] nums){
        return buildTree(nums, 0, nums.length-1);
    }

    static TreeNode buildTree(int[] nums, int left, int right) {
        if (left > right)
            return null;

        int mid = (right-left)/2 + left;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = buildTree(nums, left, mid-1);
        node.right = buildTree(nums, mid+1, right);
        return node;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-10,-3,0,5,9};
        TreeNode node = convert(nums);
    }
}
