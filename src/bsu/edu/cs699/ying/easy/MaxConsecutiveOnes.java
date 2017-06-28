package bsu.edu.cs699.ying.easy;

/**
 * Proble :https://leetcode.com/problems/max-consecutive-ones/#/description
 * Created by yliu12 on 6/27/2017.
 * 41 / 41 test cases passed.
 Status: Accepted
 Runtime: 12 ms
 */
public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int result = 0;
        int numThisRow = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                if (numThisRow > result) {
                    result = numThisRow;
                }
                numThisRow = 0;
            } else {
                numThisRow++;
            }
        }
        return numThisRow>result? numThisRow:result;
    }

}
