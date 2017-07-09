package bsu.edu.cs699.ying.hard;

import bsu.edu.cs699.ying.TreeNode;

import java.util.*;

/**
 * https://leetcode.com/problems/binary-tree-postorder-traversal/#/description
 * Created by yliu12 on 2017/7/9.
 * <p>
 * 67 / 67 test cases passed.
 * Status: Accepted
 * Runtime: 1 ms
 */
public class BinaryTreePostorderTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        LinkedList<Integer> result = new LinkedList<>();
        Deque<TreeNode> stack = new ArrayDeque<>();
        TreeNode p = root;
        while (!stack.isEmpty() || p != null) {
            if (p != null) {
                stack.push(p);
                result.addFirst(p.val);
                p = p.right;
            } else {
                TreeNode node = stack.pop();
                p = node.left;
            }
        }
        return result;
    }
}
