package solution.tree.easy;

public class MaxDepth {

    static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int depth;
        int depthL;
        int depthR;
        depthL = maxDepth(root.left);
        depthR = maxDepth(root.right);
        if (depthL >= depthR)
            depth = depthL+1;
        else
            depth = depthR + 1;

        return depth;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));

        int maxDepth = maxDepth(root);
        System.out.println(maxDepth);
    }

}
