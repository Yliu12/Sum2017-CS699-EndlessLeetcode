package bsu.edu.cs699.ying.easy;

import java.math.BigDecimal;

/**
 * Proble : https://leetcode.com/problems/sum-of-two-integers/#/description
 * Created by yliu12 on 6/26/2017.
 * 15/15 test cases passed.
 Status: Accepted
 Runtime: 19 ms
 */
public class SumofTwoIntegers {
    public int getSum(int a, int b) {
        BigDecimal A  = new BigDecimal(a+"");
        BigDecimal B  = new BigDecimal(b+"");

        return Integer.parseInt( A.add(B).toString());

    }
}
