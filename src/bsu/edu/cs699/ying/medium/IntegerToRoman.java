package bsu.edu.cs699.ying.medium;

/**
 * https://leetcode.com/problems/integer-to-roman/#/description
 * Created by yliu12 on 2017/7/11.
 * 3999 / 3999 test cases passed.
 * Status: Accepted
 * Runtime: 95 ms
 */
public class IntegerToRoman {
    public static String intToRoman(int num) {
        String M[] = {"", "M", "MM", "MMM"};
        String C[] = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String X[] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String I[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        return M[num / 1000] + C[(num % 1000) / 100] + X[(num % 100) / 10] + I[num % 10];
    }
}
