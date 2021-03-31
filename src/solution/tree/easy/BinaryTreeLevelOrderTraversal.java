package solution.tree.easy;

import java.util.*;

public class BinaryTreeLevelOrderTraversal {

    static List<List<Integer>> traverse(TreeNode root) {
        List<List<Integer>> list = new LinkedList<>();
        dfs(root, 0, list);
        return list;
    }

    static void dfs(TreeNode root, int depth, List<List<Integer>> list) {
        if (root == null) {
            return;
        }
        if (list.size() <= depth)
            list.add(depth, new LinkedList<>());
        List<Integer> sublist = list.get(depth);
        sublist.add(root.val);
        dfs(root.left, depth+1, list);
        dfs(root.right, depth+1, list);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        List<List<Integer>> list = traverse(root);
        for (List<Integer> sublist : list) {
            String str = "";
            for (Integer i : sublist) {
                str += i + " ";
            }
            System.out.println(str);
        }
    }
}
