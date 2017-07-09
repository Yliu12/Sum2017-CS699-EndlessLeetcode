package bsu.edu.cs699.ying.medium;

import java.util.*;

/**
 * https://leetcode.com/problems/majority-element-ii/#/description
 * Created by yliu12 on 2017/7/8.
 * 66 / 66 test cases passed.
 * Status: Accepted
 * Runtime: 38 ms
 */
public class MajorityElementII {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> numsMap = new HashMap<>();
        int maxIndex = 0;
        double majNumber = (nums.length + 0.0) / 3;
        List<Integer> result = new ArrayList<>();

        for (int i : nums) {
            if (null != numsMap.putIfAbsent(i, 1)) {
                numsMap.put(i, numsMap.get(i) + 1);
            }

            if (numsMap.get(i) > majNumber && !result.contains(i)) {
                result.add(i);
            }
        }

        return result;
    }
}
