package bsu.edu.cs699.ying.easy;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * https://leetcode.com/problems/intersection-of-two-arrays-ii/#/description
 * Created by yliu12 on 2017/7/16.
 * <p>
 * 61 / 61 test cases passed.
 * Status: Accepted
 * Runtime: 7 ms
 */
public class IntersectionofTwoArraysII {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < nums1.length; i++) {
            if (map.containsKey(nums1[i])) map.put(nums1[i], map.get(nums1[i]) + 1);
            else map.put(nums1[i], 1);
        }

        for (int i = 0; i < nums2.length; i++) {
            if (map.containsKey(nums2[i]) && map.get(nums2[i]) > 0) {
                result.add(nums2[i]);
                map.put(nums2[i], map.get(nums2[i]) - 1);
            }
        }

        int[] r = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            r[i] = result.get(i);
        }

        return r;
    }
}
