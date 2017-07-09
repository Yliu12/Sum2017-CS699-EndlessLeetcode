package bsu.edu.cs699.ying.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/majority-element/#/description
 * Created by yliu12 on 2017/7/8.
 * 44 / 44 test cases passed.
 Status: Accepted
 Runtime: 44 ms
 */
public class MajorityElement {

    public int majorityElement(int[] nums) {
        Map<Integer, Integer> numsMap = new HashMap<>();
        int maxIndex = 0;

        for (int i : nums) {
            if (null != numsMap.putIfAbsent(i, 1)) {
                numsMap.put(i,numsMap.get(i)+1);
            }

            if(numsMap.get(i)>=(nums.length+0.0)/2){
                return i;
            }
        }
        return maxIndex;
    }
}
