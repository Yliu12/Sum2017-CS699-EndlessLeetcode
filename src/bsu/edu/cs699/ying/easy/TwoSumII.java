package bsu.edu.cs699.ying.easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/#/description
 * Created by yliu12 on 2017/6/30.
 *16 / 16 test cases passed.
 Status: Accepted
 Runtime: 15 ms
 */
public class TwoSumII {
    public int[] twoSum(int[] numbers, int target) {
        ArrayList<Integer> numsList = new ArrayList<>();
        Set numsSet = new HashSet<>();
        for(int num : numbers){
            numsList.add(num);
            numsSet.add(num);
        }
        for(int i : numbers){

            if(numsSet.contains(target-i)) {
                int[] result = {numsList.indexOf(i)+1, 1+numsList.lastIndexOf(target - i)};
                return result;
            }
        }

        return null;
    }
}
