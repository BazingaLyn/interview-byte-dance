package leetcode;

import bst.TreeNode;

public class LeetCode235 {

    public TreeNode lca(TreeNode root, TreeNode p1, TreeNode p2) {
        if((p1.val - root.val) * (p2.val - root.val) <= 0){
            return root;
        }else if(p1.val < root.val && p2.val < root.val){
            lca(root.left,p1,p2);
        }else{
            lca(root.right,p1,p2);
        }

        return null;
    }

}
