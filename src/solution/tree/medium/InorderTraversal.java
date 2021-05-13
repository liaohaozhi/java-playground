package solution.tree.medium;

import solution.Util;
import solution.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class InorderTraversal {
    //inorder: left root right
    //preorder: root left right
    //postorder: left right root
    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        recurse(root, result);
        return result;
    }

    public static void recurse(TreeNode root, List<Integer> result) {
        if (root != null) {
            if (root.left != null) {
                recurse(root.left, result);
            }
            result.add(root.val);
            if(root.right != null) {
                recurse(root.right, result);
            }
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));
        List<Integer> result = inorderTraversal(root);
        result.forEach(System.out::println);
    }
}
