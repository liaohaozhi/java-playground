package tree;

import java.util.LinkedList;
import java.util.Queue;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public static void dfs(TreeNode root) {
        System.out.print(root.val + " ");
        if (root.left != null)
            dfs(root.left);
        if (root.right != null)
            dfs(root.right);
    }

    public static void bfs(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode currNode = queue.poll();
            System.out.print(currNode.val + " ");
            if (currNode.left != null)
                queue.add(currNode.left);
            if (currNode.right != null)
                queue.add(currNode.right);
        }
    }
}
