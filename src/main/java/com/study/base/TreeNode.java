package com.study.base;

import lombok.Data;

/**
 * @desc:
 * @author: guanyushen
 * @date: 2024/6/26 10:30
 */
@Data
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode() {
    }

    public TreeNode(int x) {
        this.val = x;
        this.left = null;
        this.right = null;
    }
}
