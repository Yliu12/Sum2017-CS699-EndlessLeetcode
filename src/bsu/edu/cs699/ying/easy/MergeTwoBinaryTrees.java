package bsu.edu.cs699.ying.easy;

/**
 * Created by yliu12 on 2017/6/27.
 */
public class MergeTwoBinaryTrees {
    public TreeNode merge(TreeNode t1, TreeNode t2) {
        if(t1 == null && t2 == null) {
            return null;
        }

        TreeNode newNode = new TreeNode(-1);
        if(t1 == null) {
            newNode.val = t2.val;
            newNode.left = merge(null, t2.left);
            newNode.right = merge(null, t2.right);
        }
        else if(t2 == null) {
            newNode.val = t1.val;
            newNode.left = merge(t1.left, null);
            newNode.right = merge(t1.right, null);
        }
        else {
            newNode.val = t1.val + t2.val;
            newNode.left = merge(t1.left, t2.left);
            newNode.right = merge(t1.right, t2.right);
        }

        return newNode;
    }
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
}
