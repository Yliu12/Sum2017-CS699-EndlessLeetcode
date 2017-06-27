package bsu.edu.cs699.ying.easy;

import java.util.HashSet;


/**
 * Proble : https://leetcode.com/problems/single-number/#/solutions
 * Created by yliu12 on 6/26/2017.
 * 15/15 test cases passed.
 Status: Accepted
 Runtime: 19 ms
 */

public class SingleNumber {
    //Solution using XOR
  /* public int singleNumber(int[] nums) {
    int ans =0;

    int len = nums.length;
    for(int i=0;i!=len;i++)
        ans ^= nums[i];

    return ans;

    }
    }*/

    public int singleNumber(int[] nums) {
        int singleNumber = 0;
        HashSet<Integer> numSet = new HashSet<Integer>();

        for(int num :nums){
            if(!numSet.add(num)) {
                numSet.remove(num);
            }
        }
        singleNumber = (int) numSet.toArray()[0];

        return singleNumber;
    }
}
