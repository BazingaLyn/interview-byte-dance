package leetcode;

import bst.TreeNode;

/**
 * 给定两个二叉树，编写一个函数来检验它们是否相同。
 */
public class LeetCode100Done {

    public static void main(String[] args) {

    }

    public static boolean isSameTree(TreeNode t1,TreeNode t2){
        if(t1 == null && t2 == null) return true;

        if(t1 == null || t2 == null) return false;

        if(t1.val != t2.val) return false;
        return isSameTree(t1.left,t2.left) && isSameTree(t1.right,t2.right);
    }
}
