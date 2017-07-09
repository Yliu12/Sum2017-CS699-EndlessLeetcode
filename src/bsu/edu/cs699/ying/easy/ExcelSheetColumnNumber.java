package bsu.edu.cs699.ying.easy;

/**
 * https://leetcode.com/problems/excel-sheet-column-number/#/description
 * Created by yliu12 on 2017/7/5.
 * 1000 / 1000 test cases passed.
 Status: Accepted
 Runtime: 3 ms
 */
public class ExcelSheetColumnNumber {
    public int titleToNumber(String s) {
        int total = 0;
        char[] chars = s.toCharArray();
        for (int i=0;i<chars.length;i++ ){
            total += ((int) chars[chars.length-i-1] - 65)*Math.pow(26,i);
        }
        return total;
    }
}
