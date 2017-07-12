package bsu.edu.cs699.ying.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/contains-duplicate/#/description
 * Created by yliu12 on 2017/7/11.
 * <p>
 * 18 / 18 test cases passed.
 * Status: Accepted
 * Runtime: 13 ms
 */
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        if (nums.length == 0) return false;
        Set<Integer> hs = new HashSet<>();
        for (int i : nums) {
            if (!hs.add(i)) {
                return false;
            }
        }
        return true;
    }
}
