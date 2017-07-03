package bsu.edu.cs699.ying.medium;

/**
 * https://leetcode.com/problems/single-element-in-a-sorted-array/#/description
 * Created by yliu12 on 6/28/2017.
 * 7 / 7 test cases passed.
 Status: Accepted
 Runtime: 1 ms
 */
public class SingleElementinaSortedArray {
    public int singleNonDuplicate(int[] nums) {
        if(nums[0]!=nums[1])
            return nums[0];

        for (int i=1; i<nums.length-1;i++){
            if (nums[i]!=nums[i-1] && nums[i]!=nums[i+1]){
                return nums[i];
            }
        }
        return nums[nums.length-1];
    }
}
