package bsu.edu.cs699.ying.medium;

import java.util.*;

/**
 * https://leetcode.com/problems/kth-smallest-element-in-a-sorted-matrix/#/description
 * Created by yliu12 on 2017/7/20.
 * 85 / 85 test cases passed.
 * Status: Accepted
 * Runtime: 16 ms
 */
public class KthSmallestElementinaSortedMatrix {
    public int kthSmallest(int[][] matrix, int k) {
        int[] list = new int[matrix.length * matrix[0].length];
        int i = 0;
        for (int[] line : matrix) {
            for (int num : line) {
                list[i] = num;
                i++;

            }
        }
        Arrays.sort(list);
        return list[k - 1];

    }

    public static void main(String[] args) {
        KthSmallestElementinaSortedMatrix obj = new KthSmallestElementinaSortedMatrix();
        int[][] mat = {{1, 5, 9}, {10, 11, 13}, {12, 13, 15}};
        obj.kthSmallest(mat, 3);
    }
}
