package bsu.edu.cs699.ying.easy;

/** https://leetcode.com/problems/add-digits/#/description
 * Created by yliu12 on 6/29/2017.
 * 1101 / 1101 test cases passed.
 Status: Accepted
 Runtime: 2 ms
 */
public class AddDigits {
    public int addDigits(int num) {

        if(num  ==0){
            return 0;
        }
        if(num %9 ==0){
            return 9;
        }
        return num%9;
    }
}
