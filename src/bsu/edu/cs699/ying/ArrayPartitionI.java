package bsu.edu.cs699.ying;

import java.util.Arrays;

/**
 * Proble : https://leetcode.com/problems/array-partition-i/#/description
 *Given an array of 2n integers, your task is to group these integers into n pairs of integer,
 * say (a1, b1), (a2, b2), ..., (an, bn) which makes sum of min(ai, bi) for all i from 1 to n as large as possible.
 *
 * Created by yliu12 on 2017/5/24.
 */
public class ArrayPartitionI {
    public int arrayPairSum(int[] nums) {
        int result = 0;
        Arrays.sort(nums);
        for (int i = 0;i< nums.length;i=i+2){

            result += nums[i];

        }

        return result;
    }
    public static void main(String[] args){
        ArrayPartitionI as= new ArrayPartitionI();

        int[] nums = {1,4,3,2};
        System.out.println( as.arrayPairSum(nums));
    }

}
/**
 *
 81 / 81 test cases passed.
 Status: Accepted
 Runtime: 40 ms
 *
 *
 */