package bsu.edu.cs699.ying.medium;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/minimum-moves-to-equal-array-elements-ii/#/solutions
 * Created by yliu12 on 2017/7/6.
 * 29 / 29 test cases passed.
 Status: Accepted
 Runtime: 7 ms

 * Find Median
 */
public class MinimumMovestoEqualArrayElementsII {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int i = 0, j = nums.length - 1;
        int count = 0;
        while (i < j) {
            count += nums[j] - nums[i];
            i++;
            j--;
        }
        return count;
    }

}
