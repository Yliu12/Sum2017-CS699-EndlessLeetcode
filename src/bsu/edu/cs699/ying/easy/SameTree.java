package bsu.edu.cs699.ying.easy;

import bsu.edu.cs699.ying.TreeNode;

/**
 * https://leetcode.com/problems/same-tree/
 * Created by yliu12 on 2017/7/10.
 * 54 / 54 test cases passed.
 * Status: Accepted
 * Runtime: 0 ms
 */
public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        return (p.val == q.val) &&
                isSameTree(p.left, q.left)
                && isSameTree(p.right, q.right);

    }
}
