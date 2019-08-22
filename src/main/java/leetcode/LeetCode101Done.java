package leetcode;

import bst.TreeNode;

/**
 * 给定一个二叉树，检查它是否是镜像对称的。
 */
public class LeetCode101Done {

    public boolean isSymmetric(TreeNode root) {
        return isMirror(root,root);
    }

    private boolean isMirror(TreeNode p, TreeNode q) {

        if(p == null && q == null) return true;
        if(p == null || q == null) return false;

        return (p.val == q.val)&&isMirror(p.left,q.right)&&isMirror(p.right,q.left);

    }

}
