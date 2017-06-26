package bsu.edu.cs699.ying.easy;

/**
 * Number Complement https://leetcode.com/problems/number-complement/#/description
 *
 149 / 149 test cases passed.
 Status: Accepted
 Runtime: 10 ms
 * Created by yliu12 on 2017/5/26.
 *
 * Note:
 * Saw answer
 * https://leetcode.com/problems/number-complement/#/solutions
 */
public class NumberComplement
{
        public int findComplement(int num) {

            return ~num & ((Integer.highestOneBit(num) << 1) - 1);



    }
    public static void main(String[] args){
        NumberComplement ks = new NumberComplement();
        System.out.println(ks.findComplement(2));


    }

}
