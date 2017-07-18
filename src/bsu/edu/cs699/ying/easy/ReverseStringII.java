package bsu.edu.cs699.ying.easy;

/**
 * https://leetcode.com/problems/reverse-string-ii/#/description
 * Created by yliu12 on 2017/7/17.
 * <p>
 * 60 / 60 test cases passed.
 * Status: Accepted
 * Runtime: 6 ms
 */
public class ReverseStringII {
    public String reverseStr(String s, int k) {
        char[] arr = s.toCharArray();
        int n = arr.length;
        int i = 0;
        while (i < n) {
            int j = Math.min(i + k - 1, n - 1);
            swap(arr, i, j);
            i += 2 * k;
        }
        return String.valueOf(arr);
    }

    private void swap(char[] arr, int l, int r) {
        while (l < r) {
            char temp = arr[l];
            arr[l++] = arr[r];
            arr[r--] = temp;
        }
    }
}
