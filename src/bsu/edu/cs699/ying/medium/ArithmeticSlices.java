package bsu.edu.cs699.ying.medium;

/** https://leetcode.com/problems/arithmetic-slices/#/description
 * Created by yliu12 on 6/29/2017.
 * 15 / 15 test cases passed.
 Status: Accepted
 Runtime: 2 ms
 */
public class ArithmeticSlices {
    public int numberOfArithmeticSlices(int[] A) {
        int result = 0,curRow = 0;
        if(A.length<3)
            return 0;

        for(int i=1 ;i<A.length-1;i++){
            if(A[i]-A[i-1]==A[i+1]-A[i]){
                curRow ++;
                result+=curRow;
            }else {
                curRow=0;
            }

        }

        return result;
    }
}
