package bsu.edu.cs699.ying.easy;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/maximum-product-of-three-numbers/#/description
 * Created by yliu12 on 2017/7/10.
 * 83 / 83 test cases passed.
 * Status: Accepted
 * Runtime: 38 ms
 */
public class MaximumProductofThreeNumbers {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int a = nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3];
        int b = nums[0] * nums[1] * nums[nums.length - 1];
        return a > b ? a : b;
    }
}
