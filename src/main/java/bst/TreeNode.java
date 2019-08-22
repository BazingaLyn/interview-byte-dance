package bst;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TreeNode {

    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }


    public static int maxHeight(TreeNode root){
        if(root == null)
            return 0;

        int leftHeight = maxHeight(root.left);
        int rightHeight = maxHeight(root.right);
        return Math.max(leftHeight,rightHeight) + 1;
    }


    public static void levelTraverse(TreeNode root){

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode poll = queue.poll();
            System.out.println(poll.val);
            if(poll.left != null)
                queue.add(poll.left);
            if(poll.right != null)
                queue.add(poll.right);
        }

    }

    //TODO
    public static boolean isExistSumFromRootToLeaf(TreeNode root,int sum){
        return false;
    }

    //TODO
    public static boolean isMirrorTree(TreeNode root){
        return false;
    }

    public static void inverseTree(TreeNode root){
        if(root == null){
            return;
        }
        inverseTree(root.left);
        inverseTree(root.right);
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

    }

    public static int minHeight(TreeNode root){
        if(root == null)
            return 0;

        int leftHeight = minHeight(root.left);
        int rightHeight = minHeight(root.right);
        return (leftHeight == 0 || rightHeight == 0) ?  (leftHeight + rightHeight + 1) : Math.min(leftHeight,rightHeight) + 1;
    }

    //TODO
    public static boolean isBalancedTree(TreeNode t){
        return false;
    }


    //TODO
    public int getMaxVal(TreeNode root){
        return 0;
    }

    public static void preOrderTraverse(TreeNode root){
        if(root == null){
            return;
        }
        System.out.println(root.val);
        preOrderTraverse(root.left);
        preOrderTraverse(root.right);
    }

    public static void preOrderTraverseNR(TreeNode root){
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode ret = stack.pop();
            System.out.println(ret.val);
            if(ret.right != null)
                stack.push(ret.right);
            if(ret.left != null)
                stack.push(ret.left);
        }



    }
}


