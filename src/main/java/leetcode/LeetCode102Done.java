package leetcode;

import bst.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 二叉树的层序遍历是用队列来做实现的，这边因为要显示层级，所以这边有一个count快照的概念，这边可以先看下二叉树的左视图和右视图
 */
public class LeetCode102Done {

    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null)
            return new ArrayList<List<Integer>>();
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while(!queue.isEmpty()){
            int count = queue.size();
            List<Integer> list = new ArrayList<Integer>();
            while(count > 0){
                TreeNode treeNode = queue.poll();
                list.add(treeNode.val);
                if(treeNode.left != null){
                    queue.add(treeNode.left);
                }
                if(treeNode.right != null){
                    queue.add(treeNode.right);
                }
                count --;
            }
            res.add(list);

        }

        return res;
    }
}
