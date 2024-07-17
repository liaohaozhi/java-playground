package tree.medium;

import basic.Util;
import tree.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ZigzagLevelOrder {
    //basic.BFS
    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        int depth = 0;
        LinkedList<TreeNode> queue = new LinkedList<>();

        queue.add(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> values = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                values.add(node.val);

                if (node.left != null)
                    queue.add(node.left);
                if (node.right != null)
                    queue.add(node.right);

            }
            if (depth%2 > 0)
                Collections.reverse(values);

            result.add(values);
            depth++;
        }

        return result;
    }


    public static void main(String[] args) {
        TreeNode root = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        List<List<Integer>> result = zigzagLevelOrder(root);
        Util.print(result);
    }
}
