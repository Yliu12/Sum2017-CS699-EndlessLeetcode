package bsu.edu.cs699.ying.medium;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/#/description
 * Created by yliu12 on 2017/7/1.
 *ß146 / 146 test cases passed.
 Status: Accepted
 Runtime: 2 ms
 */
public class FindMinimuminRotatedSortedArray {


    public int findMin(int[] nums) {
        int[] sortednums = Arrays.copyOf(nums, nums.length);

        Arrays.sort(sortednums);

        //Arrays.binarySearch(nums,);
        return sortednums[0];
    }


}
