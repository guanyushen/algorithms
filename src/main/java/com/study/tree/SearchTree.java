package com.study.tree;

import com.study.base.TreeNode;

/**
 * @desc: 判断是否为搜索二叉树
 * @author: guanyushen
 * @date: 2024/6/27 10:18
 */
public class SearchTree {

    public static class Info {
        private int min;
        private int max;
        private boolean isSearch;

        public Info(int min, int max, boolean isSearch) {
            this.min = min;
            this.max = max;
            this.isSearch = isSearch;
        }
    }

    public static boolean isSearchTree(TreeNode root) {
        return process(root).isSearch;
    }

    public static Info process(TreeNode root) {
        if (root == null) {
            return null;
        }
        Info leftInfo = process(root.getLeft());
        Info rightInfo = process(root.getRight());
        int min = root.getVal();
        int max = root.getVal();
        if (leftInfo != null) {
            min = Math.min(min, leftInfo.min);
            max = Math.max(max, leftInfo.max);
        }
        if (rightInfo != null) {
            min = Math.min(min, rightInfo.min);
            max = Math.max(max, rightInfo.max);
        }
        boolean isSearch = true;
        if (leftInfo != null && !leftInfo.isSearch) {
            isSearch = false;
        }
        if (rightInfo != null && !rightInfo.isSearch) {
            isSearch = false;
        }
        if (leftInfo != null && root.getVal() <= leftInfo.max) {
            isSearch = false;
        }
        if (rightInfo != null && root.getVal() >= rightInfo.min) {
            isSearch = false;
        }
        return new Info(min, max, isSearch);
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(5);
        treeNode.setLeft(new TreeNode(2));
        treeNode.setRight(new TreeNode(7));
        treeNode.getLeft().setRight(new TreeNode(4));
        treeNode.getLeft().getRight().setLeft(new TreeNode(3));
//        treeNode.getLeft().setLeft(new TreeNode(4));
        System.out.println(isSearchTree(treeNode));
    }
}
