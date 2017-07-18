package bsu.edu.cs699.ying.easy;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/minimum-moves-to-equal-array-elements/#/description
 * Created by yliu12 on 7/3/2017.
 * 84 / 84 test cases passed.
 Status: Accepted
 Runtime: 38 ms
 */
public class MinimumMovestoEqualArrayElements {
    public int minMoves(int[] nums) {
        int moves = 0;
        Arrays.sort(nums);
        for (int i=1;i<nums.length;i++){
            moves +=nums[i]-nums[0];
        }
        return moves;
    }
}
