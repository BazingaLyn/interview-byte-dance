package bst;

import java.util.*;
public class Main {
    public static void main(String[] args) {


        TreeNode treeNode1 = new TreeNode(22);
        TreeNode treeNode2 = new TreeNode(11);
        TreeNode treeNode3 = new TreeNode(44);
        TreeNode treeNode4 = new TreeNode(67);
        TreeNode treeNode5 = new TreeNode(12);
        TreeNode treeNode6 = new TreeNode(45);
        TreeNode treeNode7 = new TreeNode(28);

        treeNode1.leftNode  =treeNode2;
        treeNode1.rightNode = treeNode3;
        treeNode2.leftNode = treeNode4;
        treeNode3.leftNode = treeNode5;
        treeNode4.rightNode = treeNode6;
        treeNode5.leftNode = treeNode7;

        levelTraverse(treeNode1);
    }

    private static void levelTraverse(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            System.out.println(node.val);
            if(root.leftNode != null){
                queue.add(node.leftNode);
            }
            if(root.rightNode != null){
                queue.add(node.rightNode);
            }
        }
    }

    static class TreeNode {
        public int val;
        public TreeNode leftNode;
        public TreeNode rightNode;

        public TreeNode(int val){
            this.val = val;
        }
    }
}
