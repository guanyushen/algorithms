package com.study.tree;

import com.study.base.TreeNode;

/**
 * @desc: 二叉树每俩个节点都有距离，返回整个二叉树的最大距离
 * @author: guanyushen
 * @date: 2024/6/27 11:23
 */
public class MaxRangeTree {

    public static class Info{
        private int maxRange;
        private int height;

        public Info(int maxRange, int height) {
            this.maxRange = maxRange;
            this.height = height;
        }
    }

    public static int getMaxRange(TreeNode root) {
        return process(root).maxRange;
    }

    private static Info process(TreeNode root) {
        if(root == null) {
            return new Info(0, 0);
        }
        Info leftInfo = process(root.getLeft());
        Info rightInfo = process(root.getRight());
        int height = Math.max(leftInfo.height, rightInfo.height) + 1;
        int p1 = leftInfo.maxRange;
        int p2 = rightInfo.maxRange;
        int p3 = leftInfo.height + rightInfo.height + 1;
        int maxRange = Math.max(p1, Math.max(p2, p3));
        return new Info(maxRange, height);
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(5);
        treeNode.setLeft(new TreeNode(2));
        treeNode.setRight(new TreeNode(7));
        treeNode.getLeft().setRight(new TreeNode(4));
        treeNode.getLeft().getRight().setLeft(new TreeNode(3));
//        treeNode.getLeft().setLeft(new TreeNode(4));
        System.out.println(getMaxRange(treeNode));
    }
}
