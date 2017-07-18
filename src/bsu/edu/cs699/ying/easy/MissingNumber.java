package bsu.edu.cs699.ying.easy;

/**
 * https://leetcode.com/problems/missing-number/#/description
 * Created by yliu12 on 2017/7/17.
 * 121 / 121 test cases passed.
 * Status: Accepted
 * Runtime: 2 ms
 */
public class MissingNumber {
    public int missingNumber(int[] nums) {

        int xor = 0, i = 0;
        for (i = 0; i < nums.length; i++) {
            xor = xor ^ i ^ nums[i];
        }

        return xor ^ i;
    }
}
