package bsu.edu.cs699.ying.medium;

import java.util.HashSet;

/**
 * https://leetcode.com/problems/single-number-iii/#/description
 * Created by yliu12 on 2017/7/6.
 *
 30 / 30 test cases passed.
 Status: Accepted
 Runtime: 9 ms

 */
public class SingleNumberIII {
    public int[] singleNumber(int[] nums) {
        HashSet<Integer> numSet = new HashSet<>();

        for (int num : nums) {
            if (!numSet.add(num)) {
                numSet.remove(num);
            }
        }

        int[] result = new int[numSet.size()];
        int i = 0;
        for (int num : numSet) {
            result[i] = num;
            i++;
        }

        return result;
    }
}
