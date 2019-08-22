package leetcode;

import bst.TreeNode;

import java.util.*;

public class LeetCode199Done {

    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(22);
        TreeNode treeNode2 = new TreeNode(11);
        TreeNode treeNode3 = new TreeNode(44);
        TreeNode treeNode4 = new TreeNode(67);
        TreeNode treeNode5 = new TreeNode(12);
        TreeNode treeNode6 = new TreeNode(45);
        TreeNode treeNode7 = new TreeNode(28);

        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode2.left = treeNode4;
        treeNode3.left = treeNode5;
        treeNode4.right = treeNode6;
        treeNode5.left = treeNode7;

        List<Integer> result = rightViewSolutuion2(treeNode1);
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }

    }

    //DFS
    public static List<Integer> rightViewSolutuion1(TreeNode root) {

        Map<Integer, Integer> rightmostValueAtDepth = new HashMap<Integer, Integer>();
        Stack<TreeNode> nodeStack = new Stack<TreeNode>();
        Stack<Integer> depthStack = new Stack<Integer>();
        int maxDepth = -1;

        nodeStack.push(root);
        depthStack.push(0);

        while (!nodeStack.isEmpty()) {
            TreeNode node = nodeStack.pop();
            Integer depth = depthStack.pop();

            if (node != null) {
                maxDepth = Math.max(maxDepth, depth);


                if (!rightmostValueAtDepth.containsKey(depth)) {
                    rightmostValueAtDepth.put(depth, node.val);
                }

                nodeStack.push(node.left);
                nodeStack.push(node.right);
                depthStack.push(depth + 1);
                depthStack.push(depth + 1);
            }
        }

        List<Integer> results = new ArrayList<Integer>();

        for (int i = 0; i <= maxDepth; i++) {
            results.add(rightmostValueAtDepth.get(i));
        }
        return results;
    }


    //BFS
    public static List<Integer> rightViewSolutuion2(TreeNode root) {
        Map<Integer, Integer> rightmostValueAtDepth = new HashMap<Integer, Integer>();
        Queue<TreeNode> nodeQueue = new LinkedList<TreeNode>();
        Queue<Integer> depthQueue = new LinkedList<Integer>();

        int maxDepth = -1;

        nodeQueue.add(root);
        depthQueue.add(0);

        while (!nodeQueue.isEmpty()) {
            TreeNode node = nodeQueue.remove();
            Integer depth = depthQueue.remove();

            if (node != null) {
                maxDepth = Math.max(maxDepth, depth);

                rightmostValueAtDepth.put(depth, node.val);
                nodeQueue.add(node.left);
                nodeQueue.add(node.right);
                depthQueue.add(depth + 1);
                depthQueue.add(depth + 1);

            }
        }
        List<Integer> results = new ArrayList<Integer>();

        for (int i = 0; i <= maxDepth; i++) {
            results.add(rightmostValueAtDepth.get(i));
        }
        return results;
    }
}
