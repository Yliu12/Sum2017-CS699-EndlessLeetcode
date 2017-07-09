package bsu.edu.cs699.ying.easy;

/**
 * https://leetcode.com/problems/sum-of-left-leaves/#/description
 * Created by yliu12 on 2017/7/6.
 * 02 / 102 test cases passed.
 Status: Accepted
 Runtime: 10 ms
 */
public class SumofLeftLeaves {
    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null) return 0;
        int ans = 0;
        if(root.left != null) {
            if(root.left.left == null && root.left.right == null) ans += root.left.val;
            else ans += sumOfLeftLeaves(root.left);
        }
        ans += sumOfLeftLeaves(root.right);

        return ans;
    }

      public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
      }


}
