package com.study.easy;

import com.study.base.TreeNode;

/**
 * 题目:二叉树的最大深度
 * 给定一个二叉树，找出其最大深度。
 * 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
 * 说明: 叶子节点是指没有子节点的节点。
 * @author guanyushen
 * @date 2019/7/30 22:36
 */

public class MaxDepthTree {


    public int maxDepth(TreeNode root) {
        int i = 1;
        if(root == null){return 0;}else {
            int left = maxDepth(root.getLeft());
            int right = maxDepth(root.getRight());
            return java.lang.Math.max(left, right)+1;
        }

    }

    public static void main(String[] args) {

    }

}
