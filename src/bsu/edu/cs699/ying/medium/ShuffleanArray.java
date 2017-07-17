package bsu.edu.cs699.ying.medium;

/**
 * https://leetcode.com/problems/shuffle-an-array/#/description
 * Created by yliu12 on 2017/7/16.
 * <p>
 * 10 / 10 test cases passed.
 * Status: Accepted
 * Runtime: 414 ms
 */
public class ShuffleanArray {

    private int[] nums;

    public ShuffleanArray(int[] nums) {
        this.nums = nums;
    }

    /**
     * Resets the array to its original configuration and return it.
     */
    public int[] reset() {
        return nums;
    }

    /**
     * Returns a random shuffling of the array.
     */
    public int[] shuffle() {
        int[] rand = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int r = (int) (Math.random() * (i + 1));
            rand[i] = rand[r];
            rand[r] = nums[i];
        }
        return rand;
    }
}
