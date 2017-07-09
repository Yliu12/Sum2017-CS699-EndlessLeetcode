package bsu.edu.cs699.ying.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/relative-ranks/#/description
 * Created by yliu12 on 2017/7/5.
 *17 / 17 test cases passed.
 Status: Accepted
 Runtime: 17 ms
 *
 * Why when you feel like your code is slow as shit an you can beat 90.29% java solution?????
 */
public class RelativeRanks {
    public String[] findRelativeRanks(int[] nums) {
        Map<Integer, String> rankMap = new HashMap<>();
        String[] result = new String[nums.length];
        int[] numsSorted = nums.clone();
        Arrays.sort(numsSorted);
        for (int i = 0; i < numsSorted.length; i++) {
            rankMap.put(numsSorted[i], numsSorted.length - i + "");
            if (i == numsSorted.length - 1)
                rankMap.put(numsSorted[i], "Gold Medal");
            if (i == numsSorted.length - 2)
                rankMap.put(numsSorted[i], "Silver Medal");
            if (i == numsSorted.length - 3)
                rankMap.put(numsSorted[i], "Bronze Medal");

        }

        for (int i = 0; i < nums.length; i++) {
            result[i] = rankMap.get(nums[i]);
        }

        return result;

    }

    ;
}
