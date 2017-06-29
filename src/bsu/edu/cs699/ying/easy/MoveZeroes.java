package bsu.edu.cs699.ying.easy;

/**
 * Proble : https://leetcode.com/problems/sum-of-two-integers/#/description
 * Created by yliu12 on 6/26/2017.
 * 21 / 21 test cases passed.
 Status: Accepted
 Runtime: 0 ms
 */
public class MoveZeroes {

    public void moveZeroes(int[] nums) {

        int j = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j++;
            }
        }
    }
}
