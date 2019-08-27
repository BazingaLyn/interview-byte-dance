package leetcode;

import bst.TreeNode;

public class LeetCode236Done {

    public TreeNode lca(TreeNode root, TreeNode p1, TreeNode p2){

        if(root == null || p1 == null || p2 == null){
            return root;
        }

        TreeNode left = lca(root.left,p1,p2);
        TreeNode right = lca(root.right,p1,p2);

        if(left != null && right != null){
            return root;
        }else if(left != null){
            return left;
        }else if(right != null){
            return  right;
        }
        return null;
    }
}
