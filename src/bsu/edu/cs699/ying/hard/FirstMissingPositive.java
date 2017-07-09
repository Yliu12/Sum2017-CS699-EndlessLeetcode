package bsu.edu.cs699.ying.hard;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/first-missing-positive/#/description
 * Created by yliu12 on 2017/7/9.
 * 156 / 156 test cases passed.
 * Status: Accepted
 * Runtime: 16 ms
 */
public class FirstMissingPositive {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int j = 1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= 0) {
                continue;
            }
            if (nums[i] > 0) {
                if (nums[i] > j) {
                    return j;
                }
                if (nums[i] == j) {
                    j++;
                }
            }
        }

        return j;
    }
}
