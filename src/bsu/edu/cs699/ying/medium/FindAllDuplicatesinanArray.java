package bsu.edu.cs699.ying.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.com/problems/find-all-duplicates-in-an-array/#/description
 * Created by yliu12 on 6/29/2017.
 *28 / 28 test cases passed.
 Status: Accepted
 Runtime: 47 ms
 */
public class FindAllDuplicatesinanArray {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]==nums[i]){
                result.add(nums[i-1]);
                i++;
            }
        }
        return result;
    }

}
