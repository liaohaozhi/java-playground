package tree.medium;

import tree.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class BuildTreeFromArray {
    static int preorderIndex = 0;
    static final Map<Integer, Integer> inorderMap = new HashMap<>();

    public static TreeNode buildTree(int[] preorder, int[] inorder) {

        //store all inorder item index to the hashmap for constant lookup time
        for (int i = 0; i < inorder.length; i++) {
            inorderMap.put(inorder[i], i);
        }
        return arrayToTree(preorder, 0, preorder.length-1);
    }

    public static TreeNode arrayToTree(int[] preorder, int left, int right) {
        if (left > right)
            return null;

        //select the preorder index item for the root value and increase it
        int rootValue = preorder[preorderIndex++];
        TreeNode root = new TreeNode(rootValue);

        //left subtree
        root.left = arrayToTree(preorder, left, inorderMap.get(rootValue)-1);

        //right subtree
        root.right = arrayToTree(preorder, inorderMap.get(rootValue)+1, right);

        return root;
    }

    public static void main(String[] args) {
//        int[] preorder = {3, 9, 1, 2, 20, 15, 7};
//        int[] inorder = {1, 9, 2, 3, 15, 20, 7};
        int[] preorder = {-1};
        int[] inorder = {-1};

        TreeNode root = buildTree(preorder, inorder);
        TreeNode.dfs(root);
        TreeNode.bfs(root);
    }
}
