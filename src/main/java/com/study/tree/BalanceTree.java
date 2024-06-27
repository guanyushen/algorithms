package com.study.tree;

import com.study.base.TreeNode;

/**
 * @desc: 判断是否为平衡二叉树
 * @author: guanyushen
 * @date: 2024/6/27 09:39
 */
public class BalanceTree {

    public static class Info{
        private int height;
        private boolean isBalance;

        public Info(int height, boolean isBalance) {
            this.height = height;
            this.isBalance = isBalance;
        }
    }

    public static boolean isBalanceTree(TreeNode root) {
        return process(root).isBalance;
    }

    public static Info process(TreeNode root) {
        if (root == null) return new Info(0,true);
        Info leftInfo = process(root.getLeft());
        Info rightInfo = process(root.getRight());
        int height = Math.max(leftInfo.height,rightInfo.height) + 1;
        boolean isBalance = leftInfo.isBalance && rightInfo.isBalance && Math.abs(leftInfo.height - rightInfo.height) <= 1;
        return new Info(height,isBalance);
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        treeNode.setLeft(new TreeNode(2));
        treeNode.setRight(new TreeNode(3));
        treeNode.getLeft().setRight(new TreeNode(4));
        treeNode.getLeft().getRight().setLeft(new TreeNode(4));
//        treeNode.getLeft().setLeft(new TreeNode(4));
        System.out.println(isBalanceTree(treeNode));
    }
}
