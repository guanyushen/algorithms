package com.study.tree;

import com.study.base.TreeNode;

/**
 * @desc: 找到最大子树是二叉搜索树的大小
 * @author: guanyushen
 * @date: 2024/7/2 16:54
 */
public class FindSearchTree {

    public static class Info {
        private int size; //树的大小
        private int max;
        private int min;
        private boolean isBST; //是否为二叉搜索树

        public Info(int size, int max, int min, boolean isBST) {
            this.size = size;
            this.max = max;
            this.min = min;
            this.isBST = isBST;
        }
    }

    public static int findSearchTree(TreeNode root) {
        return process(root).size;
    }

    public static Info process(TreeNode root) {
        if (root == null) {
            return new Info(0, Integer.MAX_VALUE, Integer.MIN_VALUE, true);
        }

        Info leftInfo = process(root.getLeft());
        Info rightInfo = process(root.getRight());

        int min = Math.min(root.getVal(), Math.min(leftInfo.min, rightInfo.min));
        int max = Math.max(root.getVal(), Math.max(leftInfo.max, rightInfo.max));

        boolean isBST = leftInfo.isBST && rightInfo.isBST && (root.getVal() > leftInfo.max) && (root.getVal() < rightInfo.min);

        int size = isBST ? (1 + leftInfo.size + rightInfo.size) : Math.max(leftInfo.size, rightInfo.size);

        return new Info(size, min, max, isBST);
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(5);
        treeNode.setLeft(new TreeNode(2));
        treeNode.setRight(new TreeNode(7));
        treeNode.getLeft().setRight(new TreeNode(4));
        treeNode.getLeft().getRight().setLeft(new TreeNode(3));
//        treeNode.getLeft().setLeft(new TreeNode(4));
        System.out.println(findSearchTree(treeNode));
    }

}
