package bsu.edu.cs699.ying.easy;

import java.util.*;

/**
 * https://leetcode.com/contest/leetcode-weekly-contest-40/problems/average-of-levels-in-binary-tree/
 * Average of Levels in Binary Tree
 * Created by yliu12 on 2017/7/8.
 */
public class AverageofLevelsinBinaryTree {
    public List<Double> averageOfLevels(TreeNode root) {


        List<Double> result = new ArrayList<>();

        if (root == null) return result;
        Queue<TreeNode> qThis = new LinkedList<>();
        qThis.add(root);

        Queue<TreeNode> qNext = new LinkedList<>();

        while (qThis.size() > 0 || qNext.size() > 0) {
            double levelSum = 0;
            int size = qThis.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = qThis.poll();
                levelSum += node.val;
                if (node.left != null) qNext.add(node.left);
                if (node.right != null) qNext.add(node.right);
            }

            result.add((levelSum) / size);
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

    public static void main(String[] arts) {
        AverageofLevelsinBinaryTree ab = new AverageofLevelsinBinaryTree();

        TreeNode root = new TreeNode(2147483647);
        root.left = new TreeNode(2147483647);
        ;
        root.right = new TreeNode(2147483647);
        ;

//2147483647

        ab.averageOfLevels(root);
    }

}
