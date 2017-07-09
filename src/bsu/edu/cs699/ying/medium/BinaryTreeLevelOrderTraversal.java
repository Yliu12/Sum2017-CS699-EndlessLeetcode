package bsu.edu.cs699.ying.medium;

import bsu.edu.cs699.ying.easy.AverageofLevelsinBinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * https://leetcode.com/problems/binary-tree-level-order-traversal/#/description
 * Created by yliu12 on 2017/7/9.
 * 34 / 34 test cases passed.
 * Status: Accepted
 * Runtime: 3 ms
 */
public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> result = new ArrayList<>();

        if (root == null) return result;
        Queue<TreeNode> qThis = new LinkedList<>();
        qThis.add(root);

        Queue<TreeNode> qNext = new LinkedList<>();

        while (qThis.size() > 0 || qNext.size() > 0) {

            List<Integer> levelVals = new ArrayList<>();
            int size = qThis.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = qThis.poll();
                levelVals.add(node.val);
                if (node.left != null) qNext.add(node.left);
                if (node.right != null) qNext.add(node.right);
            }

            result.add(levelVals);
            qThis = new LinkedList<>(qNext);
            qNext = new LinkedList<>();
        }
        return result;

    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
