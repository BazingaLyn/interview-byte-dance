package bst;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RecursionPreOrderTraverse {

    private static List<Integer> list = new ArrayList<Integer>();

    public static void main(String[] args) {

    }

    public static void preOrderTraverse(TreeNode root){
        if(root == null){
            return;
        }
        System.out.println(root.val);
        preOrderTraverse(root.left);
        preOrderTraverse(root.right);
    }

    public static void preOrderTraverseNoRecursion(TreeNode root){
        LinkedList<TreeNode> stack = new LinkedList<TreeNode>();



    }
}
