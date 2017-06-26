package bsu.edu.cs699.ying.easy;


import javax.swing.tree.TreeNode;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by yliu12 on 6/26/2017.
 */
public class MaximumDepthofBinaryTree {

    public int maxDepth(TreeNode root) {
        TreeNode curNode = root;
        while (null != curNode.left || null != curNode.right){

        }



        return 0;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
