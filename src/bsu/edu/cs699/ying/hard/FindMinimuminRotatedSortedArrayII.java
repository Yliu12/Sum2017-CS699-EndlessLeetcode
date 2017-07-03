package bsu.edu.cs699.ying.hard;

import java.util.Arrays;

/**
 * https://leetcode.com/submissions/detail/107998970/
 * Created by yliu12 on 2017/7/1.
 *192 / 192 test cases passed.
 Status: Accepted
 Runtime: 3 ms
 */


public class FindMinimuminRotatedSortedArrayII {
    public int findMin(int[] nums) {
        int[] sortednums = Arrays.copyOf(nums, nums.length);

        Arrays.sort(sortednums);

        //Arrays.binarySearch(nums,);
        return sortednums[0];
    }

}
