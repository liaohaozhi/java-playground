package solution.tree.easy;

import solution.tree.TreeNode;

public class ValidBST {

    static boolean isValidBST(TreeNode root) {
        return validate(root, null, null);
    }

    static boolean validate(TreeNode root, Integer low, Integer high) {
        if (root == null)
            return true;
        if ((low != null && root.val <= low) || (high != null && root.val >= high))
            return false;
        return validate(root.left, low, root.val) && validate(root.right, root.val, high);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3, new TreeNode(1), new TreeNode(5, new TreeNode(4), new TreeNode(6)));
        boolean isBST = isValidBST(root);
        System.out.println(isBST);
    }
}
